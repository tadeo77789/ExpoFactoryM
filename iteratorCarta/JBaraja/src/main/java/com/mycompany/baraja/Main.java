/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baraja;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {

        Baraja baraja = new Baraja();
 
        baraja.agregarCarta(new Carta("Corazones", "A"));
        baraja.agregarCarta(new Carta("Picas", "K"));
        baraja.agregarCarta(new Carta("Diamantes", "10"));
        baraja.agregarCarta(new Carta("Treboles", "7"));

        Dealer dealer = new Dealer(baraja);

        Jugador jugador1 = new Jugador("Luis");
        Jugador jugador2 = new Jugador("Ana");

        dealer.agregarObservador(jugador1);
        dealer.agregarObservador(jugador2);

        dealer.revelarCartas();
        }
}
    