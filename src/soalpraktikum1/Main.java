
package soalpraktikum1;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Main {

    
    public static void main(String[] args) {
        // Object
        Lingkaran satu = new Lingkaran();
        Persegi dua = new Persegi();
        
        //Variable
        int jawab;
        Scanner input = new Scanner(System.in);
        String[] pilihan = {"Lingkaran(22/7)","Persegi"};
        
        System.out.println("PROGRAM HITUNG LUAS LINGKARAN DAN PERSEGI");
        System.out.println("---------------------------------");
        
        //Percabangan
         for (int i = 0; i < pilihan.length; i++) {
            System.out.println(i+". "+pilihan[i]);
        }
        System.out.print("Masukkan pilihan : ");
        jawab = input.nextInt();
        
        switch(jawab){
            case 0 :
                satu.awalan();
                satu.isi();
                satu.hitung();
                satu.akhir();
                break;
            case 1 :
                dua.awalan();
                dua.isi();
                dua.hitung();
                dua.akhir();
                break;
        }
    }
    
}
