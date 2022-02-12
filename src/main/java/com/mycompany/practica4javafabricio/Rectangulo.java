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
public class Rectangulo extends Cuadrilatero {

    public Rectangulo(double dato1, double dato2) {
        super(dato1, dato2);
    }

    @Override
    public double calcularArea() {
        return (super.getDato1()*super.getDato2());
    }

    @Override
    public double calcularPerimetro() 
    {        
        return (2* super.getDato1() + 2*super.getDato2());
    }
    
    
}
