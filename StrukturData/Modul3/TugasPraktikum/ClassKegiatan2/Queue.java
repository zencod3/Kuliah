package Kuliah.StrukturData.Modul3.TugasPraktikum.ClassKegiatan2;

import Kuliah.StrukturData.Modul2.LatihanPraktikum.Color;

public class Queue {
    Node head, tail;
    int size;

    public Queue() {
        head = tail = null;
        size = 0;
    }

    public void enqueue(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public String dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            String data = head.data;
            head = head.next;
            size--;
            if (isEmpty()) {
                tail = null;
            }
            return data;
        }
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        } else {
            return head.data;
        }
    }

    public void displayQueue() {
        int i = 1;
        Node tempNodeHead = head;
        while (tempNodeHead != null) {
            Color.getColor("Green", "[" + (i++) + "] " + tempNodeHead.data + "\n");
            tempNodeHead = tempNodeHead.next;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

