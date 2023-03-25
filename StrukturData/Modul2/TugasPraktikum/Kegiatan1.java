package Kuliah.StrukturData.Modul2.TugasPraktikum;

import java.util.ArrayList;

public class Kegiatan1 {

    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<String>();
        hewan.add("Angsa");
        hewan.add("Bebek");
        hewan.add("Cicak");
        hewan.add("Domba");
        hewan.add("Elang");
        hewan.add("Gajah");

        // 1. Object kosong untuk menambahkan elemen
        ArrayList<String> kosong = new ArrayList<String>();

        // 2. Tambahkan elemen "Badak" dan "Bebek", hitung jumlah "Bebek", dan tampilkan
        // posisi index "Bebek"
        hewan.add("Badak");
        hewan.add("Bebek");
        int jumlahBebek = 0;
        for (int i = 0; i < hewan.size(); i++) {// Menampilkan ArrayList dari hewan
            if (hewan.get(i).equals("Bebek")) {// Jika dalam ArrayList dari hewan adalah bebek maka masuk percabangan if
                jumlahBebek++;
                if (jumlahBebek != 0) {// Jika jumlah bebek sama bernilai bukan nol maka masuk percabangan if
                    kosong.add(i + ""); // Kemudian index dari bebek ditambahkan pada ArrayList Kosong
                }
            }
        }
        System.out.print("Output No 2: \n[");
        for (int i = 0; i < hewan.size(); i++) {
            System.out.print(hewan.get(i) + ", ");
        }
        System.out.println("\b\b]\nJumlah Bebek: " + jumlahBebek);
        System.out.println("Posisi Index Bebek: " + kosong + "\n\n");

        // 3. Hapus posisi "Bebek" yang pertama
        hewan.remove("Bebek");
        System.out.print("Output No 3: \n[");
        for (int i = 0; i < hewan.size(); i++) {
            System.out.print(hewan.get(i) + ", ");
        }
        System.out.println("\b\b]\n\n");

        // 4. Tampilkan elemen pada index ke-0 dan ke-2, selanjutnya hapus index ke-0
        System.out.println("Output NO 4:");
        System.out.println("Elemen pada index ke-0: " + hewan.get(0));
        System.out.print("Elemen pada index ke-2: " + hewan.get(2) + "\n[");
        hewan.remove(0);
        for (int i = 0; i < hewan.size(); i++) {
            System.out.print(hewan.get(i) + ", ");
        }
        System.out.println("\b\b]\n\n");

        // 5. Ubah index ke-0 dari "Cicak" menjadi "Ular", selanjutnya tambahkan elemen
        // baru pada index ke-2 dengan "Itik"
        System.out.print("Output NO 5: \n[");
        hewan.set(0, "Ular");
        for (int i = 0; i < hewan.size(); i++) {
            System.out.print(hewan.get(i) + ", ");
        }
        System.out.print("\b\b]\n[");
        hewan.add(2, "Itik");
        for (int i = 0; i < hewan.size(); i++) {
            System.out.print(hewan.get(i) + ", ");
        }
        System.out.println("\b\b]\n\n");

        // 6. Hapus elemen di antara index ke-1 dan ke-5
        System.out.print("Output NO 6: \n[");
        hewan.subList(2, 5).clear();
        for (int i = 0; i < hewan.size(); i++) {
            System.out.print(hewan.get(i) + ", ");
        }
        System.out.println("\b\b]\n\n");

        // 7. Tampilkan elemen pertama dan terakhir
        System.out.println("Output NO 7:");
        System.out.println("Elemen pertama: " + hewan.get(0));
        System.out.println("Elemen terakhir: " + hewan.get(hewan.size() - 1) + "\n\n");

        // 8. Tampilkan jumlah elemen pada ArrayList
        System.out.println("Output NO 8:");
        System.out.println("Jumlah elemen: " + hewan.size() + "\n\n");

        // 9. Cari posisi index dari "Badak"
        System.out.println("Output No 9:");
        int posisiBadak = hewan.indexOf("Badak");
        System.out.println("Posisi index Badak: " + posisiBadak);
    }

}
