package pertemuan13;
import java.util.Scanner;

public class PengunjungCafe02 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        // Menggunakan for-each loop untuk iterasi namaPengunjung
        for (String nama : namaPengunjung) {
            System.out.println("-" + nama);
        }
    }
    
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
}
