package tugas;
import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public void tampilkanSemua() {
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println("NPM: " + m.getNpm() + " | Nama: " + m.getNama() + " | Nilai: " + m.getNilai());
        }
    }

    public double hitungRataRata() {
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) count++;
        }
        return count;
    }
}