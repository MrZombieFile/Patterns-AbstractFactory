package com.itacademy.interfaces.implem;

import com.itacademy.interfaces.Address;

import java.util.Scanner;

public class CanadaAddress implements Address {
    @Override
    public void showFormat() {
        System.out.println("Destinatario");
        System.out.println("Coordenadas edificio");
        System.out.println("Numero, Calle");
        System.out.println("Nombre localidad. Codigo Postal");
        System.out.println("País");
    }

    @Override
    public String[] validateAccess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el destinatario");
        String destiny = scanner.next();
        System.out.println("Introduce las coordenadas del edificio");
        String building = scanner.next();
        System.out.println("Introduce la calle de destino");
        String street = scanner.next();
        System.out.println("Introduce el numero de la calle");
        String number = scanner.next();
        System.out.println("Datos del piso");
        String appartment = scanner.next();
        System.out.println("Introduce la localidad de destino");
        String borough = scanner.next();
        System.out.println("Introduce el código postal");
        String postCode = scanner.next();
        System.out.println("Introduce el país");
        String country = scanner.next();

        String[] direction = {destiny, "", building, "", number, street, "", borough, postCode, "", country};
        return direction;
    }
}
