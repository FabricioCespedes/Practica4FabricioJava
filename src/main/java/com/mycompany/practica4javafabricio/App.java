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
                    calcularTrapecio();
                }
                case 4 -> {
                    calcularTrianguloEquilatero();
                }
                case 5 -> {
                    calcularTrianguloEscaleno();
                }
                case 6 -> {
                    calcularTrianguloIsosceles();
                }
                case 7 -> {
                    calcularPentagono();
                }
                case 8 -> {
                    calcularHeptagono();
                }
                case 9 -> {
                    calcularOctagono();
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

    private static void calcularTrapecio() {
        Scanner entrada = new Scanner(System.in);
        int baseMayor;
        int baseMenor;
        int lado;
        System.out.println("Digite cuanto mide la base mayor");
        baseMayor = entrada.nextInt();
        System.out.println("Digite cuanto mide la base menor");
        baseMenor = entrada.nextInt();
        System.out.println("Digite cuanto mide un lado");
        lado = entrada.nextInt();
        TrapecioIsosceles trapecio = new TrapecioIsosceles(baseMayor, baseMenor, lado);
        imprimir("Area", "Trapecio", trapecio.calcularArea());
        imprimir("Perimetro", "Trapecio", trapecio.calcularPerimetro());
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

    private static void calcularTrianguloEquilatero() {
        Scanner entrada = new Scanner(System.in);
        int lado;
        System.out.println("Digite cuanto mide un lado");
        lado = entrada.nextInt();
        TrianguloEquilatero triangulo = new TrianguloEquilatero(lado, 0);
        imprimir("Area", "triangulo equilatero", triangulo.calcularArea());
        imprimir("Perimetro", "triangulo equilatero", triangulo.calcularPerimetro());
    }

    
    private static void calcularTrianguloEscaleno() {
        Scanner entrada = new Scanner(System.in);
        int ladoA;
        int ladoB;
        int ladoC;
        System.out.println("Digite cuanto mide un lado a");
        ladoA = entrada.nextInt();
        System.out.println("Digite cuanto mide un lado b");
        ladoB = entrada.nextInt();
        System.out.println("Digite cuanto mide un lado c");
        ladoC = entrada.nextInt();
        TrianguloEscaleno triangulo = new TrianguloEscaleno(ladoA, ladoB, ladoC);
        imprimir("Area", "triangulo escaleno", triangulo.calcularArea());
        imprimir("Perimetro", "triangulo escaleno", triangulo.calcularPerimetro());
    }

    private static void calcularTrianguloIsosceles() {
        Scanner entrada = new Scanner(System.in);
        int ladoA;
        int ladoB;
        System.out.println("Digite cuanto mide un lado a");
        ladoA = entrada.nextInt();
        System.out.println("Digite cuanto mide un lado b");
        ladoB = entrada.nextInt();
        TrianguloIsosceles triangulo = new TrianguloIsosceles(ladoA, ladoB);
        imprimir("Area", "triangulo isosceles", triangulo.calcularArea());
        imprimir("Perimetro", "triangulo isosceles", triangulo.calcularPerimetro());
    } 
    
        private static void calcularPentagono() {
        Scanner entrada = new Scanner(System.in);
        int lado;
        System.out.println("Digite cuanto mide el lado");
        lado = entrada.nextInt();
        Pentagono pentagono = new Pentagono(lado, 0);
        imprimir("Area", "pentagono", pentagono.calcularArea());
        imprimir("Perimetro", "pentagono", pentagono.calcularPerimetro());
    }

    private static void calcularHeptagono() {
        Scanner entrada = new Scanner(System.in);
        int lado;
        System.out.println("Digite cuanto mide el lado");
        lado = entrada.nextInt();
        Heptagono hentagono = new Heptagono(lado, 0);
        imprimir("Area", "Heptagono", hentagono.calcularArea());
        imprimir("Perimetro", "Heptagono", hentagono.calcularPerimetro());
    }

    private static void calcularOctagono() {
        Scanner entrada = new Scanner(System.in);
        int lado;
        System.out.println("Digite cuanto mide el lado");
        lado = entrada.nextInt();
        Octagono octagono = new Octagono(lado, 0);
        imprimir("Area", "Octagono", octagono.calcularArea());
        imprimir("Perimetro", "Octagono", octagono.calcularPerimetro());
    }
    

    private static void imprimir(String operacion, String figura, double resultado) {
        System.out.println("El " + operacion + " del " + figura + " es " + resultado);
    }

    private static void imprimir() {
        System.out.println("Menu");
        System.out.println("1. Rectangulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Trapecio Isosceles");
        System.out.println("4. Equilatero");
        System.out.println("5. Isosceles");
        System.out.println("6. Escaleno");
        System.out.println("7. Pentágono regular");
        System.out.println("8. Heptágono regular");
        System.out.println("9. Octágono regular");
        System.out.println("10. Salir");
        System.out.println("Seleccione una opcion del menu");
    }
}
