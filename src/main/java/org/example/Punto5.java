package org.example;

import java.util.Scanner;

public class Punto5 {
    /*Leer un número y escribir el valor absoluto del mismo*/
    public static void valor_absoluto(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int numero = scan.nextInt();
        int valor_absoluto;
        if(numero > 0) {
            valor_absoluto = numero;
        } else if (numero < 0) {
            valor_absoluto = numero * -1;
        } else {
            valor_absoluto = 0;
        }

        System.out.println("EL valor absuoluto de: " + numero + " es: " + valor_absoluto);
    }
}
