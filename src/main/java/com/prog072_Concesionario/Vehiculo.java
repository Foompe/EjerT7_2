package com.prog072_Concesionario;

import com.prog072_Excepciones.FaltaRecursos;
import com.prog072_Excepciones.VelocidadMaximaException;
import com.prog072_Interfaces.Reparable;

public class Vehiculo implements Reparable {

    protected String marca;
    protected String modelo;
    protected int velMax;
    protected String color;
    protected int capacidadDepo;
    protected int velocidad;
    protected int combustible;
    protected boolean estadoEncendido = false;

    //constructor con parametros
    public Vehiculo(int capacidadDepo, String color, String marca, String modelo, int velMax) {
        this.capacidadDepo = capacidadDepo;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.velMax = velMax;
    }

    public void circular() {
        if (estadoEncendido) {
            int nivelact = combustible - 10;
            try {
                setCombustible(nivelact);
                System.out.println("Vehiculo circulando");
                System.out.println("Nivel de combustible actual: " + combustible + " %");
            } catch (FaltaRecursos e) {
                System.err.println("Mensaje: " + e.getMessage());
            }
        } else {
            System.out.println("¡El coche no puede circular sin no esta encendido");
        }
    }
    public void encender () throws FaltaRecursos {
        if (combustible <= 0 ) {
            throw new FaltaRecursos("¡Error!¡El coche no tiene combustible!");
        }
        System.out.println("Coche encendido");
        this.estadoEncendido = true;
    }

    public void apagar () {
        this.estadoEncendido = false;
    }

    @Override
    public void reparar() {
        System.out.println("El coche " + marca + " " + modelo + " esta siendo reparado");
        this.combustible = 100;
    }

    //metodo to string
    @Override
    public String toString() {
        return "Vehiculo{" +
                "capacidadDepo=" + capacidadDepo +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velMax=" + velMax +
                ", color='" + color + '\'' +
                '}';
    }

    //getters y setters
    public int getCapacidadDepo() {
        return capacidadDepo;
    }

    public void setCapacidadDepo(int capacidadDepo) {
        this.capacidadDepo = capacidadDepo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) throws VelocidadMaximaException {
        if (velocidad > 120) {
            throw new VelocidadMaximaException("¡Error!¡Velocidad excesiva!");
        }
        this.velocidad = velocidad;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) throws FaltaRecursos {
        if (combustible < 0) {
            throw new FaltaRecursos("¡Error!¡No tienes combustible!");
        }
        this.combustible = combustible;
    }

    public boolean isEstadoEncendido() {
        return estadoEncendido;
    }

    public void setEstadoEncendido(boolean estadoEncendido) {
        this.estadoEncendido = estadoEncendido;
    }
}
