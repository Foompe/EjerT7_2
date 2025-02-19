package com.prog072_Concesionario;

public class VehiElectrico extends Vehiculo {

    //atributos de clase
    protected int capacidadBateria;
    protected int cargaActual;


    //constructor
    public VehiElectrico(int capacidadDepo, String color, String marca, String modelo, int velMax, int capacidadBateria, int cargaActual) {
        super(capacidadDepo, color, marca, modelo, velMax);
        this.capacidadBateria = capacidadBateria;
        this.cargaActual = cargaActual;
    }

    @Override
    public void reparar() {
        System.out.println("El coche electrico " + marca + " " + modelo + " esta siendo reparado");
    }

    //metodo to string
    @Override
    public String toString() {
        return "VehiElectrico{" +
                "capacidadBateria=" + capacidadBateria +
                ", cargaActual=" + cargaActual +
                ", capacidadDepo=" + capacidadDepo +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velMax=" + velMax +
                '}';
    }

    //getters y setters
    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }
}
