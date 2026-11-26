import java.util.Scanner;

public class HitungBalok05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.print("masukkan panjang: ");
        p = sc.nextInt();
        
        System.out.print("masukkan lebar: ");
        l = sc.nextInt();

        System.out.print("masukkan tinggi: ");
        t = sc.nextInt();

        L = hitungLuas(p, l);
        System.out.println("luas persegi panjang adalah: "+L);

        vol =  hitungVolume(t, p, l);
        System.out.println("volume balok adalah: "+vol);
        
        sc.close();
    }
    static int hitungLuas(int pjg, int lb){
        int Luas = pjg*lb;
        return Luas;
    }
    static int hitungVolume(int tinggi, int a, int b){
        int volume = hitungLuas(a,b)*tinggi;
        return volume;
    }
}
