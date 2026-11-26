public class PengunjungKafe205 {
            public static void main(String[] args) {
            daftarPengunjung("andi");
            daftarPengunjung( "doni", "eti", "fahmih", "galih");
        }
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("daftar nama pengunjung: ");
        for (int i = 1; i < namaPengunjung.length; i++) {
            System.out.println("- "+namaPengunjung[i]);

        }
    }
    
}
