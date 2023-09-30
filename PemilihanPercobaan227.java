import java.util.Scanner;

public class PemilihanPercobaan227 {
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
        String Message = Hasil < 65 ? "Harus Mengikuti Remidi" : "Tidak Perlu Mengikuti Remidi";
        System.out.println("Hasil Akhir Anda " + (Hasil) + " Sehingga Anda " + (Message));

    }
}
