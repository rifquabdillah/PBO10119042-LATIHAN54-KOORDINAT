/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan54;

/**
 *
 * @author Stks
 */
public class Main{

    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat oo = new WarnaKoordinat(10,4,"Jingga");
        
        System.out.println("Warna koordinat : " + oo.getNamaWarna());
        System.out.println("Koordinat sumbu x : " + oo.getX() + ", y : " + oo.getY());
        
        System.out.println();
    }
    
}
