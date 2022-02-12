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
public abstract class Figura {

    public Figura(double dato1, double dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }
    
    double dato1;
    private double dato2;

    public double getDato1() {
        return dato1;
    }

    public void setDato1(double dato1) {
        this.dato1 = dato1;
    }

    public double getDato2() {
        return dato2;
    }

    public void setDato2(double dato2) {
        this.dato2 = dato2;
    }    
    
   abstract public double calcularArea();
   abstract public double calcularPerimetro();

}
