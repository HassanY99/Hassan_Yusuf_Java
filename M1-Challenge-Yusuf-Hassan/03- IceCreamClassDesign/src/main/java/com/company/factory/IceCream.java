package com.company.factory;

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

    public IceCream() {
    }

    public double profit(double saleOfPrice, double productionCost) {
        double profit = saleOfPrice - productionCost;
        System.out.println("The profit made from one ice cream sale is: " + profit);
        return profit;
    }

    public boolean mostPopularFlavor(String flavor) {
        boolean popular = true;
        boolean notPopular = false;
        int averageSalePerDay = 0;
        if(flavor == "Chocolate" && averageSalePerDay > 50) {
            return popular;
        } else if(flavor == "Vanilla" && averageSalePerDay > 40) {
            return popular;
        } else if(flavor == "Peach" && averageSalePerDay < 10) {
            return notPopular;
        } else if(flavor == "Strawberry" && averageSalePerDay < 5) {
            return notPopular;
        }

        return popular;
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
