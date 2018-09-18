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
public class LuasPermukaanBola {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Dewi Nurul Mahardika / X RPL 6 / 16");
        int r;
        double pi = 3.14;
        double luasPermukaan;

        System.out.println("===MENGHITUNG LUAS PERMUKAAN BOLA===");

        System.out.print("Nilai r (jari-jari) bola : ");
        r = masukan.nextInt();
        System.out.println("Nilai pi bola :" + pi);
        System.out.println("-----------------------------");
        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.println("Luas Permukaan Bola  = " + 4 * pi * r * r);

    }
    

}
