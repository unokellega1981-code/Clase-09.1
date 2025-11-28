package org.example.Classes;

import org.example.Interfaces.Observer;

public class CurrentConditionsDisplay implements Observer {

    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("[Valores actuales]");
        System.out.println("Temperatura: " + temperature + "°C");
        System.out.println("Humedad: " + humidity + "%");
        System.out.println("Presión: " + pressure + " hPa");
        System.out.println("----------------------------------------");
    }
}
