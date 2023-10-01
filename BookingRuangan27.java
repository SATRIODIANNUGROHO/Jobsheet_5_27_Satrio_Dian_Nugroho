import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class BookingRuangan27 {
    public static void main(String[] args) {

        NumberFormat FormatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        Scanner input27 = new Scanner(System.in);

        int TipeKamar;
        System.out.println("Tipe Kamar \n1. Twin Bed \n2. Double Bed");
        System.out.print("Masukkan Nomor Tipe Kamar : ");
        TipeKamar = input27.nextInt();

        double TwinBed = 200000;
        double DoubleBed = 400000;

        String HargaDoubleBed = FormatRupiah.format(DoubleBed);
        String HargaTwinBed = FormatRupiah.format(TwinBed);

        if (TipeKamar == 1) {
            System.out.println("Harga Kamar : " + (HargaTwinBed));
        }else if (TipeKamar == 2) {
            System.out.println("Harga Kamar : " + (HargaDoubleBed));
        }else {
            System.out.println("Opsi Yang Anda Pilih Tidak Tersedia");
        }

    }
}
