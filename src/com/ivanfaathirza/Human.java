package com.ivanfaathirza;

public class Human extends LivingThing{
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void walk() {
        System.out.println(" sedang berjalan");
    }
}
