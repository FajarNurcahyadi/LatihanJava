package belajarjava.latihanscnner;

import java.util.Scanner;


/**
 *
 * @author fajar
 */
public class scnnerAksi {
    public static void main(String args[])

{
    
scnerLanjutan scan=new scnerLanjutan();

scan.inputScanner();
System.out.println("\n Nama Anda    :"+ scan.getnama());
System.out.println("Nilai Anda      :"+scan.rata());

}

}

