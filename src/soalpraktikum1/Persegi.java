
package soalpraktikum1;

import java.util.Scanner;

public class Persegi {
    
    //Variable
    double panjang,lebar,luas;
    Scanner input = new Scanner(System.in);
    
    //Method Void Awalan
    void awalan(){
        System.out.println("------------------------");
        System.out.println("PROGRAM MENGHITUNG LUAS PERSEGI");
        System.out.println("------------------------");
    }
    
    //Method Void Isi
    void isi(){
        System.out.print("Masukkan Panjang Sisi : ");
        panjang = input.nextDouble();
        System.out.print("Masukkan Lebar Sisi   : ");
        lebar = input.nextDouble() ;
    }
    
    //Method Void Hitung
    void hitung(){
        luas = panjang*lebar;
    }
    
    //Method Void Akhiran
    void akhir(){
        System.out.println("------------------------");
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar   : "+lebar);
        System.out.println("Luas    : "+luas);
        System.out.println("------------------------");
    }
}
