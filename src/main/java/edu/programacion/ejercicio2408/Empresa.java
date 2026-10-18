package edu.programacion.ejercicio2408;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>() ;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public double montoTotal() {
        double total = 0;

        for (Empleado empleado : empleados)   {
            total += empleado.calcularSueldo();
        }

        return total;
    }
}

