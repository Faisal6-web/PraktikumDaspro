import java.util.Scanner;

public class Kafe9 {
    public static void menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, "+ namaPelanggan+ "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("=====MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===============================");
        System.out.println("Silahkan pilih menu yang Anda Inginkan");  
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem,  String kodePromo) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
    
        System.out.println("====== PENGECEKAN PROMO =====");
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat! Anda mendapat diskon 50%");
            hargaTotal = hargaTotal / 2;
        }else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat! Anda mendapat diskon 30%");
            hargaTotal = hargaTotal - (hargaTotal*30/100);
        }else if (!kodePromo.isEmpty()) {
            System.out.println("kode invalid");
        }
         return hargaTotal;
    }

      
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu("Andi", true);

        int totalKeseluruhan = 0;
        String lanjut;


       do{
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        sc.nextLine();

        System.out.println("Masukkan kode promo (tekan enter jika tidak ada):");
        String kodePromo = sc.nextLine();

        int hargaTotal = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        totalKeseluruhan += hargaTotal;

        System.out.print("Apakah Anda ingin memesan menu lain? (y/t): ");
        lanjut = sc.nextLine();
       
    }while (lanjut.equalsIgnoreCase("y"));

    System.out.println("\n======================================");
    System.out.println("Total Keseluruhan pesanan Anda : Rp" + totalKeseluruhan);
   
}
    }