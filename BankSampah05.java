
import java.util.Scanner;

public class BankSampah05 {

 
    static Scanner input = new Scanner(System.in);

    static double[] inputSetoran(int n) {

        double[] setoran = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan berat setoran nasabah ke-" + (i + 1) + " (kg): ");
            setoran[i] = input.nextDouble();
        }

        return setoran;
    }


    static void tampilSetoran(double[] setoran) {

        System.out.println("\n===== DATA SETORAN NASABAH =====");

        for (int i = 0; i < setoran.length; i++) {
            System.out.println("Nasabah ke-" + (i + 1) + ": " + setoran[i] + " kg");
        }
    }

    static double totalSetoran(double[] setoran) {

        double total = 0;

        for (int i = 0; i < setoran.length; i++) {
            total += setoran[i];
        }

        return total;
    }

    static double hitungSaldo(double berat, double hargaPerKg) {

        double saldo = berat * hargaPerKg;

        return saldo;
    }


    static int nasabahTerbanyak(double[] setoran) {

        int indeksTerbesar = 0;

        for (int i = 1; i < setoran.length; i++) {

            if (setoran[i] > setoran[indeksTerbesar]) {
                indeksTerbesar = i;
            }
        }

        return indeksTerbesar;
    }

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah nasabah: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah nasabah harus lebih dari 0!");
            input.close();
            return;
        }

        
        double[] setoran = inputSetoran(n);

        tampilSetoran(setoran);

        double total = totalSetoran(setoran);

        System.out.println("\n===== HASIL PERHITUNGAN =====");

        System.out.println("Total seluruh setoran: " + total + " kg");

        double hargaPerKg = 3000;

        System.out.println("\n===== SALDO NASABAH =====");

        for (int i = 0; i < setoran.length; i++) {

            double saldo = hitungSaldo(setoran[i], hargaPerKg);

            System.out.printf("Saldo nasabah ke-%d: Rp%.0f%n", (i + 1), saldo);
        }

        int indeks = nasabahTerbanyak(setoran);

        System.out.println("\n===== SETORAN TERBANYAK =====");

        System.out.println("Nasabah dengan setoran terbesar: Nasabah ke-" + (indeks + 1));

        System.out.println("Berat setoran: " + setoran[indeks] + " kg");

        input.close();
    }
}
