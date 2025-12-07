import java.util.Scanner;

public class Tugas3Jobsheet8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Cabang kafe"+ ":");
        int jumlahCabang = sc.nextInt();

        System.out.println("==== Input Penjualan Per Cabang ====");

        int totalPelangganSemuaCabang = 0;
        int totalSemuaItem = 0;


        for (int i =1; i<=jumlahCabang; i++) {
            System.out.print("\n--- Cabang "+ i + " ---");

            System.out.print("Jumlah Pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemCabang =0;
          

            for ( int j = 1; j<=jumlahPelanggan; j++) {

                System.out.print(" Pelanggan "+ j + " memesan berapa item? ");
                int jumlahItem = sc.nextInt();

                totalItemCabang += jumlahItem;
            }

            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + "orang");
            System.out.println("- Item terjual: " + totalItemCabang+ " item");

            totalPelangganSemuaCabang += jumlahPelanggan;
            totalSemuaItem += totalItemCabang;
        }

        System.out.println("\n===========================================");
        System.out.println(" Total seluruh Cabang: ");
        System.out.println("Pelanggan : " + totalPelangganSemuaCabang+ " orang");
        System.out.println(" Item terjual : " + totalSemuaItem + " item");
     
    }
}
