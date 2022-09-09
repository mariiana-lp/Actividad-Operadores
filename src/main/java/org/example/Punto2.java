package org.example;

import java.util.Scanner;

public class Punto2 {
    /*Elabore una clase que permita leer el nombre, el sexo, y el peso de una persona imprima
los datos leídos*/


    public static void datos_personales(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese su sexo: ");
        String sexo = scan.nextLine();
        System.out.println("Ingrese su peso: ");
        double peso = scan.nextDouble();

        System.out.println("Nombre: " + nombre + "\n Sexo: " + sexo + "\n Peso: " +peso );
    }

}
