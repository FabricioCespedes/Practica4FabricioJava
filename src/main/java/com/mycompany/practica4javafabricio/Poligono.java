/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4javafabricio;

/**
 *
 * @author Sergio
 */
public abstract class Poligono  extends Figura{
    
    public Poligono(double dato1, double dato2) {
        super(dato1, dato2);
    }
    
    public double getApotema(int lados){
        return  lados / 2 * Math.tan(super.getDato1()/2) ;
    }
    
}
