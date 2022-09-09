package org.example;

import java.util.Scanner;

public class Punto3 {
    /*Elabore una clase que permita calcular el área de un triángulo, de un cuadrado y de un
    círculo.*/

    public static void hallar_area () {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿A cual fugura desea calcular el area? (circulo, triangulo o cuadrado)");
        String res_figura = scan.nextLine();
        res_figura.toLowerCase();

        switch (res_figura){
            case "circulo" :
                System.out.println(area_circulo());
                break;

            case "triangulo":
                System.out.println(area_trinagulo());
                break;

            case "cuadrado":
                System.out.println(area_cuadrado());
                break;

            default:
                System.out.println("Figura incorrecta");
        }
    }

    public static double area_circulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese radio del ciculo");
        double radio = scanner.nextDouble();
        double pi = 3.141;
        double area = pi * Math.pow(radio,2);
        return area;
    }

    public static double area_trinagulo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la altura del triangulo");
        double altura = scan.nextDouble();
        System.out.println("Ingrese la base del triangulo");
        double base = scan.nextDouble();
        double area = (base * altura) / 2;
        return area;
    }

    public static double area_cuadrado() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese lado horizontal del cuadrado");
        double l_horizontal = scan.nextDouble();
        System.out.println("Ingrese lado vertical del cuadrado");
        double l_vertical = scan.nextDouble();
        double area = l_horizontal * l_vertical;
        return area;
    }
}
