package com.company.pointofsale;

public class IceCream {

    private String flavor;
    private double price;
    private int quantity;

    public IceCream(String flavor, double price, int quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

    public IceCream() {
    }

    public double totalSalesForAFlavor(String flavor, double price, int quantity) {
        if(flavor == "Chocolate") {
            double sales = price * quantity;
            System.out.println("Total sales of chocolate ice cream are: " + sales);
            return sales;
        } else if(flavor == "Vanilla") {
            double sales = price * quantity;
            System.out.println("Total sales of vanilla ice cream are: " + sales);
            return sales;
        } else {
            double sales = price * quantity;
            System.out.println("Total sales of mango ice cream are: " + sales);
            return sales;
        }
    }

    public boolean inHighStock(int quantity) {
        boolean availableHigh = true;
        boolean notAvailable = false;
        if(quantity >= 30) {
            return availableHigh;
        } else {
            return notAvailable;
        }
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
