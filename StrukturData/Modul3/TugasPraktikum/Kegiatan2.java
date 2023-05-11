package Kuliah.StrukturData.Modul3.TugasPraktikum;

import java.util.Random;
import java.util.Scanner;

import Kuliah.StrukturData.Modul2.LatihanPraktikum.Color;
import Kuliah.StrukturData.Modul3.TugasPraktikum.ClassKegiatan2.*;

public class Kegiatan2 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;

            while (choice != 5) {
                Color.getColor("Blue", "=== Menu ===\n");
                Color.getColor("Purple", "[1] Daftar\n");
                Color.getColor("Purple", "[2] Verifikasi\n");
                Color.getColor("Purple", "[3] Test\n");
                Color.getColor("Purple", "[4] List\n");
                Color.getColor("Purple", "[5] Keluar\n");
                Color.getColor("Yellow", "[*] Pilih : ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        Color.getColor("Purple", "\n=== Daftar ===\n");
                        Color.getColor("Yellow", "[*] Masukkan nama mahasiswa: ");
                        String name = scanner.next();
                        queue.enqueue(name);
                        Color.getColor("Green", "Mahasiswa dengan nama " + name + " berhasil didaftarkan.\n\n");
                        break;
                    case 2:
                        Color.getColor("Purple", "\n=== Verifikasi ===\n");
                        if (!queue.isEmpty()) {
                            Color.getColor("Yellow", "[*] Masukkan nama mahasiswa: ");
                            String nameVerifikasi = scanner.next();
                            if (nameVerifikasi.equals(queue.peek())) {
                                Color.getColor("Green",
                                        "Mahasiswa dengan nama " + nameVerifikasi + " berhasil diverifikasi.\n\n");
                            } else {
                                Color.getColor("Red",
                                        "Verifikasi tidak dapat dilakukan. Mohon urutkan sesuai antrian.\n\n");
                            }
                        } else {
                            Color.getColor("Red", "Belum ada yang mendaftar.");
                        }
                        break;
                    case 3:
                        Color.getColor("Purple", "\n=== Test ===\n");
                        Random random = new Random();
                        int nilaiRandom = random.nextInt(2);
                        if (!queue.isEmpty()) {
                            if (nilaiRandom == 1) {
                                Color.getColor("Green",
                                        "Mahasiswa dengan nama " + queue.peek() + " lolos seleksi.\n\n");
                            } else {
                                Color.getColor("Red",
                                        "Mahasiswa dengan nama " + queue.peek() + " tidak lolos seleksi.\n\n");
                            }
                            queue.dequeue();
                        } else {
                            Color.getColor("Red", "Belum ada yang mendaftar.");
                        }
                        break;
                    case 4:
                        Color.getColor("Purple", "\n=== List ===\n");
                        Color.getColor("Green", "Daftar mahasiswa yang sudah daftar : " + queue.size() + " Data\n");
                        queue.displayQueue();
                        break;
                    case 5:
                        System.out.println("Terima kasih!");
                        break;
                    default:
                        Color.getColor("Red", "Pilihan tidak valid.\n\n");
                }
            }
        }
    }
}