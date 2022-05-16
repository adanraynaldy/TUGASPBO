package Latihan2;

import java.util.Scanner;

public class Latihan2 {
	public static void main (String args[])
	   {
	    Scanner input=new Scanner(System.in);

	    System.out.print("Masukan Jumlah Mahasiswa : ");
	    int n=input.nextInt();

	    String nama[]=new String[n];
	    String nim[]=new String[n];
	    int ipk[]=new int[n];

	    for (int i=0;i<n;i++){
	        System.out.println("Mahasiswa Ke : "+(i+1));
	        System.out.print("NIM : ");
	        nim[i]=input.next();

	        System.out.print("Nama : ");
	        nama[i]=input.next();
	        
	        System.out.println("IPK : ");
	        ipk[i]=input.nextInt();

	    }
	    
	    for (int i=0; i<n;i++) {
	    	System.out.println("Mahasiswa Ke : "+(i+1));
	        System.out.println("NIM : "+nim[i]);
	        System.out.println("Nama : "+nama[i]);
	        System.out.println("IPK : "+ipk[i]);
	    }
	    
	 }
}
