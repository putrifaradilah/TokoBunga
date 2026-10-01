/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokobunga;

/**
 *
 * @author Lenovo
 */
public class BuketSnack extends Produk {
    private int jumlahSnack;
    private String ukuran;

    public BuketSnack(String nama, int harga, int jumlahSnack, String ukuran) {
        super(nama, harga);
        this.jumlahSnack = jumlahSnack;
        this.ukuran = ukuran;
    }

    @Override
    public int hitungHarga() {
        int tambahan = ukuran.equalsIgnoreCase("Besar") ? 20000 : 10000;
        return getHarga() + (jumlahSnack * 3000) + tambahan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis produk: Buket Snack");
        System.out.println("Nama produk: " + getNama());
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Jumlah snack: " + jumlahSnack);
        System.out.println("Total harga: Rp" + hitungHarga());
    }
}