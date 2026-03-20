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

public class Dealer implements Sujeto {

    private List<Observador> observadores = new ArrayList<>();
    private Baraja baraja;

    public Dealer(Baraja baraja) {
        this.baraja = baraja;
    }

    @Override
    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores(Carta carta) {
        for (Observador o : observadores) {
            o.actualizar(carta);
        }
    }

    public void revelarCartas() {

        Iterador iterador = baraja.crearIterador();

        while (iterador.hasNext()) {
            Carta carta = iterador.next();

            System.out.println("Dealer revela: " + carta);

            notificarObservadores(carta);
        }
    }
}
