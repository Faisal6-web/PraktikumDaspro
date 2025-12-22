
import java.util.Scanner;

public class NilaiKelompok9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1, nilai;
        float totalNilai, rataNilai;

        float nilaiTertinggi = 0;
        int kelompokTerbaik = 0;
    while (i <=6) {
        System.out.println("Kelompok " + i);

        totalNilai = 0;
        for (int j =1; j<=5; j++) {
            System.out.print("Nilai dari kelompok Penilai " + j + ":");
            nilai = sc.nextInt();
            totalNilai += nilai;
        }

        rataNilai = totalNilai / 5;
        System.out.println("Nilai Rata-Rata" + rataNilai);
        
        if (rataNilai > nilaiTertinggi) {
            nilaiTertinggi = rataNilai;
            kelompokTerbaik = i;
        }
        i++;
    }
    System.out.println("-----------------------------------------");
    System.out.println("Nilai rata-rata tertinggi diperoleh oleh kelompok" + kelompokTerbaik);
    System.out.println("Dengan skor rata-rata: " +nilaiTertinggi);

    sc.close();
    }
}
