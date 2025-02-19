package com.prog072_Electrodomesticos;

public class Frigorifico extends Electrodomestico {

    protected int nPuertas;
    protected boolean congelador;
    protected boolean botellero;
    protected boolean luzInterior;

    public Frigorifico(String color, int dimensiones, char eficienciaEner, double peso, double precio, boolean botellero, boolean congelador, boolean luzInterior, int nPuertas) {
        this.color = color;
        this.dimensiones = dimensiones;
        this.eficienciaEner = eficienciaEner;
        this.peso = peso;
        this.precio = precio;
        this.botellero = botellero;
        this.congelador = congelador;
        this.luzInterior = luzInterior;
        this.nPuertas = nPuertas;
    }

    @Override
    public String toString() {
        return "Frigorifico{" +
                "botellero=" + botellero +
                ", nPuertas=" + nPuertas +
                ", congelador=" + congelador +
                ", luzInterior=" + luzInterior +
                ", color='" + color + '\'' +
                ", dimensiones=" + dimensiones +
                ", eficienciaEner=" + eficienciaEner +
                ", peso=" + peso +
                ", precio=" + precio +
                '}';
    }

    @Override
    public void reparar() {
        System.out.println("El frigorifico color " + color + " esta siendo reparado");
    }

    public boolean isBotellero() {
        return botellero;
    }

    public void setBotellero(boolean botellero) {
        this.botellero = botellero;
    }

    public boolean isCongelador() {
        return congelador;
    }

    public void setCongelador(boolean congelador) {
        this.congelador = congelador;
    }

    public boolean isLuzInterior() {
        return luzInterior;
    }

    public void setLuzInterior(boolean luzInterior) {
        this.luzInterior = luzInterior;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }
}
