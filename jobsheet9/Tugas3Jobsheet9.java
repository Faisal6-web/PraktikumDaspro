import java.util.Scanner;

public class Tugas3Jobsheet9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String menuKafe [] = {"Nasi Goreng", "Mie Goreng", " Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
       
       System.out.print("Masukkan Menu yang dicari : ");
       String cari= sc.nextLine();

       boolean ditemukan = false;
       int posisi = -1;
       
       for (int i = 0; i<menuKafe.length; i++) {
            if (menuKafe[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                posisi = i;
                break;
            }
       }

       if(ditemukan) {
        System.out.println("Menu " + cari + "Tersedia");
       }else {
        System.out.println("Menu" + cari + "tidak tersedia dalam menu");
       }
       sc.close();
}
}
