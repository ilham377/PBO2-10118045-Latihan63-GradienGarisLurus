/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan63gradiengarislurus;

/**
 *
 * @author
 *  Nama              : Muhammad Ilham Apriyadi
 *  Kelas             : IF2
 *  NIM               : 10118045
 *  Deskripsi Program : program gradien garis lurus
 */
public class PBO10118045Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koor = new Koordinat(2, 10, 5, 7);
        Koordinat koor2= new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik (" + koor.getX1() + ", " + koor.getY1() + ") dan (" + koor.getX2() + ", " + koor.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + koor.hitungGradien());        
        System.out.println("Garis yang melalui titik (" + koor2.getX1() + ", " + koor2.getY1() + ") dan (" + koor2.getX2() + ", " + koor2.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + koor2.hitungGradien());  
    }
    
}
