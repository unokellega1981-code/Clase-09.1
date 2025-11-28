package org.example.Classes;

import org.example.Interfaces.Observer;

public class AlertDisplay implements Observer {

    @Override
    public void update(double temperature, double humidity, double pressure) {

        System.out.println("[Avisos de alerta]");

        boolean alert = false;

        if (temperature > 30) {
            System.out.println("ALERTA: Temperatura muy alta: " + temperature + "°C");
            alert = true;
        }

        if (pressure < 1000) {
            System.out.println("ALERTA: Posible tormenta (presión baja: " + pressure + " hPa)");
            alert = true;
        }

        if (!alert) {
            System.out.println("Sin alertas.");
        }

        System.out.println("----------------------------------------");
    }
}