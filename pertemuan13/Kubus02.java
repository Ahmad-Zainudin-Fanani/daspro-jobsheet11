package pertemuan13;

import java.util.Scanner;

public class Kubus02 {
    // Atribut untuk panjang sisi kubus
    private double sisi;

    // Konstruktor untuk menginisialisasi panjang sisi kubus
    public Kubus02(double sisi) {
        this.sisi = sisi;
    }

    // Metode untuk menghitung volume atau luas permukaan berdasarkan jenis perhitungan
    public double hitung(String jenis) {
        if (jenis.equalsIgnoreCase("volume")) {
            return sisi * sisi * sisi; // Rumus: sisi³
        } else if (jenis.equalsIgnoreCase("luas permukaan")) {
            return 6 * sisi * sisi; // Rumus: 6 * sisi²
        } else {
            throw new IllegalArgumentException("Jenis perhitungan tidak valid! Gunakan 'volume' atau 'luas permukaan'.");
        }
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan panjang sisi kubus
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();  // Mengambil input panjang sisi kubus

        // Membuat objek Kubus02 dengan panjang sisi yang dimasukkan pengguna
        Kubus02 kubus = new Kubus02(sisi);

        // Menghitung volume
        double volume = kubus.hitung("volume");

        // Menghitung luas permukaan
        double luasPermukaan = kubus.hitung("luas permukaan");

        // Menampilkan hasil
        System.out.println("Volume Kubus: " + volume); // Output volume
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan); // Output luas permukaan
    }
}