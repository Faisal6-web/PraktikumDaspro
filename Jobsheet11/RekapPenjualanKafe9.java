import java.util.Scanner;

public class RekapPenjualanKafe9 {
 static Scanner sc = new Scanner(System.in);

 static String [] menu = {"Kopi", " Teh", "Es Kelapa", "Roti Bakar", "Gorengan"};
 
public static void inputData (int [][] data ) {
    System.out.println("===== INPUT DATA PENJUALAN =====");

    for (int i = 0; i < data.length; i++) {
        System.out.println("Input untuk " + menu[i] + ":");

        for(int j = 0; j < data[i].length; j++) {
            System.out.print(" Hari ke-" + (j+1) + ":");
            data [i][j] = sc.nextInt();
        }
    }
}

public static void tampilanTabel (int [][] data) {
    System.out.println("\n==== REKAP DATA PENJUALAN ====");

    System.out.print("Menu\t\t");
    for (int h = 1; h <= 7; h++) {
        System.out.print("H-" + h + "\t");
    }
    System.out.println();

    for ( int i = 0; i < data.length; i++) {
        System.out.print(menu[i] +"\t\t");

        for (int j= 0; j < data[i].length; j++) {
            System.out.print(data[i][j] + "\t");
        }
        System.out.println();
    }
}

public static void menuTertinggi (int[][] data) {
    int maxPenjualan = 0;
    String bestSeller = "";

    for ( int i = 0; i < data.length; i++) {
        int totalBaris = 0;

        for ( int j = 0; j < data[i].length; j++) {
            totalBaris += data[i][j];
        }

        if ( totalBaris > maxPenjualan) {
            maxPenjualan = totalBaris;
            bestSeller = menu[i];

        }
    }

    System.out.println("\n>>> MENU BEST SELLER <<<");
    System.out.println("Menu: " + bestSeller+ "(Total: " + maxPenjualan +")");
}


public static void hitungRataRata (int [][] data) {
    System.out.println("\n==== RATA-RATA PENJUALAN ====");

    for (int i = 0; i < data.length; i++) {
        double total = 0;

        for (int j = 0; j < data[i].length; j++) {
            total += data[i][j];
        }

        double rata = total / 7;
        System.out.printf("%-15s : %.2f per hari\n",menu[i],rata);
    }
}


public static void main(String[] args) {
    int [][] dataPenjualan = new int [5][7];
    
    inputData(dataPenjualan);
    tampilanTabel(dataPenjualan);
    menuTertinggi(dataPenjualan);
    hitungRataRata(dataPenjualan);
}
}
