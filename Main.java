/*
Nama    : Bunga Islamiya Putri
Npm     : 20191310053
Program Ganjil Genap
 */
package com.company;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int angka;
        System.out.println("\tProgram menentukan ganjil genap");
        String n;
        n =JOptionPane.showInputDialog("Input angka");
        angka = Integer.parseInt(n);
        if ( angka % 2 == 0){
            System.out.println(angka+" adalah bilangan genap");
        }else{
            System.out.println(angka+" adalah bilangan ganjil");
        }
    }
}
