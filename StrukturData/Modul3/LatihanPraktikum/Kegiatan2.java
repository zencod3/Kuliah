package Kuliah.StrukturData.Modul3.LatihanPraktikum;

public class Kegiatan2 {
    private String[] elements;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Kegiatan2(int capacity) {
        elements = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
        this.capacity = capacity;
    }

    public void enqueue(String item) {
        if (size == capacity) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % capacity;
        elements[rear] = item;
        size++;
    }

    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        String item = elements[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public String peek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        return elements[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        Kegiatan2 q = new Kegiatan2(5);
        q.enqueue("satu");
        q.enqueue("dua");
        q.enqueue("tiga");
        q.enqueue("empat");

        System.out.println("remove : " + q.dequeue());
        System.out.println("element : " + q.peek());
        System.out.println("poll : " + q.dequeue());
        System.out.println("peek : " + q.peek());
    }
}
