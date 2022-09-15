package com.itacademy.interfaces.implem;

import com.itacademy.interfaces.Address;

import java.util.Scanner;

public class ArgentinaAddress implements Address {
    @Override
    public void showFormat() {

        System.out.println("Destinatario");
        System.out.println("Nombre de la calle y número de la altura del domicilio");
        System.out.println("Piso, departamento o barrio");
        System.out.println("Código postal");
        System.out.println("Localidad");


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
        System.out.println("Introduce los datos del piso");
        String appartment = scanner.next();
        System.out.println("Introduce el departamento o barrio");
        String neighborhood = scanner.next();
        System.out.println("Introduce la localidad de destino");
        String borough = scanner.next();
        System.out.println("Introduce el código postal");
        String postCode = scanner.next();

        String[] direction = {destiny, "", street, number, "", appartment, borough,"", postCode, neighborhood};
        return direction;
    }
}

