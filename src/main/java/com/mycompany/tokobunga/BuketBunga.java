/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokobunga;

/**
 *
 * @author Lenovo
 */
public class BuketBunga extends Produk {
    private String jenisBunga;
    private int jumlahBunga;

    public BuketBunga(String nama, int harga, String jenisBunga, int jumlahBunga) {
        super(nama, harga);
        this.jenisBunga = jenisBunga;
        this.jumlahBunga = jumlahBunga;
    }

    @Override
    public int hitungHarga() {
        return getHarga() + (jumlahBunga * 5000);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis produk: Buket Bunga");
        System.out.println("Nama produk: " + getNama());
        System.out.println("Jenis bunga: " + jenisBunga);
        System.out.println("Jumlah bunga: " + jumlahBunga);
        System.out.println("Total harga: Rp" + hitungHarga());
    }
}
