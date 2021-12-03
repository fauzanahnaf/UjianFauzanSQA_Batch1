package No9;

import java.util.Scanner;

public class No9Main {
	public static void main(String[] args) {
		
    Scanner in = new Scanner(System.in);

    System.out.print("Masukkan jarak (kilometer) = ");
    String jarak = in.next();

    System.out.print("Masukkan waktu (jam) = ");
    String jam = in.next();

    String hasil = hitungKecepatan(jarak, jam);
    System.out.println("Kecepatan rata-rata anda adalah " + hasil + " km/jam");
}

static String hitungKecepatan(String jarak, String jam) {
    Double jrk = Double.parseDouble(jarak);
    Double jm = Double.parseDouble(jam);

    return String.valueOf(jrk / jm);
}
}

