package No4;

import java.util.Scanner;

public class No4Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Masukkan sisa BBM dalam tangki (liter) =");
		Double sisa = Double.parseDouble(in.next());
		
		System.out.println("Masukkan konsumsi BBM kendaraan (km/liter) =");
		Double jarakPerLiter = Double.parseDouble(in.next());
		
		Double hasil = hitungSisaJarak(sisa, jarakPerLiter);
        System.out.println("Kendaraan anda dapat menempuh jarak " + hasil.toString() + " kilometer dengan sisa\n" + 
          "BBM yang ada di tangki");
 }
 
 static Double hitungSisaJarak(Double sisa, Double jarakPerliter) {
	 Double sisaJarak = sisa * jarakPerliter;
	 return sisaJarak;
 }

	}

