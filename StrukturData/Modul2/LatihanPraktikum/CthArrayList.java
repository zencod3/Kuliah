package Kuliah.StrukturData.Modul2.LatihanPraktikum;

import java.util.ArrayList;
import java.util.Scanner;

public class CthArrayList {
    private static ArrayList<String> data;

    public CthArrayList() {
        data = new ArrayList<String>();
    }

    public static void create(String obj) {
        data.add(obj);
    }

    public static String read(int index) {
        return data.get(index);
    }

    public static void update(int index, String obj) {
        if (data.get(index).equals(obj)) {
            data.set(index, obj);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public static void delete(int index) {
        data.remove(index);
    }

    public static void cek(String obj) {
        if (data.contains(obj)) {
            System.out.println("Sudah ada");
        } else {
            create(obj);
        }
    }

    public static void main(String[] args) {
        Color.getColor("Purple", "=== Modul 2 - ArrayList ===");
        CthArrayList cth = new CthArrayList();

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\n\n== Menu ==\n");
            System.out.println("[1] Create");
            System.out.println("[2] Read");
            System.out.println("[3] Update");
            System.out.println("[4] Delete");
            System.out.println("[0] Exit");
            int key = 1;

            while (key != 0) {
                System.out.print("\n[-] Masukkan pilihan: ");
                key = input.nextInt();
                switch (key) {
                    case 1:
                        System.out.println("== Create Data ==");
                        String userInput = "";
                        while (!userInput.equals("stop")) {
                            Color.getColor("Yellow", "[*] Masukkan input: ");
                            userInput = input.next();
                            cek(userInput);
                        }
                        Color.getColor("Red", "\n[!] Program dihentikan.\n");
                        delete(data.size() - 1);
                        break;

                    case 2:
                        Color.getColor("Purple", "\n== Read Data ==\n\n");
                        for (int i = 0; i < data.size(); i++) {
                            Color.getColor("Blue", "[+] Data pada index ");
                            System.out.println(i + " : " + read(i));
                        }
                        break;

                    case 3:
                        Color.getColor("Purple", "\n== Update Data ==\n\n");
                        System.out.print("[-] Masukkan index: ");
                        String[] index = input.next().split(",");
                        for (String data : index) {
                            Color.getColor("Green",
                                    "\n[-] Update data pada index ke-" + Integer.parseInt(data) + " : ");
                            String update = input.next();
                            update(Integer.parseInt(data), update);
                            
                            Color.getColor("Yellow",
                                    "[!] Data pada index ke-" + Integer.parseInt(data) + " berhasil diupdate.\n");
                        }
                        index = null;
                        break;

                    case 4:
                        Color.getColor("Purple", "\n== Delete Data ==\n\n");
                        System.out.print("[-] Masukkan index: ");
                        index = input.next().split(",");
                        for (String data : index) {
                            Color.getColor("Green",
                                    "\n[-] Delete data pada index ke-" + Integer.parseInt(data) + " : ");
                            delete(Integer.parseInt(data));
                            Color.getColor("Yellow",
                                    "[!] Data pada index ke-" + Integer.parseInt(data) + " berhasil dihapus.");
                        }
                        break;

                    default:

                        break;
                }
            }

        } catch (Exception e) {
            Color.getColor("Red", "[!] " + e.getMessage());
        }
    }
}
