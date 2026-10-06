/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tokobunga;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Tokobunga {
    static Produk[] data = new Produk[100];
    static int jumlah = 0;

    public static void cariProduk(String nama) {
        boolean ditemukan = false;
        
        for (int i = 0; i < jumlah; i++) {
            if (data[i].getNama().equalsIgnoreCase(nama)) {
                data[i].tampilkanInfo();
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Produk tidak ditemukan.");
        }
    }
      
    public static void cariProduk(int hargaMaksimal) {
        boolean ditemukan = false;
        
        for (int i = 0; i < jumlah; i++) {
            if (data[i].getHarga() <= hargaMaksimal) {
                data[i].tampilkanInfo();
                System.out.println();
                ditemukan = true;
            }
        }
        
        if (!ditemukan){
            System.out.println("Tidak ada produk dengan harga tersebut.");
        }
    }
    
    public static void simulasiProses(Produk produk) {
        System.out.println("\n=== SIMULASI PROSES ===");
        produk.tampilkanInfo();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=====================================");
            System.out.println("\n    SISTEM PENGELOLAAN TOKO BUNGA");
            System.out.println("\n=====================================");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Produk");
            System.out.println("3. Cari Produk");
            System.out.println("4. Total Produk");
            System.out.println("5. Simulasi Proses");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    if (jumlah >= data.length) {
                        System.out.println("Data produk sudah penuh.");
                        break;
                    }

                    System.out.println("\n=== TAMBAH PRODUK ===");
                    System.out.print("Nama produk: ");
                    String nama = input.nextLine();
                    System.out.print("Harga dasar: ");
                    int harga = input.nextInt();
                    input.nextLine();
                    
                    System.out.println("Jenis produk:");
                    System.out.println("1. Buket Bunga");
                    System.out.println("2. Buket Snack");
                    System.out.println("3. Bunga Papan");
                    System.out.print("Pilih jenis: ");
                    int jenis = input.nextInt();
                    input.nextLine();

                    if (jenis == 1) {
                        System.out.print("Jenis bunga: ");
                        String bunga = input.nextLine();
                        System.out.print("Jumlah bunga: ");
                        int jumlahBunga = input.nextInt();
                        input.nextLine();
                        
                        data[jumlah++] = new BuketBunga(nama, harga, bunga, jumlahBunga);
                        System.out.println("Buket bunga berhasil ditambahkan.");
                        
                    } else if (jenis == 2) {
                        System.out.print("Jumlah snack: ");
                        int jumlahSnack = input.nextInt();
                        input.nextLine();
                        System.out.print("Ukuran (Kecil/Besar): ");
                        String ukuran = input.nextLine();
                        
                        data[jumlah++] = new BuketSnack(nama, harga, jumlahSnack, ukuran);
                        System.out.println("Buket snack berhasil ditambahkan.");
                    
                    } else if (jenis == 3) {
                        System.out.print("Ucapan: ");
                        String ucapan = input.nextLine();
                        System.out.print("Ukuran: ");
                        String ukuran = input.nextLine();

                        data[jumlah++] = new BungaPapan(nama, harga, ucapan, ukuran);
                        System.out.println("Bunga papan berhasil ditambahkan.");
                        
                    } else {
                        System.out.println("Jenis produk tidak tersedia.");
                    }
                    break;

                case 2:
                    System.out.println("\n=== DATA PRODUK ===");
                    if (jumlah == 0) {
                        System.out.println("Belum ada produk.");
                    } else {
                        for (int i = 0; i < jumlah; i++) {
                            System.out.println("\nData ke-" + (i + 1));
                            data[i].tampilkanInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n=== CARI PRODUK ===");
                    if (jumlah == 0) {
                        System.out.println("Belum ada produk.");
                        break;
                    }
                    
                    System.out.println("1. Berdasarkan nama");
                    System.out.println("2. Berdasarkan harga maksimal");
                    System.out.print("Pilih: ");
                    int jenisCari = input.nextInt();
                    input.nextLine();
                    
                    if (jenisCari == 1) {
                    System.out.print("Masukkan nama produk: ");
                    String cari = input.nextLine();
                    cariProduk(cari);
                    } else if (jenisCari == 2) {
                        System.out.print("Masukkan harga maksimal: ");
                        int hargaMaks = input.nextInt();
                        input.nextLine();
                        cariProduk(hargaMaks);
                     } else {
                        System.out.println("Pilihan tidak tersedia.");
                    }
                    break;

                case 4:
                    System.out.println("\n=== TOTAL PRODUK ===");
                    System.out.println("Total produk: " + jumlah);
                    break;
                    
                case 5:
                    if (jumlah == 0) {
                        System.out.println("Belum ada produk.");
                    } else {
                        System.out.println("\n=== PILIH PRODUK UNTUK SIMULASI ===");
                        for (int i = 0; i < jumlah; i++) {
                            System.out.println((i + 1) + ". " + data[i].getNama());
                        }

                        System.out.print("Pilih nomor: ");
                        int nomor = input.nextInt();
                        input.nextLine();

                        if (nomor >= 1 && nomor <= jumlah) {
                            simulasiProses(data[nomor - 1]);
                        } else {
                            System.out.println("Nomor tidak tersedia.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("\nTerima kasih telah menggunakan Sistem Pengelolaan Toko Bunga.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak tersedia.");
            }
        } while (pilih != 6);

        input.close();
    }
}

