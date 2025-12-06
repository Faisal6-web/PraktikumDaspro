import java.util.Scanner;
public class Tugas2Jobsheet7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  durasi = 0, total=0, jenis;
        System.out.println("==== PROGRAM PEMBAYARAN PARKIR ====");

    do { 
        System.out.print("Masukkan Jenis Kendaraan (1 Mobil, 2 Motor, 0 keluar)" + ":");
        jenis = sc.nextInt();

        if (jenis == 1 || jenis == 2) {
            System.out.println(" Masukkan durasi parkir :");
            durasi = sc.nextInt();
        }

        if ( durasi > 5) {
        System.out.println("Terkena tarif tetap");
        total += 12500;
       }else if (jenis == 1) {
        System.out.println("Tarif masuk kategori mobil");
        total += durasi*3000;
       }else if ( jenis == 2) {
        System.out.println("Tarif masuk kategori motor");
        total += durasi*2000;
       
     System.out.println("Biaya parkir");

    }else if (jenis != 0) {

    }

    } while (jenis != 0);
        
    System.out.println("Total Pendapatan Parkir Harian: Rp" + total);
        
    }
}
