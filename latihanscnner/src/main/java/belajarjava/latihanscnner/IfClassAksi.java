/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava.latihanscnner;
/**
 *
 * @author fajar
 */
import java.util.Scanner;
/**
 *
 * @author ezranaj
 */
public class IfClassAksi {
    public static void main(String[] args) {
        double TotBeli;
        Scanner input = new Scanner(System.in);
        
        Kelasif fungsiif = new Kelasif();
        
        System.out.print("Total Pembelian Rp. ");
        fungsiif.TotBeli = input.nextDouble();
        
        System.out.println("Besarnya Potongan Rp. " + fungsiif.getPotongan());
        System.out.println("Jumlah yg dibayarkan Rp. " + fungsiif.jumlahbayar());
    }
}