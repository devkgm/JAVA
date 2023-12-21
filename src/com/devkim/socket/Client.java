package com.devkim.socket;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public void start() throws Exception {
        Scanner sc = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8282);
        OutputStream out = socket.getOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(out);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        while (true) {
            System.out.println("서버로 보낼 메세지 입력");
            String message = sc.nextLine();

            bufferedWriter.write(message + "\n\r");
            // bufferedWriter.flush();

            if (message.equals("eixt")) {
                bufferedWriter.close();
                break;
            }

        }
        sc.close();
        socket.close();
    }
}
