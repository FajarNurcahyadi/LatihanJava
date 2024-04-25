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


/**
 *
 * @author User
 */
public class IfElseClass {
    public String nama,keterangan;
    public int nilai;
    Scanner input = new Scanner(System.in);
    public void setInputData(){
    System.out.println("Masukan nama Mahasiswa : ");
    nama = input.nextLine();
    System.out.println("Masukan nilai Mashasiswa : ");
    nilai = input.nextInt();
    }
    public String getketerangan(){
    if (nilai > 75){
        keterangan = "Lulus";
        }else{
            keterangan = "Gagal";
        }
    return keterangan;
    }    
}
    

