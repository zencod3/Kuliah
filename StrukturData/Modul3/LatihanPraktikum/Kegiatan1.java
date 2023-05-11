package Kuliah.StrukturData.Modul3.LatihanPraktikum;

public class Kegiatan1 {
    private String[] elements;
    private int top;

    public Kegiatan1(int capacity) {
        elements = new String[capacity];
        top = -1;
    }

    public void push(String item) {
        if (top == elements.length - 1) {
            System.out.println("Stack overflow!");
            return;
        }
        top++;
        elements[top] = item;
    }

    public String pop() {
        if (top == -1) {
            System.out.println("Stack underflow!");
            return null;
        }
        String item = elements[top];
        top--;
        return item;
    }

    public String peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return null;
        }
        return elements[top];
    }

    public int search(String item) {
        for (int i = top; i >= 0; i--) {
            if (elements[i].equals(item)) {
                return top - i + 1;
            }
        }
        return -1;
    }

    public boolean empty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Kegiatan1 s = new Kegiatan1(5);

        s.push("satu");
        s.push("dua");
        s.push("tiga");

        System.out.println("Next : " + s.peek());
        s.push("empat");
        System.out.println(s.pop());
        s.push("lima");

        int count = s.search("satu");

        while (count != -1 && count > 1) {
            s.pop();
            count--;
        }
        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}