package pertemuan13;
import java.util.*;

public class hitungTotalHarga02 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHarga = 0;  // Total harga keseluruhan
        String kodePromo;

        System.out.println("\nMasukkan jumlah jenis menu yang ingin anda pesan: ");
        int jumlahMenu = sc.nextInt();

        // Loop untuk memasukkan beberapa menu yang ingin dipesan
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("\nMasukkan nomor menu yang ingin anda pesan ke-" + (i + 1) + ": ");
            int pilihanMenu = sc.nextInt();
            System.out.println("Masukkan jumlah item yang ingin dipesan untuk menu ke-" + (i + 1) + ": ");
            int banyakItem = sc.nextInt();

            totalHarga += hitungTotalHarga(pilihanMenu, banyakItem); // Menambahkan harga pesanan ke total keseluruhan
        }

        sc.nextLine(); // Consume newline after number input
        System.out.println("\nMasukkan kode promo (jika ada, ketik kosong jika tidak ada): ");
        kodePromo = sc.nextLine();

        // Cek apakah kodePromo valid dan beri diskon pada totalHarga
        if (kodePromo.equals("DISKON50")) {
            totalHarga = (int)(totalHarga * 0.5);  // Diskon 50%
            System.out.println("Anda mendapatkan diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            totalHarga = (int)(totalHarga * 0.7);  // Diskon 30%
            System.out.println("Anda mendapatkan diskon 30%");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid, tidak ada diskon.");
        }

        System.out.println("\nTotal harga untuk pesanan anda: Rp" + totalHarga);
    }     
}
