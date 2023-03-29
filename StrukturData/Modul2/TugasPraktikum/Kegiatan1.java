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

        ArrayList<Integer> kosong = new ArrayList<Integer>();

        hewan.add("Badak");
        hewan.add("Bebek");
        int jumlahBebek = 0;
        for (int i = 0; i < hewan.size(); i++) {
            if (hewan.get(i).equals("Bebek")) {
                jumlahBebek++;
                if (jumlahBebek != 0) {
                    kosong.add(i);
                }
            }
        }
        System.out.println("Output No 2:");
        System.out.println(hewan);
        System.out.println("Jumlah Bebek: " + jumlahBebek);
        System.out.println("Posisi Index Bebek: " + kosong + "\n");

        hewan.remove("Bebek");
        System.out.println("Output No 3:");
        System.out.println(hewan + "\n");

        System.out.println("Output NO 4:");
        System.out.println("Elemen pada index ke-0: " + hewan.get(0));
        System.out.println("Elemen pada index ke-2: " + hewan.get(2));
        hewan.remove(0);
        System.out.println(hewan + "\n");

        System.out.println("Output NO 5:");
        hewan.set(0, "Ular");
        System.out.println(hewan);
        hewan.add(2, "Itik");
        System.out.println(hewan + "\n");

        System.out.println("Output NO 6:");
        hewan.subList(1, 5).clear();
        System.out.println(hewan + "\n");
        
        System.out.println("Output NO 7:");
        System.out.println("Elemen pertama: " + hewan.get(0));
        System.out.println("Elemen terakhir: " + hewan.get(hewan.size() - 1) + "\n");

        System.out.println("Output NO 8:");
        System.out.println("Jumlah elemen: " + hewan.size() + "\n");

        System.out.println("Output No 9:");
        int posisiBadak = hewan.indexOf("Badak");
        System.out.println("Posisi index Badak: " + posisiBadak);
    }

}
