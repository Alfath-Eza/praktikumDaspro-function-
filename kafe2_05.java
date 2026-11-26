import java.util.Scanner;

public class kafe2_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu("andi", true);
        System.out.print("\nMasukkan nomor menu yang anda ingin anda pesan: ");
        int pilihMenu = sc.nextInt();
        System.out.print("masukkan jumlah item yang ingin di pesan: ");
        int banyakItem = sc.nextInt();

        int totalBayar = hitungTotalHarga05(pilihMenu, banyakItem);

        System.out.println("total harga untuk pesanan anda:  Rp"+totalBayar);
    }
    public static void menu(String namaPelanggan, boolean isMember) {
        System.out.println("selamat datang, "+namaPelanggan+" !");

        if (isMember) {
            System.out.println("anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
            
        }
        System.out.println("=====MENU RESTO KAFE=====");
        System.out.println("1. kopi hitam - Rp 15.000");
        System.out.println("2. cappucino - Rp 20.000");
        System.out.println("3. latte - Rp 22.000");
        System.out.println("4. tehh tarik - Rp 12.000");
        System.out.println("5. roti bakar - Rp 10.000");
        System.out.println("6. mie goreng - Rp 18.000");
        System.out.println("==========================");
        System.out.println("silahkan pilih menu yang anda inginkan. ");

    }
    public static int hitungTotalHarga05 (int pilihMenu, int banyakItem) {
        int[]hargaItems = {15000,20000,22000,12000,10000,18000};

        int hargaTotal = hargaItems[pilihMenu -1]* banyakItem;
        return  hargaTotal;

    }
    
}
    
    

