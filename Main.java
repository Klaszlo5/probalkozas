/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author hallgato
 */
public class Main {
  static void myMethod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kérem az első számot a szorzáshoz ");
        int szam = scan.nextInt();
        System.out.print("Kérem a második számot a szorzáshoz. ");
        int szam2 = scan.nextInt();

        int szamol = szam*szam2;
        
        // Displaying the multiplication result
        System.out.println("Megoldás:"+szamol);
  }
  static void osztas() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kérem az első számot az osztáshoz: ");
        int szam = scan.nextInt();
        System.out.print("Kérem a második számot az osztáshoz. ");
        int szam2 = scan.nextInt();
        int szamom = szam;
        int szamol;
        while (szam > 0) {
        szam2 = szam2 + szam2;
        szamom--;
        szamol = szam/szam2;
        System.out.println("Megoldás:"+szamol);
        }
  }

  public static void main(String[] args) {
    myMethod();
    osztas();
  }
}
