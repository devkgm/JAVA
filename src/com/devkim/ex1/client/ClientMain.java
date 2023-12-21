package com.devkim.ex1.client;

public class ClientMain {
    public static void main(String[] args) {
        ClientController clientController = new ClientController();
        try {
            clientController.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
