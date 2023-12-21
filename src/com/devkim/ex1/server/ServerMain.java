package com.devkim.ex1.server;

public class ServerMain {
    public static void main(String[] args) {
        ServerController sController = new ServerController();
        try {
            sController.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
