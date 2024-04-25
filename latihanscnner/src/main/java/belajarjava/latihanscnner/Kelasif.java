/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava.latihanscnner;

/**
 *
 * @author fajar
 */
public class Kelasif {
   public double TotBeli,potongan;
   
   public void SetTotalBeli(double a){
       TotBeli=a;
}

    public double getPotongan(){
        if(TotBeli >= 50000){
           potongan = 0.2  * TotBeli; 
        }
        return potongan;
    }

    public double JumlahBayar()
    {
        return (TotBeli-potongan);
    }

}
