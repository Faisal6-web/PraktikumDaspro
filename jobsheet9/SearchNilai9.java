import java.util.Scanner;

public class SearchNilai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.println("Masukkan nilai yang akan diinput: ");
      int jumlahInput = sc.nextInt();

      int arrayNilai [] = new int[jumlahInput];
      int hasil = -1;

        for ( int i = 0; i < arrayNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ":");
            arrayNilai[i] = sc.nextInt();
        }
      System.out.print("Masukkan nilai yang ingin dicari: ");
      int key = sc.nextInt();

        for (int i = 0; i <arrayNilai.length; i++) {
            if (key == arrayNilai[i]) {
                hasil = i;
                break;
            }
        }

        System.out.println();

        if (hasil != -1) {
            System.out.println("Nilai " + key + "merupakan nilai Mahasiswa ke-" + (hasil+1));
        }else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
