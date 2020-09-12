package com.company;

import com.company.classes.Shop;
import com.company.classes.Address;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Shop> shop = new ArrayList<>();
        ArrayList<Address> address = new ArrayList<>();
        address.add(new Address(65900,"Шевченко","46б"));
        shop.add(new Shop(2567, "Milk", 25, 65.9,1000000,"ATB", address));
        System.out.println(shop);
    }
}
