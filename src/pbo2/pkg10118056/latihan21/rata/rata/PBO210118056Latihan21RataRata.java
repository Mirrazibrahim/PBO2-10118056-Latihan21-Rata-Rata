/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan21.rata.rata;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Mirrazibrahim
 * KELAS    : IF-2
 * NIM      : 10118056
 */
public class PBO210118056Latihan21RataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Inisialisasi
        Scanner input = new Scanner(System.in);
        int n, jml, nilai[];
        float rata, jumlah = 0;
 
        //Input jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = input.nextInt(); 
 
        //Inisialisasi array
        nilai = new int[n];
 
        //Input nilai
        for(int i=0;i<= n-1;i++){
            System.out.print("Nilai Mahasiswa ke- " + (i+1) + " : ");
            nilai[i] = input.nextInt();
        }
 
        //Hitung Jumlah
        for(int j=0;j<= n-1;j++){
            jumlah = jumlah + nilai[j];
        }
 
        //Hitung Rata-rata
        rata = jumlah/n;
 
        //Output
        System.out.println("");
        System.out.println("Maka, Rata-rata Nilainya adalah " + rata);
        System.out.println("Developed by : Mirraz Ibrahim");
    }
}
