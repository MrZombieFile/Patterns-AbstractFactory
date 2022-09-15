package com.itacademy.interfaces.implem;

import com.itacademy.interfaces.Phone;

import java.util.Scanner;

public class SpainPhone  implements Phone{
    @Override
    public void showFormat() {
        System.out.println("xxx.xxx.xxx");
    }

    @Override
    public String validateAccess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuál es el numero?");
        String numeroEnString = scanner.next();
        String prefix = "+34";
        return prefix + numeroEnString;

    }
}
