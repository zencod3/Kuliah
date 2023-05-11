package Kuliah.StrukturData.Modul4.LatihanPraktikum;

import java.util.HashMap;
import java.util.Scanner;

import Kuliah.StrukturData.Modul2.LatihanPraktikum.Color;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Putri", "3H", "Struktur Data", 2020800));
        mhs.put("2", new Mahasiswa("Agus", "3I", "Basis Data", 2020012));
        mhs.put("3", new Mahasiswa("Arro", "3I", "Pemrograman", 2020672));

        Color.getColor("Yellow", "Masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null) {
            Color.getColor("Green", "Data Mahasiswa : " + data.nama + ", Kelas : " +
                    data.kelas + ", Mata Kuliah Praktikum : " + data.matkulPraktikum +
                    ", NIM : " + data.nim);
        }
    }
}