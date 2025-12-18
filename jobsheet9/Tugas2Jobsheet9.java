import java.util.Scanner;

public class Tugas2Jobsheet9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan:");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();


        String pesanan [] = new String [jumlahPesanan];
        int harga [] = new int[jumlahPesanan];
        double totalBiaya =0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i+1)+ ":");
            pesanan [i] = sc.nextLine();

            System.out.print("Masukkan harga" +pesanan[i]+ ":");
                harga [i] = sc.nextInt();
                sc.nextLine();

            totalBiaya = totalBiaya + harga[i];
            
        }

        System.out.println("==== Daftar Pesanan ====");
        for (int i = 0; i<jumlahPesanan; i++) {
            System.out.println(pesanan[i] + ": Rp" + harga[i]);
        }

        System.out.println("totalBiaya: Rp" +totalBiaya );
        sc.close();
    }
}
