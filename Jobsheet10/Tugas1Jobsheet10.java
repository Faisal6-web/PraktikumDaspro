import java.util.Scanner;
public class Tugas1Jobsheet10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai survei");

        int survei [][] = new int [10][6];

        System.out.println("--- Input Data Survei ---");
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden-" + (i+1) + ":");

            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Pertanyaan-" + (j+1) + ":");
                survei [i][j] = sc.nextInt();
            }
                System.out.println();
        }

       
        System.out.println("\n--- Rata-rata Per Responden ---");
        for ( int i = 0; i<survei.length; i++){
           double totalPerResponden = 0;
           for (int j = 0; j<survei[i].length; j++){
            totalPerResponden += survei [i][j];
           }
           double total = totalPerResponden / survei[i].length;
           System.out.print("Rata-rata per Responden" + (i+1) + "=" + total);
        }


        System.out.println("\n--- Rata-rata Per Pertanyaan ---");
        for (int j = 0; j < 6; j++){
            double totalPerPertanyaan=0;
            for (int i = 0; i < 10; i++){
                totalPerPertanyaan += survei [i][j];
            }
            double total = totalPerPertanyaan / 10; 
            System.out.print("Rata-rata Pertanyaan" + (j+1) + "=" + total);
        }


        System.out.println("---- Rata-rata Keseluruhan ----");
        double totalKeseluruhan = 0;
        for (int i = 0; i < survei.length; i++) {
            for ( int j = 0; j < survei[i].length; j++){
                totalKeseluruhan += survei [i][j];
            }
        }
        double totalRata = totalKeseluruhan / (10*6);
         System.out.print("Rata-rata Total Keseluruhan: %.2f\n "+ totalRata);
    }
}