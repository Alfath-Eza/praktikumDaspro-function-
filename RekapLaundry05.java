
import java.util.Scanner;

public class RekapLaundry05 {

    static Scanner input = new Scanner(System.in);

    static String[] namaLayanan = {
        "Cuci Kering",
        "Cuci Setrika",
        "Setrika Saja",
        "Express"
    };


    static int[] harga = {6000, 8000, 5000, 12000};

    static String[] namaHari = {
        "Senin", "Selasa", "Rabu",
        "Kamis", "Jumat", "Sabtu"
    };

    static int[][] inputData(int jumlahLayanan, int jumlahHari) {

        int[][] data = new int[jumlahLayanan][jumlahHari];

        System.out.println("\n===== INPUT DATA CUCIAN =====");

        for (int i = 0; i < jumlahLayanan; i++) {

            System.out.println("\nLayanan: " + namaLayanan[i]);

            for (int j = 0; j < jumlahHari; j++) {

                System.out.print("Berat hari " + namaHari[j] + " (kg): ");
                data[i][j] = input.nextInt();
            }
        }

        return data;
    }

    static void tampilData(int[][] data) {

        System.out.println("\n================ REKAP DATA LAUNDRY ================");

        System.out.printf("%-18s", "Layanan");

        for (int j = 0; j < namaHari.length; j++) {
            System.out.printf("%8s", namaHari[j]);
        }

        System.out.println();

        for (int i = 0; i < data.length; i++) {

            System.out.printf("%-18s", namaLayanan[i]);

            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%8d", data[i][j]);
            }

            System.out.println();
        }
    }

    static int totalPerLayanan(int[][] data, int idxLayanan) {

        int total = 0;

        for (int j = 0; j < data[idxLayanan].length; j++) {
            total += data[idxLayanan][j];
        }

        return total;
    }

    static void layananTerbanyak(int[][] data) {

        int indeksTerbesar = 0;

        for (int i = 1; i < data.length; i++) {

            if (totalPerLayanan(data, i) >
                totalPerLayanan(data, indeksTerbesar)) {

                indeksTerbesar = i;
            }
        }

        System.out.println("\n===== LAYANAN TERBANYAK =====");

        System.out.println("Nama layanan: " + namaLayanan[indeksTerbesar]);

        System.out.println("Total cucian: "
                + totalPerLayanan(data, indeksTerbesar) + " kg");
    }

    static int hariTersibuk(int[][] data) {

        int indeksHari = 0;

        for (int j = 0; j < data[0].length; j++) {

            int totalHari = 0;

            for (int i = 0; i < data.length; i++) {
                totalHari += data[i][j];
            }

            int totalTerbesar = 0;

            for (int i = 0; i < data.length; i++) {
                totalTerbesar += data[i][indeksHari];
            }

            if (totalHari > totalTerbesar) {
                indeksHari = j;
            }
        }

        return indeksHari;
    }

    static void tampilPendapatan(int[][] data) {

        int totalPendapatan = 0;

        System.out.println("\n===== PENDAPATAN LAUNDRY =====");

        for (int i = 0; i < data.length; i++) {

            int totalBerat = totalPerLayanan(data, i);

            int pendapatan = totalBerat * harga[i];

            totalPendapatan += pendapatan;

            System.out.printf("%-18s Rp%,d%n",
                    namaLayanan[i], pendapatan);
        }

        System.out.printf("%-18s Rp%,d%n",
                "Total Pendapatan", totalPendapatan);
    }


    public static void main(String[] args) {

        int jumlahLayanan = 4;
        int jumlahHari = 6;


        int[][] data = inputData(jumlahLayanan, jumlahHari);

        tampilData(data);

        System.out.println("\n===== TOTAL PER LAYANAN =====");

        for (int i = 0; i < jumlahLayanan; i++) {

            System.out.println(namaLayanan[i] + ": "
                    + totalPerLayanan(data, i) + " kg");
        }


        layananTerbanyak(data);

        
        int indeks = hariTersibuk(data);

        System.out.println("\n===== HARI TERSIBUK =====");

        System.out.println("Hari: " + namaHari[indeks]);

       
        tampilPendapatan(data);

        input.close();
    }
}
