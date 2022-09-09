package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Punto1 {
    /*Elabore una clase que me permita leer 5 números y calcule el máximo y el mínimo entre
    los 5 números, la raíz 5 del 3 número, la potencia del primero con el último número,*/
    public static void obtener_numeros (){

        Scanner scan = new Scanner(System.in);
        int contador = 0;
        int [] numeros = new int[5];

        while(contador <= 4){
            System.out.println("Ingresa numero");
            numeros[contador] = scan.nextInt();
            contador++;
        };
        System.out.println("======= MAXIMO Y MINIMO =======");
        maximo_minimo(numeros);
        System.out.println("======= RAÍZ DE 5 DEL TERCER NÚMERO =======");
        System.out.println(raiz5(numeros));
        System.out.println("======= POTENCIA DEL PRIMERO CON EL ULTIMO NÚMERO =======");;
        System.out.println(potencia(numeros));

    }

    public static void mostrar_array (int array []) {
        for(int i = 0; i<= array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void maximo_minimo (int array []) {
        Arrays.sort(array);
        int maximo = array[array.length-1];
        int minimo = array[0];
        System.out.println("El numero mayor es: " + maximo + " El numero menor es: " + minimo );
    }

    public static double raiz5 (int array []){
        double raiz = Math.pow(array[2], 1.0/5.0);
        return raiz;
    }

    public static double potencia (int array []){
        double potencia = Math.pow(array[0], array[4]);
        return potencia;
    }
}
