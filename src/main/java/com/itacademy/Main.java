package com.itacademy;

import com.itacademy.interfaces.AbstractFactory;
import com.itacademy.interfaces.Address;
import com.itacademy.interfaces.Phone;
import com.itacademy.interfaces.implem.EmptyAddress;
import com.itacademy.interfaces.implem.EmptyPhone;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String action = new String();
        while(!action.equals("3")){
            action = getAction();
            Address address;
            Phone phone;
            //  1-direction , 2-telephone
            AbstractFactory factoryAgenda = FactoryProducer.getFactory(action);

            if (action.equals("1") || action.equals("2") || !action.equals("3")) {
                    if (action.equals("1")) {
                        address = factoryAgenda.getPostal(getCountryAddress());
                        address.validateAccess();
                    } else if (action.equals("2")) {
                        phone = factoryAgenda.getPhone(getCountryPhone());
                        phone.validateAccess();
                    }
            }


        }

        System.out.println("Hasta luego");



    }

    public static String getAction(){
        System.out.println("Selecciona qué quieres");
        System.out.println("1- Para guardar una dirección");
        System.out.println("2- Para guardar un telefono");
        System.out.println("3- Salir");

        Scanner scanner = new Scanner(System.in);
        String toReturn = scanner.next();

        return toReturn;
    }

    public static String getCountryPhone(){
        System.out.println("Selecciona el país");
        System.out.println("1- España");
        System.out.println("2- Francia");
        System.out.println("3- Canadá");
        System.out.println("4- Argentina");
        System.out.println("5- Atrás");

        Scanner scanner = new Scanner(System.in);
        String toReturn = scanner.next();
        return toReturn;
    }

    public static String getCountryAddress(){
        System.out.println("Selecciona el país");
        System.out.println("1- España");
        System.out.println("2- Francia");
        System.out.println("3- Canadá");
        System.out.println("4- Argentina");
        System.out.println("5- Atrás");

        Scanner scanner = new Scanner(System.in);
        String toReturn = scanner.next();
        return toReturn;
    }


}