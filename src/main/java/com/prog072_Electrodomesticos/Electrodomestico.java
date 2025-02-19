package com.prog072_Electrodomesticos;

import com.prog072_Interfaces.Reparable;

abstract class Electrodomestico implements Reparable {

    protected double precio;
    protected String color;
    protected int dimensiones;
    protected double peso;
    protected char eficienciaEner;

    public String getColor() {
        return color;
    }

    @Override
    public void reparar() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }

    public char getEficienciaEner() {
        return eficienciaEner;
    }

    public void setEficienciaEner(char eficienciaEner) {
        this.eficienciaEner = eficienciaEner;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
