import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        percabangan p = new percabangan();

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        p.cekAngka(angka);

        sc.close();
    }
}
