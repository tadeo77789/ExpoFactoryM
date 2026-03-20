/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baraja;

/**
 *
 * @author USUARIO
 */
public class Jugador implements Observador {

    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(Carta carta) {
        System.out.println(nombre + " ve la carta: " + carta);
    }
}