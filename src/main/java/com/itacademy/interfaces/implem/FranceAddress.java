package com.itacademy.interfaces.implem;

import com.itacademy.interfaces.Address;

import java.util.ArrayList;
import java.util.Scanner;

public class FranceAddress implements Address {
    @Override
    public void showFormat() {
        System.out.println("Destinatario");
        System.out.println("Número, calle.");
        System.out.println("Codigo Postal, Comuna");
    }

    @Override
    public String[] validateAccess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el destinatario");
        String destiny = scanner.next();
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

        String[] direction = {destiny, "", number, street, "", postCode, borough};
        return direction;
    }
}

