package com.prog072_Principal;

import com.prog072_Concesionario.VehiElectrico;
import com.prog072_Concesionario.Vehiculo;
import com.prog072_Electrodomesticos.Frigorifico;
import com.prog072_Electrodomesticos.Lavadora;
import com.prog072_Excepciones.FaltaRecursos;
import com.prog072_Excepciones.VelocidadMaximaException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //intanciamos vehiculos y mostramos los datos
        Vehiculo coche1 = new Vehiculo(50, "negro", "Toyota", "Celica", 210);
        VehiElectrico cocheelec1 = new VehiElectrico(55, "Blanco", "Toyota", "Corolla", 190, 500, 50);
        System.out.println("Datos\ncoche 1:\n" + coche1 + "\ncoche electrico 1:\n" + cocheelec1);

        //encendemos ambos vehiculos
        try {
            coche1.encender();
        } catch (FaltaRecursos e) {
            System.err.println("Mensaje encendido coche cobustión: " + e.getMessage());

            //Aquí dentro podemos introducir más código, el que queramos, que haga lo que queremos
        }

        try {
            cocheelec1.encender();
        }catch (FaltaRecursos e) {
            System.err.println("Mensaje encendido coche electrico" + e.getMessage());
        }

        //fijamos la velocidad
        try {
            coche1.setVelocidad(120);
            System.out.println("Velocidad fijada coche en: " + coche1.getVelocidad());
        } catch (VelocidadMaximaException e) {
            System.err.println("Mensaje vel coche combus: " + e.getMessage());
        }

        try {
            cocheelec1.setVelocidad(150);
            System.out.println("Velocidad fijada coche electrico en: " + cocheelec1.getVelocidad());
        } catch (VelocidadMaximaException e) {
            System.err.println("Mensaje vel coche elect: " + e.getMessage());
        }


        //simulamos circulacion
        System.out.println("Nivel bateria actual del coche electrico: " + cocheelec1.getCargaActual() + " %");
        for (int i = 0; i < 6; i++) {
            cocheelec1.circular();
        }

        System.out.println("Nivel bateria actual del coche electrico: " + cocheelec1.getCargaActual() + " %");
        cocheelec1.reparar();
        System.out.println("Nivel bateria actual del coche electrico: " + cocheelec1.getCargaActual() + " %");
    }
}