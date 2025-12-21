import java.util.Scanner;

public class NilaiMahasiswa9 {
   static Scanner sc = new Scanner(System.in);

public static void isianArray (int [] kumpulanNilai) {
    System.out.println("\n ------ INPUT DATA NILAI ------");

    for (int i=0; i < kumpulanNilai.length; i++) {
        System.out.println("Masukkan Nilai Mahasiswa ke-" + (i+1)+ ":");
        kumpulanNilai[i] = sc.nextInt();
    }
}

public static void tampilanArray (int[] kumpulanNilai) {
    System.out.println("---- DAFTAR NILAI MAHASISWA ----");

    for (int i = 0; i < kumpulanNilai.length; i++) {
        System.out.println("Mahasiswa ke-" + (i+1) + ":" + kumpulanNilai[i]);
    }
}

public static int hitungTotal (int [] kumpulanNilai){
    int total = 0;
    
    for (int i = 0; i < kumpulanNilai.length; i++) {
        total = total  + kumpulanNilai[i];
    }
    return total ;
}

public static void main(String[] args) {
    System.out.print("Masukkan Jumlah Mahasiswa :");
    int jumlahMhs = sc.nextInt();

    int [] dataNilai = new int [jumlahMhs];

    isianArray(dataNilai);

    tampilanArray(dataNilai);

    int hasilTotal = hitungTotal(dataNilai);

    System.out.println("\nTotal Nilai Seluruh Mahasiswa:" + hasilTotal);
}
}
