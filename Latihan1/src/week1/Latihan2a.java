package week1;
import java.util.Scanner;

public class Latihan2a {

	public static void main(String[] args) {
		double k, r, phi = 3.14;
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Masukkan panjang diameter lingkaran: ");
	    r = scan.nextDouble();
	    k = 2 * phi * r;
	    System.out.println("Keliling Lingkaran : " + String.format("%.2f", k));

	}

}
