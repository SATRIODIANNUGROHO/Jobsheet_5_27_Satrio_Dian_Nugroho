import java.util.Scanner;

public class PemilihanPercobaan127TernaryOperator {
    public static void main(String[] args) {
        
        Scanner input27 = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int angka = input27.nextInt();
        String hasil;

        hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println("Angka " + (angka) + " merupakan " + (hasil));
    }
}