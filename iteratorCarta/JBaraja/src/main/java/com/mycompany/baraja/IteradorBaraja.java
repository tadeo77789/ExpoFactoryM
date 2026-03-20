/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baraja;

/**
 *
 * @author USUARIO
 */
import java.util.List;

public class IteradorBaraja implements Iterador {

    private List<Carta> cartas;
    private int posicion = 0;

    public IteradorBaraja(List<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public boolean hasNext() {
        return posicion < cartas.size();
    }

    @Override
    public Carta next() {
        return cartas.get(posicion++);
    }
}