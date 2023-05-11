package Kuliah.StrukturData.Modul3.TugasPraktikum;

import java.util.Scanner;

import Kuliah.StrukturData.Modul2.LatihanPraktikum.Color;

public class Kegiatan1 {
    private static int maxSize;
    private static char[] stackArray;
    private static int top;

    public Kegiatan1(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public static void push(char obj) {
        if (top == maxSize - 1) {
            System.out.println("Kelebihan!");
        } else {
            stackArray[++top] = obj;
        }
    }

    public static char pop() {
        if (top == -1) {
            System.out.println("Kosong!");
            return ' ';
        } else {
            return stackArray[top--];
        }
    }

    public static String reverse(String input) {
        int inputLength = input.length();
        String reversedString = "";

        for (int i = 0; i < inputLength; i++) {
            char c = input.charAt(i);
            push(c);
        }

        while (top != -1) {
            char c = pop();
            reversedString += c;
        }

        return reversedString;
    }

    public static void main(String[] args) {
        new Kegiatan1(100);
        Scanner scanner = new Scanner(System.in);
        Color.getColor("Yellow", "Input: ");
        // System.out.print("Input: ");
        Color.getColor("Green", "Reversed: " + reverse(scanner.nextLine()));
        // System.out.println("Reversed: " + reverse(scanner.nextLine()));
    }
}
