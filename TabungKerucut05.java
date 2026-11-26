
import java.util.Scanner;

public class TabungKerucut05 {

    static double luasLingkaran(double r) {
        double luas = Math.PI * r * r;
        return luas;
    }

    static double volumeTabung(double r, double t) {
        double luasAlas = luasLingkaran(r);
        double volume = luasAlas * t;
        return volume;
    }

    static double luasPermukaanTabung(double r, double t) {
        double luas = 2 * Math.PI * r * (r + t);
        return luas;
    }

    static double volumeKerucut(double r, double t) {
        double volume = volumeTabung(r, t) / 3;
        return volume;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU BANGUN RUANG =====");
            System.out.println("1. Luas Lingkaran");
            System.out.println("2. Volume Tabung");
            System.out.println("3. Luas Permukaan Tabung");
            System.out.println("4. Volume Kerucut");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");

            pilihan = input.nextInt();

            double r, t;

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan jari-jari: ");
                    r = input.nextDouble();

                    System.out.println("Luas Lingkaran = " + luasLingkaran(r));
                    break;

                case 2:
                    System.out.print("Masukkan jari-jari: ");
                    r = input.nextDouble();

                    System.out.print("Masukkan tinggi: ");
                    t = input.nextDouble();

                    System.out.println("Volume Tabung = " + volumeTabung(r, t));
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari: ");
                    r = input.nextDouble();

                    System.out.print("Masukkan tinggi: ");
                    t = input.nextDouble();

                    System.out.println("Luas Permukaan Tabung = "+ luasPermukaanTabung(r, t));
                    break;

                case 4:
                    System.out.print("Masukkan jari-jari: ");
                    r = input.nextDouble();

                    System.out.print("Masukkan tinggi: ");
                    t = input.nextDouble();

                    System.out.println("Volume Kerucut = " + volumeKerucut(r, t));
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 0);

        input.close();
    }
}
