import java.util.Scanner;

public class UKLNO1 {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh pengiriman (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;

        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        double biayaTotal = berat * biayaPerKg;

        if (volume > 100) {
            biayaTotal += 50000;
        }

        System.out.println("===================================");
        System.out.println("RINCIAN BIAYA EKSPEDISI");
        System.out.println("Berat paket      : " + berat + " kg");
        System.out.println("Jarak tempuh     : " + jarak + " km");
        System.out.println("Volume paket     : " + volume + " cm^3");
        System.out.println("Biaya per kg     : Rp " + biayaPerKg);
        System.out.println("Total biaya kirim: Rp " + biayaTotal);
        System.out.println("===================================");

        input.close();
    }
}

