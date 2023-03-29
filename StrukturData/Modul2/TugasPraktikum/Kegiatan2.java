package Kuliah.StrukturData.Modul2.TugasPraktikum;

import Kuliah.StrukturData.Modul2.TugasPraktikum.ClassKegiatan2.LinkedList;

public class Kegiatan2 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(7);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(3);

        System.out.println("Before:");
        linkedList.printList();
        
        System.out.println("\nAfter:");
        linkedList.sort();
    }
}