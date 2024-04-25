/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;
import java.util.Scanner;

/**
 *
 * @author fajar
 */
public class latarray {
  public static void main(String[] args)
  {
  int i;
  int[] nil_akhir;
  
  nil_akhir = new int[6];
  Scanner input = new Scanner(System.in);
   for(i=0; i<6; i++)
   {
    System.out.print("Masukan Array ke " + 1 + " = ");
    nil_akhir[i] = input.nextInt();
   }
   System.out.print("\n\nData yang diinput ke elemet array\n");
   for(i=0; i<6; i++)
   {
   System.out.print("Nilai Akhir Index "+1);
   System.out.println(" = " + nil_akhir[i]);
   }
       }        
}
