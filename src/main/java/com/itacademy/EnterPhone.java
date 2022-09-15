package com.itacademy;

import com.itacademy.interfaces.AbstractFactory;
import com.itacademy.interfaces.Address;
import com.itacademy.interfaces.Phone;
import com.itacademy.interfaces.implem.*;

import java.util.Scanner;

public class EnterPhone implements AbstractFactory {


    @Override
    public Phone getPhone(String number) {

        if (number == null){
            return new EmptyPhone();
        }

        if (number.equalsIgnoreCase("1")){
            return new SpainPhone();
        }else if (number.equalsIgnoreCase("2")){
            return new FrancePhone();
        }else if (number.equalsIgnoreCase("4")){
            return new ArgentinaPhone();
        }else if (number.equalsIgnoreCase("3")){
            return new CanadaPhone();
        }

        return new EmptyPhone();
    }

    @Override
    public Address getPostal(String place) {
        return null;
    }
}
