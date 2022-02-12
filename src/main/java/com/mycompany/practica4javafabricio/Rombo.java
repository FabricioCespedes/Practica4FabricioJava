/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica4javafabricio;

/**
 *
 * @author Progra
 */
public class Rombo extends Cuadrilatero {

    public Rombo(double dato1, double dato2) {
        super(dato1, dato2);
    }

    @Override
    public double calcularArea() {
        return (super.getDato1()*super.getDato2())/2 ;
    }

    @Override
    public double calcularPerimetro() {
        int lado = Math.sqrt( Math.pow(dato1, 2) + Math.pow(dato2, 2) )/2;
    }
    
}
