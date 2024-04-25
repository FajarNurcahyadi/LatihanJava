/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package belajarjava.latihanscnner;

/**
 *
 * @author fajar
 */
import java.util.Scanner;
/**
 *
 * @author fajar
 */
public class Latihanscnner {

    public static void main(String args[]) 
    {
     Scanner input = new Scanner(System.in);
     
     
     String nama;
     int n2;
     double n1,n3;
     
     System.out.print("Masukan Nama Anda;   ");
     nama = input.nextLine();
     System.out.print("Masukan Nilai 1;   ");
     n1 = input.nextDouble();
     System.out.print("Masukan Nilai 2;   ");
     n2 = input.nextInt();
     
     n3 = n1 + n2;
     System.out.println("\n Nama Anda:  "+ nama);
     
     System.out.println("Nilai Anda:    "+n3);
     
    }

    void inputScanner() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getnama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String rata() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}