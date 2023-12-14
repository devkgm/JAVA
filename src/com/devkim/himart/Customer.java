package com.devkim.himart;

public class Customer {
    private int money;
    private int point;

    public Customer() {
        this.money = 2000;
        this.point = 10;
    }

    public void buy(Product product) {
        System.out.println(product.getModel() + "을 구매하겠습니다.");
        this.money -= product.getPrice();
        System.out.println("남은 돈 : " + this.money);
        System.out.println("포인트 : " + this.point);
    }
}
