package mahasiswa;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Mahasiswa {
	String nim;
	String nama;
	Double ipk;
	int sks;
	int perSks;
	
	String tglLahir;//formatnya yyyy-mm-dd
	
	public Mahasiswa(String nim, String nama, Double ipk, int sks, String tglLahir) {
		this.nim = nim;
		this.nama = nama;
		this.ipk = ipk;
		this.sks = sks;
		this.tglLahir = tglLahir;
	}
	
	public String getProgdi(String progdi) {
		String ps="";
		if(progdi=="A11") {
			ps = "Teknik Informatika";
		}
		else if(progdi=="A12") {
			ps = "Sistem Informasi";
		}
		else if(progdi=="B11") {
			ps = "Manajemen";
		}
		else if(progdi=="B12") {
			ps = "Akuntansi";
		}
		else {
			ps = "Belum terdaftar";
		}
		
		return ps;
	}
	
	public String ipkStatus() {
		String stat="";
		if(ipk <= 1) {
			stat = "Perlu Usaha Lebih";
		}
		else if (ipk > 1 && ipk <= 2) {
			stat = "Perlu Usaha Menaikan IPK";
		}
		else if (ipk > 2.75 && ipk <= 3) {
			stat = "Sedikit Lagi";
		}
		else if (ipk > 3 && ipk <= 3.5) {
			stat = "Sangat Memuaskan";	
		}
		else if (ipk > 3.5 && ipk <= 4) {
			stat= "Dengan Pujian";
		}
		else {
			stat = "Range IPK Diluar Jalur";
		}
		return stat;
	}
	
	public int getTahun() {
		int angkatan;
		
		if (nim == "2020") {
			angkatan = 2020; 
		}
		else {
			angkatan = 2021;
		}
		/**
		 * cari angkatan dari nim yang diinput
		 * misal A11.2000.00001, maka akan mengembalikan 2000
		 * 
		 */
		return angkatan;
	}
	
	public int getTagihanSks() {
		int perSks = 250000;
		
		this.perSks = 250000;
		this.sks = 0;
	}
	public float GetperSks() {
		return this.perSks;
	}
	
	public float HitungSKSYangHarusDibayar(int sks)
	{
		this.sks = sks;
		float tagihan = this.sks * perSks;
	
		/**
		 * cari berapa jumlah tagihan mahasiswa yang bersangkutan
		 * sks*perSks
		 */
		
		return tagihan;
	}
	
	public int getMhsSemester() {
		int smt = 0;
		Calendar kld = Calendar.getInstance();
		int thnSkr = kld.get(Calendar.YEAR);
		
		smt = thnSkr - 2020;
		
		/**
		 * Hitung mahasiswa sudah berapa semester kuliah
		 */
		
		return smt;
	}
	
	private Date dateFormatter(String pola, String tanggal) {
		Date tgl=null;
		SimpleDateFormat formatter = new SimpleDateFormat(pola);
		
		try {
			tgl = formatter.parse(tanggal);
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		return tgl;
	}
	
	public String getUmur() {
		String umur = "";
		
		/**
		 * Hitung umur di sini
		 */
		
		return umur;
		
	}

}
