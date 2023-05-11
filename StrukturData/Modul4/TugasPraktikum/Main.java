package Kuliah.StrukturData.Modul4.TugasPraktikum;

import java.util.Scanner;

import Kuliah.StrukturData.Modul2.LatihanPraktikum.Color;

public class Main {
    public static void main(String[] args) {
        String inputNIM, inputAsisten, inputEmail, inputPassword;
        int pilihMenu = 0;
        boolean verifikasi = false;
        DataPraktikan obj = new DataPraktikan();
        try (Scanner inputData = new Scanner(System.in)) {
            do {
                Color.getColor("Blue", "==== LOGIN ====\n\n");
                Color.getColor("Cyan", "Email\t : ");
                inputEmail = inputData.nextLine();
                Color.getColor("Cyan", "Password : ");
                inputPassword = inputData.nextLine();
                obj.dataEmail();
                obj.loginEmail(inputEmail, inputPassword);
                if (obj.loginEmail(inputEmail, inputPassword) == true) {
                    Color.getColor("Green", "==== BERHASIL LOGIN SELAMAT DATANG ====\n\n");
                } else {
                    Color.getColor("Red", "GAGAL LOGIN\n\n");
                }
            } while (obj.loginEmail(inputEmail, inputPassword) == false);

            while (pilihMenu != 9) {
                Color.getColor("Blue", "==== MODUL 4 DATA PRAKTIKAN ====\n\n");
                Color.getColor("Purple", "[1] Tambah Data. \n");
                Color.getColor("Purple", "[2] Tampil Data.\n");
                Color.getColor("Purple", "[3] List NIM Praktikan.\n");
                Color.getColor("Purple", "[4] List Nama Asisten.\n");
                Color.getColor("Purple", "[5] Total Data.\n");
                Color.getColor("Purple", "[6] Hapus Data.\n");
                Color.getColor("Purple", "[7] Edit Data.\n");
                Color.getColor("Purple", "[8] Log Out.\n\n");
                Color.getColor("Yellow", "[*] Pilih : ");

                pilihMenu = inputData.nextInt();
                System.out.println();
                switch (pilihMenu) {
                    case 1:
                        while (verifikasi == false) {
                            Color.getColor("Blue", "Tambah Data ====\n\n");
                            Color.getColor("Purple", "Masukan NIM : ");
                            inputNIM = inputData.next();
                            Color.getColor("Purple", "Masukan nama asisten : ");
                            inputAsisten = inputData.next();
                            verifikasi = obj.tambahData(inputNIM, inputAsisten);
                        }
                        verifikasi = false;
                        break;
                    case 2:
                        Color.getColor("Blue", "==== Tampil Data ====\n\n");
                        obj.tampil();
                        break;
                    case 3:
                        Color.getColor("Blue", "==== List NIM Praktikan ====\n\n");
                        obj.listNimPraktikan();
                        break;
                    case 4:
                        Color.getColor("Blue", "==== List Nama Asisten ====\n\n");
                        obj.listNamaAsisten();
                        break;
                    case 5:
                        Color.getColor("Blue", "==== Total Data ====\n\n");
                        System.out.println("Total data yang tersimpan : " + obj.totalEmail());
                        break;
                    case 6:
                        Color.getColor("Blue", "==== Hapus Data ====\n\n");
                        System.out.print("Masukan NIM : ");
                        inputNIM = inputData.next();
                        System.out.print("Masukan nama asisten : ");
                        inputAsisten = inputData.next();
                        obj.hapusData(inputNIM, inputAsisten);
                        break;
                    case 7:
                        Color.getColor("Blue", "==== Edit Data ====\n\n");
                        System.out.print("Masukan NIM : ");
                        inputNIM = inputData.next();
                        System.out.print("Masukan nama asisten : ");
                        inputAsisten = inputData.next();
                        obj.editData(inputNIM, inputAsisten);
                        break;
                    case 8:
                        obj.search(inputData.next());
                    case 9:
                        Color.getColor("Red", "==== LOG OUT ====");
                        break;
                    default:
                        Color.getColor("Red", "==== PILIHAN TIDAK ADA ====\n\n\n");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}