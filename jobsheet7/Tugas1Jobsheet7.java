import java.util.Scanner;

public class Tugas1Jobsheet7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    int hargaTiket = 50000, totalTiketTerjual = 0;
    double totalUangMasuk = 0;
    System.out.println("=== Program Bioskop ===");
        
    while (true) {
        System.out.println("Masukkan nama Pembeli: ");
        String namaPembeli = sc.nextLine();
        System.out.print("Masukkan jumlah tiket yang dibeli:");
        int jumlahTiket = sc.nextInt();
        
        if(jumlahTiket == 0) {
            System.out.println("Transaksi Selesai. Hitung total tiket terjual");
            break;
        }
        
         if(jumlahTiket < 0) {
            System.out.println("Nilai Tidak valid, masukkan ulang");
            continue;
         }

         double totalHarga = jumlahTiket*hargaTiket;
         double diskon = 0;

         if(jumlahTiket >10 ) {
            diskon = totalHarga *15/100;
            System.out.println("Selamat anda mendapatkan diskon 15%");
         }else if (jumlahTiket >4 ) {
            diskon = totalHarga * 10/100;
            System.out.println("Selamat anda mendapatkan diskon 10%");
         }

         double bayar = totalHarga - diskon;
         System.out.println("Total bayar pelanggan ini: Rp" + bayar);
         System.out.println("---------------------------");

         totalTiketTerjual += jumlahTiket;
         totalUangMasuk += bayar;

         System.out.println(" \n=== Laporan Penjualan Harian ===");
         System.out.println(" Total Tiket Terjual :" + totalTiketTerjual);
         System.out.println(" Total Pendapat Sehari : Rp " + totalUangMasuk);
    }
    }
}

