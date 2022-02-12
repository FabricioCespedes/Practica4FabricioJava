/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4javafabricio;

/**
 *
 * @author Fabricio
 */
public class TrianguloIsosceles extends Triangulo implements IFigura {

    public TrianguloIsosceles(double dato1, double dato2) {
        super(dato1, dato2);
    }

    @Override
    public double calcularArea() {
        return (super.getDato2()*calcularAltura())/2; 
    }

    @Override
    public double calcularPerimetro() {
        return 2*super.getDato1() + super.getDato2();
    }

    @Override
    public double calcularAltura() {
        return (Math.sqrt(  Math.pow(super.getDato1(),2) - ( Math.pow(super.getDato1(),2) / 4 ) )) ; 
    }
    
}
