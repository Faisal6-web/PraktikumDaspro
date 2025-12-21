import java.util.Scanner;

public class RekapPenjualanKafe9 {
 static Scanner sc = new Scanner(System.in);
 
public static void inputData (int [][] data, String [] namaMenu) {
    System.out.println("===== INPUT DATA PENJUALAN =====");

    for (int i = 0; i < data.length; i++) {
        System.out.println("Input jumlah untuk menu: " + namaMenu[i] + ":");

        for(int j = 0; j < data[i].length; j++) {
            System.out.print(" Hari ke-" + (j+1) + ":");
            data [i][j] = sc.nextInt();
        }
    }
}

public static void tampilanTabel (int [][] data, String [] namaMenu) {
    System.out.println("\n==== REKAP DATA PENJUALAN ====");

    System.out.print("Menu\t\t");
    for (int h = 1; h <= data[0].length; h++) {
        System.out.print("H-" + h + "\t");
    }
    System.out.println();

    for ( int i = 0; i < data.length; i++) {
        System.out.print(namaMenu [i] +"\t\t");

        for (int j= 0; j < data[i].length; j++) {
            System.out.print(data[i][j] + "\t");
        }
        System.out.println();
    }
}

public static void menuTertinggi (int[][] data, String [] namaMenu) {
    int maxPenjualan = 0;
    String bestSeller = "";

    for ( int i = 0; i < data.length; i++) {
        int totalBaris = 0;

        for ( int j = 0; j < data[i].length; j++) {
            totalBaris += data[i][j];
        }

        if ( totalBaris > maxPenjualan) {
            maxPenjualan = totalBaris;
            bestSeller = namaMenu[i];

        }
    }

    System.out.println("\n>>> MENU BEST SELLER <<<");
    System.out.println("Menu: " + bestSeller+ "(Total: " + maxPenjualan +")");
}


public static void hitungRataRata (int [][] data, String[] namaMenu) {
    System.out.println("\n==== RATA-RATA PENJUALAN ====");

    for (int i = 0; i < data.length; i++) {
        double total = 0;

        for (int j = 0; j < data[i].length; j++) {
            total += data[i][j];
        }

        double rata = total / 7;
        System.out.printf("%-15s : %.2f per hari\n",namaMenu[i],rata);
    }
}


public static void main(String[] args) {
   System.out.println("------- SETUP KAFE -------");
    
   System.out.print("Masukkan Jumlah Menu: ");
   int jumlahMenu = sc. nextInt();

   System.out.print("Masukkan Jumlah Hari: ");
   int jumlahHari = sc.nextInt();

   sc.nextLine();

    String daftarMenu [] = new String[jumlahMenu];
    int dataPenjualan [][] = new int [jumlahMenu] [jumlahHari];


    System.out.println("\n----- INPUT NAMA MENU -----");
    for (int i = 0; i < jumlahMenu; i++){
        System.out.print("Nama Menu ke-" + (i+1) + ":");
        daftarMenu [i] = sc.nextLine();
    }

    inputData(dataPenjualan, daftarMenu);
    tampilanTabel(dataPenjualan, daftarMenu);
    menuTertinggi(dataPenjualan, daftarMenu);
    hitungRataRata(dataPenjualan, daftarMenu);
}
}
