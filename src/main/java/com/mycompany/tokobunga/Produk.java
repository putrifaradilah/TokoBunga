/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokobunga;

/**
 *
 * @author Lenovo
 */
public class Produk {
    private String nama;
    private int harga;

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int hitungHarga() {
        return harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama produk: " + nama);
        System.out.println("Harga: Rp" + harga);
    }
}

