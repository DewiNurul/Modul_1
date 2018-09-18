/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class BiodataDiri {
    public static void main (String [] args) {
        Scanner masukan = new Scanner (System.in) ;
        System.out.println("Dewi Nurul Mahardika / X RPL 6 / 16");
        String nama, tempatLahir, jenisKelamin,mottoHidup, alamatdiMalang ;
        int NIS, tanggalLahir;
      
        
        System.out.print("Nama :" );
        nama = masukan.next();
        System.out.print("NIS :");
        NIS = masukan.nextInt();
        System.out.print("Tempat Lahir :");
        tempatLahir = masukan.next();
        System.out.print("Tanggal Lahir :");
        tanggalLahir = masukan.nextInt();
        System.out.print("Jenis Kelamin :");
        jenisKelamin = masukan.next();
        System.out.print("Alamat di Malang :");
        alamatdiMalang = masukan.next() ;
        System.out.print("Motto Hidup :");
        mottoHidup = masukan.next();
        
        
    }
}
