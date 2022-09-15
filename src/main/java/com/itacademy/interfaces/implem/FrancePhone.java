package com.itacademy.interfaces.implem;

import com.itacademy.interfaces.Phone;

import java.util.Scanner;

public class FrancePhone  implements Phone{


    @Override
    public void showFormat() {
        System.out.println("x.xx.xx.xx.xx");
    }

    @Override
    public String validateAccess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuál es el numero?");
        String numeroEnString = scanner.next();
        String prefix = "+33";
        return prefix + numeroEnString;

    }
}
