package com.prog072_Concesionario;

import com.prog072_Excepciones.FaltaRecursos;

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
        this.cargaActual = 100;
    }

    public void encender () throws FaltaRecursos {
        if (cargaActual <= 0 ) {
            throw new FaltaRecursos("¡Error!¡El coche no tiene carga!");
        }
        System.out.println("Coche  electrico encendido");
        estadoEncendido = true;
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

    public void setCargaActual(int cargaActual) throws FaltaRecursos {
        if (cargaActual <= 0 ) {
            throw new FaltaRecursos("¡Error!¡El coche no tiene carga!");
        }
        this.cargaActual = cargaActual;
    }
}
