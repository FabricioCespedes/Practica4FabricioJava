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
public class TrapecioIsosceles extends Cuadrilatero implements IFigura{

    public TrapecioIsosceles(double dato3, double dato1, double dato2) {
        super(dato1, dato2);
        this.dato3 = dato3;
    }
    
    double dato3;

    @Override
    public double calcularArea() {
        return (((super.getDato1()+super.getDato2())/2)*calcularAltura()) ;
    }
 
    @Override
    public double calcularPerimetro() {
        return super.getDato1() + super.getDato2() + (2 * dato3) ;
    }

    @Override
    public double calcularAltura() {
        return (1/2* Math.sqrt(4*  Math.pow(dato3, 2) - Math.pow((super.getDato1() - super.getDato2() ), 2)  ));
    }
    
}
