import java.util.Scanner;
public class BioskopWithSacnner9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String[][] penonton = new String[4][2];

    while (true) { 

        System.out.println("\n ---- MENU BIOSKOP ----");
        System.out.println("1. Input Data Penonton");
        System.out.println("2. Tampilkan Daftar Penonton");
        System.out.println("3. Exit");
        System.out.println("Pilih menu (1/2/3): ");
        menu = sc.nextInt();
        sc.nextLine();

        if (menu ==1) {
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();

        boolean kursiValid = false;
        while (!kursiValid) {
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();


            if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                System.out.println("Warning: Kursi tidak tersedia! Baris max 4, Kolom max 2.");
            }else if (penonton[baris - 1][kolom - 1] != null) {
                System.out.println("Warning: Kursi sudah terisi oleh penonton lain! Silahkan pilih kursi lain.");
            }else {
                penonton[baris - 1] [kolom - 1] = nama;
                System.out.println("Dara penonton berhasil disimpan.");
                kursiValid = true;
            }
        }

        }else if (menu == 2) {
            System.out.println("\n ---- DAFTAR PENONTON ----");
            for (int i = 0; i < penonton.length; i++){
                System.out.print("Baris ke-" + (i+1) + ":");

                for (int j = 0; j < penonton[i].length; j++) {
                    String isiKursi = penonton[i][j];
                    if (isiKursi == null) {
                        isiKursi = "***";
                    }
                    
                    if (j < penonton[i].length - 1) {
                            System.out.print(", ");
                    }
                }
                System.out.println();
            }

        }else if ( menu == 3) {
            System.out.println("Terima Kasih.");
            break;
        }else {
            System.out.println("Menu Tidak Valid!");
        }
    }
}
}
