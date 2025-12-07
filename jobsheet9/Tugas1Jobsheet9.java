import java.util.Scanner;

public class Tugas1Jobsheet9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      double nilaiRata, total = 0;
      int tertinggi=0, terendah=100;


      System.out.print("Input jumlah Mahasiswa : ");
      int jumlahNilaiInput = sc.nextInt();

      int nilaiMhs [] = new int [jumlahNilaiInput];

      for (int i = 0; i < jumlahNilaiInput; i++){

        System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+ ":");
        nilaiMhs[i] = sc.nextInt();

        total += nilaiMhs[i];

        if (i == 0) {
          tertinggi = nilaiMhs[i];
          terendah = nilaiMhs[i];
        }else {

          if (nilaiMhs[i] > tertinggi) {
            tertinggi = nilaiMhs[i];
          }
          if (nilaiMhs[i] < terendah) {
            terendah = nilaiMhs[i];
          }

        }

      }

      nilaiRata = total / jumlahNilaiInput;

      System.out.println("\n-----------------------");
      System.out.println("Rata-rata Nilai : " + nilaiRata);
      System.out.println("Nilai Tertinggi : " + tertinggi);
      System.out.println("Nilai Terendah : " + terendah);
      System.out.println("-------------------------");

      System.out.print("Daftar Nilai: ");
      for ( int i = 0; i < jumlahNilaiInput; i++) {
        System.out.print(nilaiMhs[i] + " ");
      }  
    }

}
