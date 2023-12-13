package com.devkim.himart;

public class NoteBook extends Product {
    private String cpu;

    public NoteBook(String model, String brand, int price, String cpu) {
        this.setModel(model);
        this.setBrand(brand);
        this.setPrice(price);
        this.cpu = cpu;
    }

    public String getCpu() {
        return this.cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

}
