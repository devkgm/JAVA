package com.devkim.himart;

public class Phone extends Product {
    private int camera;

    public Phone(String model, String brand, int price, int camera) {
        this.setModel(model);
        this.setBrand(brand);
        this.setPrice(price);
        this.camera = camera;
    }

    public int getCamera() {
        return this.camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}
