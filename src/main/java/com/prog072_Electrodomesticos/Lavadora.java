package com.prog072_Electrodomesticos;

public class Lavadora extends Electrodomestico{

    protected int kgCarga;
    protected boolean progLavRapido;

    public Lavadora(String color, int dimensiones, char eficienciaEner, double peso, double precio, int kgCarga, boolean progLavRapido) {
        this.color = color;
        this.dimensiones = dimensiones;
        this.eficienciaEner = eficienciaEner;
        this.peso = peso;
        this.precio = precio;
        this.kgCarga = kgCarga;
        this.progLavRapido = progLavRapido;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", peso=" + peso +
                ", eficienciaEner=" + eficienciaEner +
                ", dimensiones=" + dimensiones +
                ", color='" + color + '\'' +
                ", progLavRapido=" + progLavRapido +
                ", kgCarga=" + kgCarga +
                '}';
    }

    @Override
    public void reparar() {
        System.out.println("La lavadora color " + color + " esta siendo reparada");
    }

    public int getKgCarga() {
        return kgCarga;
    }

    public void setKgCarga(int kgCarga) {
        this.kgCarga = kgCarga;
    }

    public boolean isProgLavRapido() {
        return progLavRapido;
    }

    public void setProgLavRapido(boolean progLavRapido) {
        this.progLavRapido = progLavRapido;
    }
}
