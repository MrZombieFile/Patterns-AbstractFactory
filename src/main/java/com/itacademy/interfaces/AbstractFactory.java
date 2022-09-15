package com.itacademy.interfaces;

public interface AbstractFactory {

    Address getPostal(String place);
    Phone getPhone(String phone);


}
