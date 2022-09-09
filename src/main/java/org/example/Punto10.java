package org.example;

import java.util.Scanner;

public class Punto10 {
    /*Realizar un algoritmo que obtenga e imprima el valor de y a partir de la ecuación. Y=
    3*x2 + 7x –1*/
    public static void hallar_y(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese valor de x para la ecuación Y= 3*x2 + 7x –1");
        int x = scan.nextInt();
        double y = (3 * Math.pow(x,2)) + (7 * x) - 1;
        System.out.println(" 3*x2 + 7x –1 = " + y);
    }
}
