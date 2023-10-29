import java.util.Scanner;
public class ArrayNilai15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = input.nextInt();
        }
        System.out.println("--------------------------------------");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] >=70 && nilaiAkhir[i] <= 100) {
        
                System.out.println("Mahasiswa ke-"+i+" lulus!");
            }
            else if (nilaiAkhir[i] <=69 && nilaiAkhir[i] <= 100){
                System.out.println("Mahasiswa ke-"+i+" tidak lulus!");
            }
            else {
                System.out.println("Maaf, nilai pada mahasiswa ke-"+i+" tidak terdeteksi, anda hanya bisa inputkan nilai 0-100, silahkan coba lagi!");
            }
            
        }
        
    }
}