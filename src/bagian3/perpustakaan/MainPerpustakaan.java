package bagian3.perpustakaan; 
  
public class MainPerpustakaan { 
    public static void main(String[] args) { 
        // Membuat objek pengelola 
        Perpustakaan perpus = new Perpustakaan(); 
        // Membuat objek Buku lalu memasukkannya ke koleksi 
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tambahBuku(new Buku("Ayah", "Andrea Hirata", 2015)); 
        perpus.tampilkanKoleksi();
    
    // Uji Latihan 1
    perpus.pinjamBuku("Bumi Manusia");
    perpus.kembalikanBuku("Bumi Manusia");
    
    // Uji Latihan 3
    System.out.println();
    perpus.cariPenulis("Andrea Hirata");
}
}