package com.devkim.himart;

public class Tv extends Product {
    private int inch;

    public Tv(String model, String brand, int price) {
        this.setModel(model);
        this.setBrand(brand);
        this.setPrice(price);
    }

    public int getInch() {
        return this.inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
}
