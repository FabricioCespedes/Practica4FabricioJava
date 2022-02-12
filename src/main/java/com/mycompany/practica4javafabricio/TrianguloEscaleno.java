/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4javafabricio;

/**
 *
 * @author Sergio
 */
public class TrianguloEscaleno extends Triangulo{

    public TrianguloEscaleno(double dato3, double dato1, double dato2) {
        super(dato1, dato2);
        this.dato3 = dato3;
    }

    double dato3;
    @Override
    public double calcularArea() {
        double semiPerimetro = calcularPerimetro() / 2 ;
        return (  Math.sqrt(semiPerimetro * (semiPerimetro-super.getDato1() ) * (semiPerimetro - super.getDato2() ) * (semiPerimetro - dato3))   ); 
    }

    @Override
    public double calcularPerimetro() {
        return super.getDato1() + super.getDato2() + dato3;
    }
    
}
