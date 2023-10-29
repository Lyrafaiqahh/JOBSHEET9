import java.util.Scanner;

public class ArrayRataNilai15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahElemen = input.nextInt();

        int[] nilaiMhs = new int[jumlahElemen];
        double total = 0;
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int countLulus = 0;
        int countTidakLulus = 0;

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];

            if (nilaiMhs[i] >= 60) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }

        
        double rata2Lulus = (countLulus > 0) ? totalLulus / countLulus : 0;
        double rata2TidakLulus = (countTidakLulus > 0) ? totalTidakLulus / countTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
    }
}