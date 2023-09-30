import java.util.Scanner;

public class PemilihanPercobaan227Conversion {
    public static void main(String[] args) {

        Scanner input27 = new Scanner(System.in);

        System.out.print("Masukkan Nilai UAS\t : ");
        float UAS = input27.nextFloat();

        System.out.print("Masukkan Nilai UTS\t : ");
        float UTS = input27.nextFloat();

        System.out.print("Masukkan Nilai Kuis\t : ");
        float Kuis = input27.nextFloat();

        System.out.print("Masukkan Nilai Tugas\t : ");
        float Tugas = input27.nextFloat();

        float Hasil = (UAS * 0.4F) + (UTS * 0.3F) + (Kuis * 0.1F) + (Tugas * 0.1F);
        System.out.println("Nilai Akhir Anda Adalah\t : " + (Hasil));
        

        if (Hasil <= 100 && Hasil > 80) {
            System.out.println("\n===Nilai Mutu===");
            System.out.println("\nNilai Huruf\t : A");
            System.out.println("Nilai Setara\t : 4");
            System.out.println("Kualifikasi\t : Sangat Baik");
        }else if (Hasil <= 80 && Hasil > 73) {
            System.out.println("\n===Nilai Mutu===");
            System.out.println("\nNilai Huruf\t : B+");
            System.out.println("Nilai Setara\t : 3,5");
            System.out.println("Kualifikasi\t : Lebih Dari Baik");
        }else if (Hasil <= 73 && Hasil > 65) {
            System.out.println("\n===Nilai Mutu===");
            System.out.println("\nNilai Huruf\t : B");
            System.out.println("Nilai Setara\t : 3");
            System.out.println("Kualifikasi\t : Baik");
        }else if (Hasil <= 65 && Hasil > 60) {
            System.out.println("\n===Nilai Mutu===");
            System.out.println("\nNilai Huruf\t : C+");
            System.out.println("Nilai Setara\t : 2,5");
            System.out.println("Kualifikasi\t : Lebih Dari Cukup");
        }else if (Hasil <= 60 && Hasil > 50) {
            System.out.println("\n===Nilai Mutu===");
            System.out.println("\nNilai Huruf\t : C");
            System.out.println("Nilai Setara\t : 2");
            System.out.println("Kualifikasi\t : Cukup");
        }else if (Hasil <= 50 && Hasil > 39) {
            System.out.println("\n===Nilai Mutu===");
            System.out.println("\nNilai Huruf\t : D");
            System.out.println("Nilai Setara\t : 1");
            System.out.println("Kualifikasi\t : Kurang");
        }else {
            System.out.println("\n===Nilai Mutu===");
            System.out.println("\nNilai Huruf\t : E");
            System.out.println("Nilai Setara\t : 0");
            System.out.println("Kualifikasi\t : Gagal");
        }

    }
}
