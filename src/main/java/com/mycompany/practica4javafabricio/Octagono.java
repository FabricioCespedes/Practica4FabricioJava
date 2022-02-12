/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4javafabricio;

/**
 *
 * @author Fabricio
 */
public class Octagono extends Poligono {

    public Octagono(double dato1, double dato2) {
        super(dato1, dato2);
    }

    @Override
    public double calcularArea() {
        return (8 * super.getDato1() * super.getApotema(8))/2;
    }

    @Override
    public double calcularPerimetro() {
        return 8* super.getDato1();
    }
    
}
