/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava.latihanscnner;
import java.util.Scanner;
/**
 *
 * @author fajar
 */
public class latihanpt2 {
    public String nim, nama;
    public double na,nt,nuts,nuas;
    Scanner input = new Scanner(System.in);
    
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }

public void inputScanner(){
    System.out.print("Masukan NIM Anda :");
    nim = input.nextLine();
    System.out.print("Masukan Nama Anda :");
    nama = input.nextLine();
    System.out.print("Masukan Nilai Absen :");
    na = input.nextLine();
    System.out.print("Masukan Nilai Tugas :");
    nt = input.nextLine();
    System.out.print("Masukan Nilai UTS :");
    nuts = input.nextLine();
    System.out.print("Masukan Nilai UAS :");
    nuas = input.nextLine();
    }
    
public double rata(){
    return (0.1*na)+(0.2*nt)+(0.3*nuts)+(0.4*nuas);
    }
}