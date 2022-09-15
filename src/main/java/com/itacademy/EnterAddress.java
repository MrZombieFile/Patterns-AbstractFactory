package com.itacademy;

import com.itacademy.interfaces.AbstractFactory;
import com.itacademy.interfaces.Phone;
import com.itacademy.interfaces.Address;
import com.itacademy.interfaces.implem.*;

import java.util.Scanner;

public class EnterAddress implements AbstractFactory {


    @Override
    public Address getPostal(String place) {

        if (place.equalsIgnoreCase("exit")){
            System.out.println(new EmptyAddress().validateAccess()[0]);
            return new EmptyAddress();
        }

        if (place.equalsIgnoreCase("1")){
            return new SpainAddress();
        } else if(place.equalsIgnoreCase("2")){
            return new FranceAddress();
        } else if (place.equalsIgnoreCase("3")){
            return new CanadaAddress();
        } else if (place.equalsIgnoreCase("4")) {
            return new ArgentinaAddress();
        }


        return new EmptyAddress();

    }

    @Override
    public Phone getPhone(String phone) {
        return null;
    }
}
