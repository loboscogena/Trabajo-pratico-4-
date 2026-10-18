package edu.programacion.ejercicio2403;

public class Temperature {

    private double celsius;

    public Temperature() {
        this.celsius = 0.0;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double value) {
        this.celsius = value;
    }

    public double getFahrenheit() {
        return celsius * 1.8 + 32;
    }

public void setFahrenheit(double value) {
        this.celsius = (value - 32) / 1.8;
    }
    public double getKelvin() {
        return celsius  + 273.15;
    }
    public void setKelvin(double value) {
        this.celsius = (value - 273.15) / 1.8;
    }
    public double getrankine() {
        return (celsius * 9 / 5 ) + 491.67;
    }
    public void setrankine(double value) {
        this.celsius = (value - 491.61) * 5 / 9;
    }
    public double getreaumur() {
        return (celsius * 4) /5 ;
    }
    public void setreaumur(double value) {
        this.celsius = (value * 5) /4;
    }
    public double convertTemperature(double value, String scale, String targetScale) {

        if (scale.equalsIgnoreCase("CELSIUS")) {
            setCelsius(value);
        } else if (scale.equalsIgnoreCase("FAHRENHEIT")) {
            setFahrenheit(value);
        } else if (scale.equalsIgnoreCase("KELVIN")) {
            setKelvin(value);
        } else if (scale.equalsIgnoreCase("RANKINE")) {
            setrankine(value);
        } else if (scale.equalsIgnoreCase("REAUMUR")) {
            setreaumur(value) ;
        }

        if (targetScale.equalsIgnoreCase("CELSIUS")) {
            return getCelsius();
        } else if (targetScale.equalsIgnoreCase("FAHRENHEIT")) {
            return getFahrenheit();
        } else if (targetScale.equalsIgnoreCase("KELVIN")) {
            return getKelvin();
        } else if (targetScale.equalsIgnoreCase("RANKINE")) {
            return getrankine ();
        } else if (targetScale.equalsIgnoreCase("REAUMUR")) {
            return getreaumur();
        }

        throw new IllegalArgumentException("escala no valida");
    }
}