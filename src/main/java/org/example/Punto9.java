package org.example;

import java.util.Scanner;

public class Punto9 {
    /*Calcular el nuevo salario de un obrero si tuvo un incremento del 25 % sobre el salario
    anterior*/

    public static void nuevo_salario(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa Salario actual: ");
        double actual = scan.nextDouble();
        double nuevo = ((actual * 25) / 100) + actual;
        System.out.println("Salario anterior = " + actual + "\n Salario nuevo: " + nuevo);
    }
}
