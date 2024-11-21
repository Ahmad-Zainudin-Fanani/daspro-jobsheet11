package pertemuan13;
import java.util.Scanner;
public class managerCafe02 {
        // Data penjualan yang disesuaikan dengan jumlah menu dan hari
        static int[][] penjualan;
        static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    
        // Fungsi untuk memasukkan data penjualan
        public static void inputPenjualan(Scanner scanner, int jumlahMenu, int jumlahHari) {
            penjualan = new int[jumlahMenu][jumlahHari];
    
            for (int i = 0; i < jumlahMenu; i++) {
                System.out.println("\nMasukkan data penjualan untuk " + menu[i] + ":");
                for (int j = 0; j < jumlahHari; j++) {
                    penjualan[i][j] = getInputPenjualan(i, j, scanner);
                }
            }
        }
    
        // Fungsi untuk memastikan input valid
        private static int getInputPenjualan(int i, int j, Scanner scanner) {
            int input;
            while (true) {
                System.out.print("Penjualan " + menu[i] + " hari ke-" + (j + 1) + ": ");
                if (scanner.hasNextInt()) {
                    input = scanner.nextInt();
                    if (input >= 0) {
                        return input;
                    } else {
                        System.out.println("Masukkan jumlah penjualan yang valid (harus lebih dari atau sama dengan 0).");
                    }
                } else {
                    System.out.println("Masukkan angka yang valid.");
                    scanner.next(); // Clear invalid input
                }
            }
        }
    
        // Fungsi untuk menampilkan seluruh data penjualan
        public static void tampilkanPenjualan(int jumlahHari) {
            System.out.println("\nData Penjualan Selama " + jumlahHari + " Hari:");
            System.out.printf("%-15s", "Menu");
            for (int i = 0; i < jumlahHari; i++) {
                System.out.printf("Hari %d   ", i + 1);
            }
            System.out.println();
            System.out.println("---------------------------------------------------------------");
    
            for (int i = 0; i < penjualan.length; i++) {
                System.out.printf("%-15s", menu[i]);
                for (int j = 0; j < jumlahHari; j++) {
                    System.out.printf("%-10d", penjualan[i][j]);
                }
                System.out.println();
            }
        }
    
        // Fungsi untuk menampilkan menu dengan penjualan tertinggi
        public static void menuPenjualanTertinggi() {
            int maxPenjualan = -1;
            String menuTertinggi = "";
            for (int i = 0; i < penjualan.length; i++) {
                int totalPenjualan = hitungTotalPenjualan(i);
                if (totalPenjualan > maxPenjualan) {
                    maxPenjualan = totalPenjualan;
                    menuTertinggi = menu[i];
                }
            }
            System.out.println("\nMenu dengan Penjualan Tertinggi: " + menuTertinggi + " dengan total penjualan: " + maxPenjualan);
        }
    
        // Fungsi untuk menghitung total penjualan per menu
        private static int hitungTotalPenjualan(int menuIndex) {
            int total = 0;
            for (int i = 0; i < penjualan[menuIndex].length; i++) {
                total += penjualan[menuIndex][i];
            }
            return total;
        }
    
        // Fungsi untuk menampilkan rata-rata penjualan per menu
        public static void rataRataPenjualan(int jumlahHari) {
            System.out.println("\nRata-rata Penjualan untuk Setiap Menu:");
            for (int i = 0; i < penjualan.length; i++) {
                int totalPenjualan = hitungTotalPenjualan(i);
                double rataRata = (double) totalPenjualan / jumlahHari;
                System.out.printf("%-15s: %.2f\n", menu[i], rataRata);
            }
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Meminta input jumlah menu dan hari
            System.out.print("Masukkan jumlah menu yang tersedia: ");
            int jumlahMenu = scanner.nextInt();
            System.out.print("Masukkan jumlah hari yang tersedia: ");
            int jumlahHari = scanner.nextInt();
            scanner.nextLine();  // Clear newline after nextInt()
    
            // Memasukkan data penjualan
            inputPenjualan(scanner, jumlahMenu, jumlahHari);
    
            // Menampilkan data penjualan
            tampilkanPenjualan(jumlahHari);
            menuPenjualanTertinggi();
            rataRataPenjualan(jumlahHari);
        }
    }
    