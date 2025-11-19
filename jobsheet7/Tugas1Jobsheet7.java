import java.util.Scanner;

public class Tugas1Jobsheet7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

    double Tiket=50.000, totalTiket, totalPenjualan, i;
    String namaPenonton ;
    i=1;
    if (Tiket > 10 ) {
        System.out.println("Penonton Mendapat Diskon 15%" + Tiket*15/100);
    }else if (Tiket > 4) {
        System.out.println("Penonton Mendapat Diskon 10%" + Tiket*10/100);
    }else 
     System.out.println("Penonton Tidak Mendapat Diskon");

    do {
        System.out.println("Masukkan Nama Penonton Ke-" + i + ":");
        namaPenonton = sc.nextLine();
        System.out.println("Masukkan jumlah Tiket yang dibeli" + Tiket);
        Tiket = sc.nextDouble();
        totalTiket = Tiket ;
        i++;
    }while (true) ;
        
    }

    }

