package pertemuan13;
import java.util.*;


public class hitungTotalHarga02 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.println("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);
    }     
}