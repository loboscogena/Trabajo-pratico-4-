package edu.programacion.ejercicio2403;

public class Main {
    public static void main(String[] args) {
        Temperature temperatura = new Temperature();

        temperatura.setCelsius(25.0);

        System.out.println("Celsius: " + temperatura.getCelsius());
        System.out.println("Fahrenheit: " + temperatura.getFahrenheit());
        System.out.println("Kelvin: " + temperatura.getKelvin());
        System.out.println("Reaumur: " + temperatura.getreaumur());
        System.out.println(
                "25 Celsius a Fahrenheit: " +
                        temperatura.convertTemperature(25, "CELSIUS", "FAHRENHEIT")
        );
        System.out.println(
                "25 Celsius a Kelvin: " +
                        temperatura.convertTemperature(25, "CELSIUS", "KELVIN")
        );
    }

}