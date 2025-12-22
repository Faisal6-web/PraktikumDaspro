import java.util.Scanner;
public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah Mahasiswa :");
    int jumlahMhs = sc.nextInt();

    int [] nilaiMhs = new int[jumlahMhs];
    double totalLulus=0;
    double totalTidakLulus = 0;
    int Lulus = 0;
    int TidakLulus = 0;

    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1)+ ":");
        nilaiMhs[i] = sc.nextInt();
    }

    for (int i = 0; i < nilaiMhs.length; i++) {

        if (nilaiMhs[i] > 70) {
            totalLulus += nilaiMhs[i];
            Lulus++;
        }else {
            totalTidakLulus += nilaiMhs[i];
            TidakLulus++;
        }
            
        }

        double rataLulus = (Lulus > 0) ? (totalLulus/ Lulus) : 0;
        double rataTidakLulus = (TidakLulus > 0) ? (totalTidakLulus / TidakLulus) : 0;

        System.out.println("Rata-rata nilai Lulus =" + rataLulus);
        System.out.println("Rata-rata nilai Tidak Lulus =" + rataTidakLulus);
    }
}
  
