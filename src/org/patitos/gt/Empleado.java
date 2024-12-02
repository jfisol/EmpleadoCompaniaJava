package org.patitos.gt;

public class Empleado extends Persona{

    private double remuneracion;

    private static int empleadoId = 0;

    private int porcentaje;

    private double aumentoRemuneracion;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId++;

    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public double aumentaRemuneracion(double porcentaje){
       return this.remuneracion * (porcentaje/100);
    }

    @Override
    public String toString() {
        return super.toString() +
                "remuneracion=" + remuneracion + "\n"+
                "empleadoId=" + empleadoId+ "\n";

    }
}
