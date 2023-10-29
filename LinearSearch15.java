import java.util.Scanner;

public class LinearSearch15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = input.nextInt();

        int[] arrayInt = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            arrayInt[i] = input.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = input.nextInt();

        int hasil = -1; // inisialisasi dengan -1 untuk menandakan key tidak ditemukan

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Key ada di posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan dalam array.");
        }
    }
}