import java.util.Scanner;

public class KafeDoWhile9 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
int kopi, teh, roti;
String namaPelanggga;
long hargaKopi=12000, hargaTeh=7000, hargaRoti=20000, totalHarga;

do { 
    System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar)");
    namaPelanggga = sc.nextLine();

    if (namaPelanggga.equalsIgnoreCase("batal")) {
        System.out.println("Transaksi doibatalkan.");
        break;
    }
    System.out.print("Jumlah Kopi");
    kopi = sc.nextInt();
    System.out.print("Jumlah Teh");
    teh = sc.nextInt();
    System.out.print("Jumlah Roti");
    roti = sc.nextInt();

    totalHarga = (kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
    System.out.println("Total yang harus dibayar: Rp" + totalHarga);
    sc.nextLine();
} while (true);
System.out.println("Semua transaksi selesai.");
 }    
}
