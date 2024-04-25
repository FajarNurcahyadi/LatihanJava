/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava.latihanscnner;

/**
 *
 * @author fajar
 */
import java.util.*;

/**
 *
 * @author ezranaj
 */
class LatScan4 {
    public static void main(String[]args) {
        int kd;
        String nb="";
        Scanner input=new Scanner(System.in);
        System.out.print("masukan kode barang[1..3]:");
        kd=input.nextInt();
        nb = switch (kd) {
            case 1 -> "Alat Olah raga";
            case 2 -> "Alat Elektronik";
            case 3 -> "Alat Alat Masak";
            default -> " Anda Salah Kode !!!";
        };
            System.out.println("\nNama Barang :" +nb);
}

}

