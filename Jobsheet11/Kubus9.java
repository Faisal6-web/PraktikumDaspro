public class Kubus9 {
    public static int hitungVolume (int sisi) {
        int hasilVolume = sisi * sisi * sisi;
        return  hasilVolume;
    }
    public static int hitungLuasPermukaan (int sisi) {
        int hasilLuasPermukaan = 6 * sisi * sisi;
        return hasilLuasPermukaan;
    }
        public static void cetakHasil () {
            System.out.println("==== Perhitungan Kubus ====");
            System.out.println("------------------------");
        }

        public static void main(String[] args) {
            cetakHasil();

            int sisi = 6;
            int volumeKubus = hitungVolume(sisi);

            int luasKubus = hitungLuasPermukaan(sisi);

            System.out.println("Sisi Kubus           :" + sisi);
            System.out.println("Volume Kubus         :" + volumeKubus);
            System.out.println("Luas Permukaan Kubus :" + luasKubus);
        }
    }

