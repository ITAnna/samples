package com.mysamples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SampleWebServer {
    public static void main(String[] args) {
        try (ServerSocket myNewSocket = new ServerSocket(8080)) {
            System.out.println("get started");
            Socket mySocket = myNewSocket.accept();

           try(BufferedReader input = new BufferedReader
                   (new InputStreamReader
                           (mySocket.getInputStream(), StandardCharsets.UTF_8))){
               while (!input.ready()) {
                   System.out.println("ой, всё");
               }
               while (input.ready()){
                   System.out.println(input.readLine());
               }
           };

        } catch (IOException e) {
            e.printStackTrace();
        } ;


    }
}
