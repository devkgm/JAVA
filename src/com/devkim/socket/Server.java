package com.devkim.socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public void start() throws Exception {
		ServerSocket serverSocket = new ServerSocket(8282);
		Socket socket = serverSocket.accept();
		System.out.println("Client 연결 성공");
		InputStream in = socket.getInputStream();
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		while (true) {
			inputStreamReader = new InputStreamReader(in);
			bufferedReader = new BufferedReader(inputStreamReader);

			String message = bufferedReader.readLine();
			System.err.println(message);
			if (message.equals("exit"))
				break;
		}

		System.out.println("클라이언트와 연결됨");
		socket.close();
		serverSocket.close();
	}
}
