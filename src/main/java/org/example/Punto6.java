package org.example;

import java.sql.Array;
import java.util.Scanner;

public class Punto6 {
    /*Calcular el promedio de 5 números, y mostrar la suma y el promedio*/

    public  static void promedio () {
        Scanner scan = new Scanner(System.in);
        int [] numeros = new int [5];
        int contador = 0;
        while (contador < numeros.length ){
            System.out.println("Ingrese numero: ");
            numeros[contador] = scan.nextInt();
            contador++;
        }

        int suma = 0;
        int promedio;
        for (int i = 0; i< numeros.length; i++){
            suma = suma + numeros[i];
        }
        promedio = suma/ numeros.length;
        System.out.println("Suma: " + suma + "\n Promedio: " + promedio);
    }
}
