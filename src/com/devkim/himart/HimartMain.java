package com.devkim.himart;

public class HimartMain {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook("갤럭시북3", "삼성", 200, "i7");
        Phone phone = new Phone("아이폰15", "애플", 200, 7);
        Tv tv = new Tv("OLED", "LG", 500);
        Customer customer = new Customer();
        customer.buy(phone);
    }
}
