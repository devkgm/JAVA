package com.devkim.ex1.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Scanner;

public class ClientController {
    public void start() throws Exception {
        Scanner sc = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8282);

        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;

        OutputStream outputStream = socket.getOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        while (true) {
            inputStreamReader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            String message = sc.nextLine();

            bufferedWriter.write(message + "\n\r");
            bufferedWriter.flush();
            if (message.equals("exit")) {
                break;
            }
            System.out.println("readLine");
            String readMessage = bufferedReader.readLine();
            System.out.println(readMessage);
        }
        sc.close();
        socket.close();

    }
}
