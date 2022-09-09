package org.example;

import java.util.Scanner;

public class Punto8 {
    /*Realizar un algoritmo que muestre el área y el perímetro de un circulo
     */

    public static void datos_circulo() {
        Punto3 punto3 = new Punto3();
        System.out.println("Area: " + punto3.area_circulo() + "\nPerimetro: " + perimetro() );
    }

    public static double perimetro() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el diametro del circulo: ");
        double diametro = scan.nextDouble();
        double pi = 3.141;
        double perimetro = pi * diametro;
        return perimetro;
    }
}
