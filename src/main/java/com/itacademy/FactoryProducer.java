package com.itacademy;

import com.itacademy.interfaces.AbstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String kindOfRegistry){

        if (kindOfRegistry.equalsIgnoreCase("1")){
            return new EnterAddress();
        }else if (kindOfRegistry.equalsIgnoreCase("2")){
            return new EnterPhone();
        }

        return null;
    }



}
