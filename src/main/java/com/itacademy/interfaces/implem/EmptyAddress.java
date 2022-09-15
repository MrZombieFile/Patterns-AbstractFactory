package com.itacademy.interfaces.implem;

import com.itacademy.interfaces.Address;

public class EmptyAddress implements Address {
    @Override
    public void showFormat() {

    }

    @Override
    public String[] validateAccess() {
        return new String[]{"No has introducido una dirección válida"};
    }
}
