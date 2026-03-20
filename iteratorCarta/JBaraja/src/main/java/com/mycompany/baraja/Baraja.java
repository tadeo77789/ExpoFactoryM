/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baraja;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
import java.util.List;

public class Baraja implements Agregador {

    private List<Carta> cartas = new ArrayList<>();

    public void agregarCarta(Carta c) {
        cartas.add(c);
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    @Override
    public Iterador crearIterador() {
        return new IteradorBaraja(cartas);
    }
}
