package com.prog072_Concesionario;

import com.prog072_Interfaces.Reparable;

public class Vehiculo implements Reparable {

    protected String marca;
    protected String modelo;
    protected int velMax;
    protected String color;
    protected int capacidadDepo;

    //constructor con parametros
    public Vehiculo(int capacidadDepo, String color, String marca, String modelo, int velMax) {
        this.capacidadDepo = capacidadDepo;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.velMax = velMax;
    }

    @Override
    public void reparar() {
        System.out.println("El coche " + marca + " " + modelo + " esta siendo reparado");
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
}
