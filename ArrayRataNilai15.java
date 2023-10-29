import java.util.Scanner;
public class ArrayRataNilai15 {
    public static void main(String[] args) {
        int[] nilaiMhs = new int[10]; 
        double total = 0;
        double rata2; 
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        System.out.println("-------------------------------------");
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] >=71 && nilaiMhs[i] <= 100) {
        
                System.out.println("Mahasiswa ke-"+i+" lulus!");
            }
            else if (nilaiAkhir[i] <= 100){

            }
            else {
                System.out.println("Maaf, nilai pada mahasiswa ke-"+i+" tidak terdeteksi, anda hanya bisa inputkan nilai 0-100, silahkan coba lagi!");
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);

           }
}
