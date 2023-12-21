package com.devkim.ex1.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.util.*;

public class ServerController {
    public void start() throws Exception {
        ServerSocket serverSocket = new ServerSocket(8282);
        ServerDAO serverDAO = new ServerDAO();
        ArrayList<String> arrayList = serverDAO.getWeathers();

        Socket socket = serverSocket.accept();
        System.out.println("클라이언트 연결 성공");

        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;

        OutputStream outputStream = socket.getOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        while (true) {

            inputStreamReader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(inputStreamReader);

            String message = bufferedReader.readLine();
            System.out.println(message);
            if (message.equals("1")) {
                System.out.println("출력");
                bufferedWriter.write(arrayList.toString() + "\n\r");

            }
            if (message.equals("exit")) {
                break;
            }
            bufferedWriter.write("1");
            bufferedWriter.flush();
        }
        socket.close();
        serverSocket.close();

    }
}
