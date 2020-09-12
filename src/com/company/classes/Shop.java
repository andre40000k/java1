package com.company.classes;

import com.company.classes.Adddress;

public class Shop
{

    private int code;
    private String name;
    private int quantity;
    private double price;
    private double amount;
    private String shop;
    private ArrayList<Adddress> adddress;


    @Override
    public String toString() {
        return super.toString();
    }

    public Shop(int code, String name, int quantity, double price, double amount, String shop, ArrayList<Adddress> adddress) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.amount = amount;
        this.shop = shop;
        this.adddress = adddress;
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

    public ArrayList<Adddress> getAdddress() { return adddress; }

    public void setAdddress(ArrayList<Adddress> adddress) { this.adddress = adddress; }

    public int getCode() { return code; }

    public void setCode(int code) { this.code = code; }
}
