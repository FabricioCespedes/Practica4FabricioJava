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
public class Cuadrado extends Cuadrilatero {

    public Cuadrado(double dato1, double dato2) {
        super(dato1, dato2);
    }

    @Override
    public double calcularArea() {
        return (super.getDato1() * 4);

    }

    @Override
    public double calcularPerimetro() {
        return (super.getDato1() + super.getDato1());
    }

}
