/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.belajar.polymorphism;

/**
 *
 * @author fajar
 */


    class hewan {
            public void suara(){
            System.out.println("Hewan Bersuara :");   
        }
    }
    class kuda extends hewan {
            public void suara(){
            System.out.println("Kuda Mengikik...");
        }
     }
    class kucing extends hewan {
            public void suara(){
            System.out.println("Kucing Mengeong...");
        }
      }
    class ayam extends hewan {
            public void suara(){
            System.out.println("Ayam Berkokok...");
        }
    }
    public class Polymorphism {
            public static void main (String[] args){
            hewan HEWAN = new hewan();
            kuda KUDA = new kuda();
            kucing KUCING = new kucing();
            ayam AYAM = new ayam();
        
            HEWAN.suara();
        
            HEWAN = KUDA;
            HEWAN.suara();
        
            HEWAN = KUCING;
            HEWAN.suara();
        
            HEWAN = AYAM;
            HEWAN.suara();
            }
        
       }