package Kuliah.StrukturData.Modul2.LatihanPraktikum;

public class Color {
    public static void getColor(String color, String obj) {
        if (color == "Red") {
            System.out.print("\u001B[31m" + obj + "\u001B[0m");
        } else if (color == "Green") {
            System.out.print("\u001B[32m" + obj + "\u001B[0m");
        } else if (color == "Yellow") {
            System.out.print("\u001B[33m" + obj + "\u001B[0m");
        } else if (color == "Blue") {
            System.out.print("\u001B[34m" + obj + "\u001B[0m");
        } else if (color == "Purple") {
            System.out.print("\u001B[35m" + obj + "\u001B[0m");
        } else if (color == "Cyan") {
            System.out.print("\u001B[36m" + obj + "\u001B[0m");
        } else{
            System.out.print("Salah Cok");
        }
         
    }
}
