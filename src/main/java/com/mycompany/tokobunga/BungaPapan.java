/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokobunga;

/**
 *
 * @author Lenovo
 */
public class BungaPapan extends Produk {
    private String ukuranPapan;
    private String ucapan;

    public BungaPapan(String nama, int harga, String ukuranPapan, String ucapan) {
        super(nama, harga);
        this.ukuranPapan = ukuranPapan;
        this.ucapan = ucapan;
    }

    @Override
    public int hitungHarga() {
        int tambahanUkuran;

        if (ukuranPapan.equalsIgnoreCase("Besar")) {
            tambahanUkuran = 100000;
        } else if (ukuranPapan.equalsIgnoreCase("Sedang")) {
            tambahanUkuran = 60000;
        } else {
            tambahanUkuran = 30000;
        }

        return getHarga() + tambahanUkuran;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis produk : Bunga Papan");
        System.out.println("Nama produk  : " + getNama());
        System.out.println("Ukuran papan : " + ukuranPapan);
        System.out.println("Ucapan       : " + ucapan);
        System.out.printf("Total harga  : Rp%,d%n", hitungHarga());
    }
}

