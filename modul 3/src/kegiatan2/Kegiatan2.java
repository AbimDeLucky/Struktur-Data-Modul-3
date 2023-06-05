package kegiatan2;

import java.util.LinkedList;
import java.util.Scanner;

public class Kegiatan2 {

    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    private static class Queue {
        Node first, last;

        void enqueue(String data) {
            Node nodeBaru = new Node(data);
            if (first == null) {
                first = nodeBaru;
                last = nodeBaru;
            } else {
                last.next = nodeBaru;
                last = nodeBaru;
            }
        }

        void dequeue() {
            if (first == null) {
                System.out.println("Antrian kosong");
            } else {
                System.out.println("Pelanggan " + first.data + " telah membeli eskrim Mixue");
                first = first.next;
            }
        }

        String peek() {
            if (first == null) {
                return "Tidak ada pelanggan";
            } else {
                return first.data;
            }
        }

        boolean isEmpty() {
            return first == null;
        }

        int size() {
            int size = 0;
            Node current = first;
            while (current != null) {
                size++;
                current = current.next;
            }
            return size;
        }

        void display() {
            Node current = first;
            int i = 1;
            while (current != null) {
                System.out.println(i + ". " + current.data);
                current = current.next;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue eskrimQueue = new Queue();

        boolean session = true;
        int choice;
        String pelanggan;

        while (session) {
            System.out.println("=== Antrian Beli Eskrim Mixue ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses Pembelian");
            System.out.println("3. Jumlah Antrian");
            System.out.println("4. Pelanggan yang akan dilayani selanjutnya");
            System.out.println("5. Tampilkan Antrian");
            System.out.println("6. Keluar");

            System.out.print("Masukkan pilihan: ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    pelanggan = input.nextLine();
                    eskrimQueue.enqueue(pelanggan);
                    System.out.println("Pelanggan " + pelanggan + " telah ditambahkan ke dalam antrian");
                    break;
                case 2:
                    eskrimQueue.dequeue();
                    break;
                case 3:
                    System.out.println("Jumlah antrian saat ini: " + eskrimQueue.size());
                    break;
                case 4:
                    System.out.println("Pelanggan yang akan dilayani selanjutnya: " + eskrimQueue.peek());
                    break;
                case 5:
                    System.out.println("Semua Antrian:");
                    eskrimQueue.display();
                    break;
                case 6:
                    if (eskrimQueue.isEmpty()) {
                        System.out.println("Telah keluar dari sistem");
                        session = false;
                    } else {
                        System.out.println("Masih ada pelanggan yang belum dilayani!");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
            System.out.println();
        }
    }
}
