package Kuliah.StrukturData.Modul2.LatihanPraktikum;

import java.util.LinkedList;
import java.util.Scanner;

public class CthLinkedList {
    public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);
        int pilihMenu;

        do {
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");
            System.out.print("Pilih Menu: ");
            pilihMenu = scanner.nextInt();

            switch (pilihMenu) {
                case 1:
                    System.out.print("Input data: ");
                    String newData = scanner.next();
                    data.add(newData);
                    System.out.println("Data Berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.println("Data:");
                    for (String d : data) {
                        System.out.println(d);
                    }
                    break;
                case 3:
                    System.out.print("Enter data to delete: ");
                    String delData = scanner.next();
                    boolean isRemoved = data.remove(delData);
                    if (isRemoved) {
                        System.out.println("Data berhasil dihapus!");
                    } else {
                        System.out.println("Data tidak ada!");
                    }
                    break;
                case 4:
                    System.out.print("Enter data to update: ");
                    String oldData = scanner.next();
                    System.out.print("Enter new data: ");
                    String updatedData = scanner.next();
                    int index = data.indexOf(oldData);
                    if (index == -1) {
                        System.out.println("Data tidak ada!");
                    } else {
                        data.set(index, updatedData);
                        System.out.println("Data berhasil dirubah!");
                    }
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Menu tidak ada!");
            }
        } while (pilihMenu != 5);

        scanner.close();
    }
}
