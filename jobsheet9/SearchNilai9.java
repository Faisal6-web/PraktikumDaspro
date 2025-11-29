public class SearchNilai9 {
    public static void main(String[] args) {
        int[] ArrayNilai = {80, 85, 78, 96, 90, 82, 86};
        int key = 90;
        int hasil = 0;

        for ( int i = 0; i < ArrayNilai.length; i++) {
            if (key == ArrayNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        System.out.println("Nilai "+ key+ "ketemu di indeks ke-"+ hasil);
        System.out.println();
    }
}
