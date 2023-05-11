package Kuliah.StrukturData.Modul4.TugasPraktikum;

import java.util.HashMap;
import java.util.Map;

import Kuliah.StrukturData.Modul2.LatihanPraktikum.Color;

public class DataPraktikan {
    HashMap<String, String> tabelData = new HashMap<String, String>();
    HashMap<String, String> tabelSesiLogin = new HashMap<String, String>();
    int nomor;
    boolean verifikasi;

    public boolean tambahData(String nimPraktikan, String namaAsisten) {
        if (nimPraktikan.matches("^IF\\d{15}$") && !tabelData.containsKey(nimPraktikan)) {
            tabelData.put(nimPraktikan, namaAsisten);
            Color.getColor("Green", "Data berhasil ditambahkan!\n\n");
            verifikasi = true;
        } else {
            Color.getColor("Red", "Format NIM salah!\n\n");
            verifikasi = false;
        }
        return verifikasi;
    }

    public void tampil() {
        nomor = 1;
        Color.getColor("Yellow", "Total Data yang Tersimpan : " + tabelData.size() + "\n");
        Color.getColor("Green", "No.\tNIM\t\t\tNama Asisten\n");
        for (String i : tabelData.keySet()) {
            Color.getColor("Green", "[" + (nomor++) + "]\t" + i + "\t" + tabelData.get(i) + "\n");
        }
    }

    public void listNimPraktikan() {
        nomor = 1;
        for (String nim : tabelData.keySet()) {
            Color.getColor("Green", (nomor++) + ". " + nim + "\n");
        }
    }

    public void listNamaAsisten() {
        nomor = 1;
        for (String nama : tabelData.values()) {
            Color.getColor("Green", (nomor++) + ". " + nama + "\n");
        }
    }

    public int totalEmail() {
        return tabelData.size();
    }

    public boolean hapusData(String nimPraktikan, String namaAsisten) {
        if (!nimPraktikan.isEmpty() && !namaAsisten.isEmpty()) {
            tabelData.remove(nimPraktikan, namaAsisten);
            verifikasi = true;
        } else {
            verifikasi = false;
        }
        return verifikasi;
    }

    public void editData(String nimPraktikan, String namaAsisten) {
        if (tabelData.containsKey(nimPraktikan)) {
            tabelData.remove(nimPraktikan, namaAsisten);
            tabelData.put(nimPraktikan, namaAsisten);
        } else {
            Color.getColor("Red", "\nData Tidak ada!");
        }
    }

    public void search(String namaAsisten) {
        System.out.println("Daftar NIM Praktikan dengan Nama Asisten " + namaAsisten + ":");
        for (Map.Entry<String, String> entry : tabelData.entrySet()) {
            if (entry.getValue().equals(namaAsisten)) {
                System.out.println(entry.getKey());
            }
        }

    }

    public void dataEmail() {
        tabelSesiLogin.put("zain@umm.ac.id", "1");
    }

    public boolean loginEmail(String Email, String Password) {
        if (Email.matches("(.*)@umm.ac.id") && tabelSesiLogin.containsValue(Password)
                && tabelSesiLogin.containsKey(Email)) {
            verifikasi = true;
        } else {
            verifikasi = false;
        }
        return verifikasi;
    }
}