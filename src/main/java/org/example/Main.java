package org.example;

import org.example.Classes.AlertDisplay;
import org.example.Classes.CurrentConditionsDisplay;
import org.example.Classes.StatisticsDisplay;
import org.example.Classes.WeatherStation;
import org.example.Interfaces.Observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        Observer current = new CurrentConditionsDisplay();
        Observer stats = new StatisticsDisplay();
        Observer alert = new AlertDisplay();

        station.registerObserver(current);
        station.registerObserver(stats);
        station.registerObserver(alert);

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("== Actualización " + i + " ==");

            System.out.print("Introduce la temperatura: ");
            double temperatura = scanner.nextDouble();

            System.out.print("Introduce la humedad: ");
            double humedad = scanner.nextDouble();

            System.out.print("Introduce la presión: ");
            double presion = scanner.nextDouble();

            station.setMeasurements(temperatura, humedad, presion);
        }

        scanner.close();
    }
}
