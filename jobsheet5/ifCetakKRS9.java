package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("---CETAK KRS SIAKAD---");
    System.out.print("Apakah ukt sudah lunas? (true/false): ");
    boolean uktLunas = sc.nextBoolean();
if (uktLunas) {
    System.out.println("Pembayaran UKT Terverifikasi");
    System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
}
    }
}
