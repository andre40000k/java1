package com.company.classes;


import java.util.ArrayList;

public class Shop
{

    private int code;
    private String name;
    private int quantity;
    private double price;
    private double amount;
    private String shop;
    private ArrayList<Address> address;




    public Shop(int code, String name, int quantity, double price, double amount, String shop, ArrayList<Address> address) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.amount = amount;
        this.shop = shop;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Shop{" +'\n' +
                "  code=" + code +'\n' +
                ", name=" + name + '\n' +
                ", quantity=" + quantity +'\n' +
                ", price=" + price +'\n' +
                ", amount=" + amount +'\n' +
                ", shop=" + shop + '\n' +
                ", address=" + address +'\n' +
                "}";
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }

    public String getShop() { return shop; }

    public void setShop(String shop) { this.shop = shop; }

    public ArrayList<Address> getAddress() { return address; }

    public void setAddress(ArrayList<Address> address) { this.address = address; }

    public int getCode() { return code; }

    public void setCode(int code) { this.code = code; }
}
