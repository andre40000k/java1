package com.company.classes;

import java.util.function.IntFunction;

public class Address
{


    public Address(int city_id, String street, String home) {
        this.city_id = city_id;
        this.street = street;
        this.home = home;
    }

    private int city_id;
    private String street;
    private String home;


    public int getCity_id() { return city_id; }

    public void setCity_id(int city_id) { this.city_id = city_id; }

    public String getHome() { return home; }

    public void setHome(String home) { this.home = home; }

    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }
}
