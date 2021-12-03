package No8;

public class Tabungan {

	private String nama;
	private Integer nomor;
	private Integer saldo;
	
	public Tabungan(String nama, Integer nomor, Integer saldo) {
		this.nama = nama;
		this.nomor = nomor;
		this.saldo = saldo;
	}
	
	public String toString() {
		return "Tabungan nomor " + nomor + " atas nama " + nama + " dengan saldo sebesar " + saldo;
	}
}
