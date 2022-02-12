/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4javafabricio;

/**
 *
 * @author Fabricio
 */
public class Pentagono extends Poligono {

    public Pentagono(double dato1, double dato2) {
        super(dato1, dato2);
    }

    @Override
    public double calcularArea() {
        return (5 * super.getDato1() * super.getApotema(5))/2;
    }

    @Override
    public double calcularPerimetro() {
        return 5* super.getDato1();
    }
    
}
