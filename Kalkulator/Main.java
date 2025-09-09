import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator k = new Kalkulator();

        System.out.print("Angka pertama (penjumlahan): ");
        int a1 = scanner.nextInt();
        System.out.print("Angka kedua (penjumlahan): ");
        int b1 = scanner.nextInt();

        System.out.print("Angka pertama (perkalian): ");
        int a2 = scanner.nextInt();
        System.out.print("Angka kedua (perkalian): ");
        int b2 = scanner.nextInt();

        System.out.println("Hasil:");
        System.out.println(a1 + " + " + b1 + " = " + k.tambah(a1, b1));
        System.out.println(a2 + " * " + b2 + " = " + k.kali(a2, b2));

        scanner.close();
    }
}
