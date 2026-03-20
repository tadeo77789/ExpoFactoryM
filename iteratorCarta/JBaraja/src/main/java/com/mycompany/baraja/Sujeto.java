/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.baraja;

/**
 *
 * @author USUARIO
 */
public interface Sujeto {

    void agregarObservador(Observador o);

    void eliminarObservador(Observador o);

    void notificarObservadores(Carta carta);

}
