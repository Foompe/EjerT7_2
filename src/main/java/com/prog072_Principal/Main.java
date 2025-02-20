package com.prog072_Principal;

import com.prog072_Concesionario.VehiElectrico;
import com.prog072_Concesionario.Vehiculo;
import com.prog072_Electrodomesticos.Frigorifico;
import com.prog072_Electrodomesticos.Lavadora;
import com.prog072_Excepciones.VelocidadMaximaException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Vehiculo coche1 = new Vehiculo(50,"negro","Toyota","Celica", 210);
        VehiElectrico cocheelec1 = new VehiElectrico(55,"Blanco", "Toyota", "Corolla", 190,500,50);
        System.out.println("Datos\ncoche 1:\n" + coche1 + "\ncoche electrico 1:\n" + cocheelec1);

        coche1.reparar();
        cocheelec1.reparar();

        try {
            coche1.setVelocidad(120);
            cocheelec1.setVelocidad(150);
        } catch (VelocidadMaximaException e) {
            System.err.println("Mensaje: " + e.getMessage());
        }
        System.out.println("Velocidad fijada coche en: " + coche1.getVelocidad());
        System.out.println("Velocidad fijada coche electrico en: " + cocheelec1.getVelocidad());


        Lavadora lavadora = new Lavadora("Blanco", 50,'A',35, 350.25, 5,true);
        Frigorifico frigorifico = new Frigorifico("Gris",55,'B', 55.35,800.10, true,false, true,2);
        System.out.println("\nInfo electrodomesticos:\nLavadora:\n" + lavadora + "\nFrigorifico:\n" +frigorifico);

        lavadora.reparar();
        frigorifico.reparar();
    }
}