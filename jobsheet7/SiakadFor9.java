import java.util.Scanner;

public class SiakadFor9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    double nilai, tertinggi = 0, terendah=100;
    int JmlLulus = 0, JmlTidakLulus = 0;
    for (int i=1; i <= 10; i++){
        System.out.print("Masukkan nilai Mahasiswa ke-" + i +": ");
        nilai = sc.nextDouble();
        if ( nilai > tertinggi){
            tertinggi = nilai;
        }
        if ( nilai < terendah){
            terendah = nilai;
        }
        
        if ( nilai >=60){
            JmlLulus++;
        }else{
            JmlTidakLulus++;
        }
    }
    System.out.println("Nilai tertinggi" + tertinggi);
    System.out.println("Nilai terendah" + terendah);
    System.out.println("Jumlah Mahasiswa Lulus"  + JmlLulus);
    System.out.println("Jumlah Mahasiswa Tidak Lulus" + JmlTidakLulus);
    }
}