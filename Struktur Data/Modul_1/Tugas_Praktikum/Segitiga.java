package Tugas_Praktikum;

import java.util.Scanner;

/**
 * @author Moh Luthfi Zain
 */
public class Segitiga<T extends Number> {
    private T alas;
    private T tinggi;

    public Segitiga(T alas, T tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getResultAsInt() {
        int a = (int) alas;
        int t = tinggi.intValue();
        return (int) (0.5 * a * t);
    }

    public double getResultAsDouble() {
        double a = (double) alas;
        double t = tinggi.doubleValue();
        return 0.5 * a * t;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("===HITUNG LUAS SEGITIGA===");
            System.out.println("Mau menampilkan hasil luas dalam bentuk?");
            System.out.println("1. Hasil to Integer");
            System.out.println("2. Hasil to Double");
            System.out.print("Masukkan pilihan 1/2: ");
            int key = input.nextInt();
            System.out.println("Masukkan Nilai Alas Dan Tinggi Secara Berurutan (dipisahkan oleh tanda koma) : Example : 4,10");
            String[] nilai = input.next().split(",");

            switch (key) {
                case 1:
                    Segitiga<Integer> luasTipeInt = new Segitiga<Integer>(Integer.parseInt(nilai[0]), Integer.parseInt(nilai[1]));
                    System.out.println("Luas segitiga dalam integer " + luasTipeInt.getResultAsInt());
                    break;

                case 2:
                    Segitiga<Double> luasTipeDouble = new Segitiga<Double>(Double.parseDouble(nilai[0]), Double.parseDouble(nilai[1]));
                    System.out.println("Luas segitiga dalam double " + luasTipeDouble.getResultAsDouble());
                    break;

                default:
                    System.out.println("Masukkan pilihan yang benar");
                    break;
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            System.out.println("Angka Gan! ");
        }
    }
}