package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan2 {
    public static void main(String[] args) {
        // 1. ArrayList Daftar Belanja
        System.out.println("--- Soal 1: Daftar Belanja ---");
        ArrayList<String> daftarBelanja = new ArrayList<>();
        daftarBelanja.add("Apel");
        daftarBelanja.add("Jeruk");
        daftarBelanja.add("Mangga");
        daftarBelanja.add("Pisang");
        
        // Hapus item ke-2 (indeks 1)
        daftarBelanja.remove(1);
        
        System.out.println("Isi list belanja akhir: " + daftarBelanja);
        System.out.println("Jumlah akhir item: " + daftarBelanja.size());
        System.out.println();

        // 2. ArrayList Integer (Mencari nilai terbesar)
        System.out.println("--- Soal 2: Nilai Terbesar ArrayList ---");
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(12);
        angka.add(45);
        angka.add(78);
        angka.add(34);
        angka.add(56);
        
        int terbesar = angka.get(0);
        for (int i = 1; i < angka.size(); i++) {
            if (angka.get(i) > terbesar) {
                terbesar = angka.get(i);
            }
        }
        System.out.println("Nilai terbesar dalam list: " + terbesar);
        System.out.println();

        // 3. ArrayList Nama (startsWith 'A')
        System.out.println("--- Soal 3: Nama berawalan huruf A ---");
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Amanda");
        daftarNama.add("Cici");
        daftarNama.add("Asep");
        daftarNama.add("Deni");
        
        System.out.println("Nama yang diawali huruf A:");
        for (String nama : daftarNama) {
            // Menggunakan startsWith untuk mengecek huruf awal
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}