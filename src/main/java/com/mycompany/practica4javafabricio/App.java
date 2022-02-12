/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica4javafabricio;

import java.util.Scanner;

/**
 *
 * @author Progra
 */
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuarMenu = false;
        do {
            imprimir();
            int opc = entrada.nextInt();
            switch (opc) {
                case 1 -> {
                    calcularRectangulo();
                }
                case 2 -> {
                    calcularCuadrado();
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                }
                case 7 -> {
                }
                case 8 -> {
                }
                case 9 -> {
                }
                case 10 ->
                    continuarMenu = true;
                default ->
                    System.out.println("Opcion invalida");

            }
        } while (continuarMenu == false);
    }

    private static void calcularRectangulo() {
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        System.out.println("Digite la base");
        base = entrada.nextInt();
        System.out.println("Digite la altura");
        altura = entrada.nextInt();
        Rectangulo rectangulo = new Rectangulo(base, altura);
        imprimir("Area", "rectangulo", rectangulo.calcularArea());
        imprimir("Perimetro", "rectangulo", rectangulo.calcularPerimetro());
    }

    private static void calcularCuadrado() {
        Scanner entrada = new Scanner(System.in);
        int lado;
        System.out.println("Digite cuanto mide un lado");
        lado = entrada.nextInt();
        Rectangulo rectangulo = new Rectangulo(lado, 0);
        imprimir("Area", "Cuadrado", rectangulo.calcularArea());
        imprimir("Perimetro", "Cuadrado", rectangulo.calcularPerimetro());
    }

    private static void imprimir(String operacion, String figura, double resultado) {
        System.out.println("El " + operacion + " del " + figura + " es " + resultado);
    }

    private static void imprimir() {
            System.out.println("Menu");
            System.out.println("1. Rectangulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rombo");
            System.out.println("4. Equilatero");
            System.out.println("5. Isosceles");
            System.out.println("6. Escaleno");
            System.out.println("7. Pentágono");
            System.out.println("8. Heptágono");
            System.out.println("9. Octágono");
            System.out.println("10. Salir");
            System.out.println("Seleccione una opcion del menu");    }
}
