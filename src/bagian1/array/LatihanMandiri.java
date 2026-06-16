package bagian1.array;

public class LatihanMandiri {
    public static void main(String[] args) {
        // 1. Array Suhu Harian (bertipe double)
        System.out.println("--- Soal 1: Suhu Harian ---");
        double[] suhu = {28.5, 30.2, 26.8, 31.5, 29.0, 27.4};
        
        double tertinggi = suhu[0];
        double terendah = suhu[0];
        
        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > tertinggi) {
                tertinggi = suhu[i];
            }
            if (suhu[i] < terendah) {
                terendah = suhu[i];
            }
        }
        System.out.println("Suhu tertinggi: " + tertinggi);
        System.out.println("Suhu terendah: " + terendah);
        System.out.println();

        // 2. Array String Nama Hari (5 hari)
        System.out.println("--- Soal 2: Nama Hari > 5 Huruf ---");
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        for (String hari : namaHari) {
            if (hari.length() > 5) {
                System.out.println(hari + " (" + hari.length() + " huruf)");
            }
        }
        System.out.println();

        // 3. Menghitung angka genap
        System.out.println("--- Soal 3: Angka Genap ---");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;
        
        for (int nilai : angka) {
            if (nilai % 2 == 0) {
                jumlahGenap++;
            }
        }
        System.out.println("Jumlah angka genap di dalam array: " + jumlahGenap);
    }
}