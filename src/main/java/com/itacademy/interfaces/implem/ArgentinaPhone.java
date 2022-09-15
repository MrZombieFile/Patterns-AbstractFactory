package com.itacademy.interfaces.implem;

import com.itacademy.interfaces.Phone;

import java.util.Scanner;

public class ArgentinaPhone  implements Phone{
    @Override
    public void showFormat() {
        System.out.println("xxx.xxx.xxxx");
    }

    @Override
    public String validateAccess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuál es el numero?");
        String numeroEnString = scanner.next();
        String prefix = "+549";
        return prefix + numeroEnString;

    }
}
