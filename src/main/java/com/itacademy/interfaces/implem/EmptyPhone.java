package com.itacademy.interfaces.implem;

import com.itacademy.interfaces.Phone;

public class EmptyPhone implements Phone {
    @Override
    public void showFormat() {
        System.out.println("No tiene formato");
    }

    @Override
    public String validateAccess() {
        return "No has introducido un telefono válido";

    }
}
