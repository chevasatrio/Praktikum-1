
package soalpraktikum1;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Lingkaran {
    
    //VARIABEL
    
    double a=22, b=7, phi=a/b, hasil, jarijari;;
    Scanner input = new Scanner (System.in);
    
    //Method Void Awalan
    void awalan(){
        System.out.println("------------------------");
        System.out.println("PROGRAM MENGHITUNG LUAS LINGKARAN(phi=22/7)");
        System.out.println("------------------------");
    }
    
    //Method Void Isi
    void isi(){
        System.out.println("Masukkan Panjang Jari-Jari(r) : ");
        jarijari = input.nextDouble();
    }
   
    //Method Void Hitung
    void hitung(){
        hasil = phi*jarijari*jarijari;
    }
    
    //Method Void Akhir
    void akhir(){
        System.out.println("------------------------");
        System.out.println("Jari-Jari   :"+jarijari);
        System.out.println("Hasil Luas  :"+hasil);
        System.out.println("------------------------");
    }
}
