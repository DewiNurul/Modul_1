/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class KonversiSuhu {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        double r = 0;
        double f = 0;
        double k = 0;
        double c = 78;
        System.out.println("====KONVERSI SUHU====");
        System.out.println("-------------------------");
        System.out.println("Suhu 78 Celcius" );
        System.out.println("-------------------------");
       System.out.println("Konversi suhu 78 Celcius dalam Reamur :" + c*4/5);
        System.out.println("Konversi suhu 78 Celcius dalam Farenheit : " + (32+(c*9/5)) );
        System.out.println("Konversi suhu 78 Celcius dalam Kelvin :" + (c+273));
    }

}

