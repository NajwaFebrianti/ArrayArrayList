/* Nama: [Najwa Febrianti]
   NPM: [2410010335] */
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // 4. Array untuk daftar mata kuliah
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Struktur Data", "Basis Data"};
        System.out.println("Daftar Mata Kuliah:");
        for(String mk : mataKuliah) System.out.println("- " + mk);

        // Pengelolaan Mahasiswa
        KelasKuliah kelas = new KelasKuliah();
        kelas.tambahMahasiswa(new Mahasiswa("Najwa Febrianti", "2410010335", 100));
        kelas.tambahMahasiswa(new Mahasiswa("Siti Badriah", "2410010102", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Andi Cobra", "2410010103", 75));
        kelas.tambahMahasiswa(new Mahasiswa("Dewi Persik", "2410010104", 45));
        kelas.tambahMahasiswa(new Mahasiswa("Roben Onsu", "2410010105", 80));

        System.out.println("\nDaftar Mahasiswa:");
        kelas.tampilkanSemua();

        // 5. Rata-rata dan jumlah lulus
        System.out.println("\nRata-rata Nilai: " + kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());

        // 6. Menambah 1 mahasiswa baru
        System.out.println("\nMenambahkan mahasiswa baru: Fajar SadBoy");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar SadBoy", "2410010106", 70));
        System.out.println("Jumlah data mahasiswa terbaru: " + 6); // Seharusnya pakai method size jika ditambah di kelas
    }
}