package No6;

public class No6Main {
	class BebasException extends Exception {
		public BebasException(String s) {
		super(s);
		}
		}
		public class UjianBebasException {
		public static void main(String[] args) {
		//Ujian, gunakan inputan
		//jenis kelamin, status
		//pria blm menikah, pajak 10%
		//pria menikah, pajak 5%
		//wanita blm menikah, pajak 7%
		//wanita menikah, pajak 3%
		//validasi: jika diinputkan selain 2 jenis kelamin
		tersebut gunakan throw
		//validasi: jika diinputkan selain 2 status tersebut
		gunakan catch
		try {
		throw new BebasException("Throw Custom Message
		Error");
		} catch (BebasException bebas) {
		// TODO: handle exception
		System.out.println("Bebas Exception");
		System.out.println(bebas.getMessage());
		}
		}
		}

}
