/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4javafabricio;

/**
 *
 * @author Sergio
 */
public class TrianguloEquilatero extends Triangulo {

    public TrianguloEquilatero(double dato1, double dato2) {
        super(dato1, dato2);
    }

    @Override
    public double calcularArea() {
        return ( (Math.pow(super.getDato1(),2) *  Math.sqrt(super.getDato1()) ) / 4 );
    }

    @Override
    public double calcularPerimetro() {
        return super.getDato1() * 3 ;
    }
    
}
