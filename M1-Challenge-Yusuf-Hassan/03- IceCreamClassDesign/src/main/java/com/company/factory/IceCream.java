package com.company.factory;

import java.util.Objects;

public class IceCream {

    private String flavor;
    private double saleOfPrice;
    private double productionCost;
    private double productionTime;
    private String ingredients;

    public IceCream(String flavor, double saleOfPrice, double productionCost, double productionTime, String ingredients) {
        this.flavor = flavor;
        this.saleOfPrice = saleOfPrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

    public double profit(double saleOfPrice, double productionCost) {
        double profit = saleOfPrice - productionCost;
        System.out.println("Cost of the ice cream is: " + profit);
        return profit;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSaleOfPrice() {
        return saleOfPrice;
    }

    public void setSaleOfPrice(double saleOfPrice) {
        this.saleOfPrice = saleOfPrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public double getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(double productionTime) {
        this.productionTime = productionTime;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", saleOfPrice=" + saleOfPrice +
                ", productionCost=" + productionCost +
                ", productionTime=" + productionTime +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
