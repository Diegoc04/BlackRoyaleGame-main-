package com.escuelagaing.edu.co.model;

import java.util.ArrayList;


public class Dealer extends Player {
    public Dealer(String roomId) {
        super(null, roomId, Double.MAX_VALUE); // Sin user, pero con roomId
        this.name = "Dealer"; // Asigna un nombre específico para el dealer
        this.hand = new ArrayList<>(); // Inicializa la mano del dealer
    }
}
