package org.example.Classes;

import org.example.Interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer {

    private List<Double> temperatureHistory = new ArrayList<>();

    @Override
    public void update(double temperature, double humidity, double pressure) {
        temperatureHistory.add(temperature);

        double max = temperatureHistory.stream().max(Double::compare).orElse(temperature);
        double min = temperatureHistory.stream().min(Double::compare).orElse(temperature);
        double avg = (double) temperatureHistory.stream().mapToDouble(Double::doubleValue).average().orElse(temperature);

        System.out.println("[Valores medios]");
        System.out.println("Media temp: " + avg + "°C");
        System.out.println("Máx temp: " + max + "°C");
        System.out.println("Mín temp: " + min + "°C");
        System.out.println("----------------------------------------");
    }
}
