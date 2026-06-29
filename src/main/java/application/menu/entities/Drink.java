package application.menu.entities;

import application.menu.enums.DrinkSize;

public class Drink extends MenuItem {
    private DrinkSize drinkSize;
    private boolean isAlcoholic;
    private int alcoholPercentage;

    // constructor
    public Drink(String name, double price, int calories, DrinkSize drinkSize, boolean isAlcoholic, int alcoholPercentage) {
        super(name, price, calories);
        this.drinkSize = drinkSize;
        this.isAlcoholic = isAlcoholic;
        this.alcoholPercentage = alcoholPercentage;
    }

    // getters
    public DrinkSize getDrinkSize() {
        return drinkSize;
    }
    public boolean isAlcoholic() {
        return isAlcoholic;
    }
    public int getAlcoholPercentage() {
        return alcoholPercentage;
    }


    // setters
    public void setDrinkSize(DrinkSize drinkSize) {
        this.drinkSize = drinkSize;
    }
    public void setAlcoholic(boolean isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
        if (!isAlcoholic) { this.setAlcoholPercentage(0); }
    }
    public void setAlcoholPercentage(int alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }


    // methods
    @Override
    public String toString() {
        if (this.isAlcoholic) {
            return this.getName() + ", " + this.getDrinkSize() + ", price: " + getPrice() + ", calories: " + this.getCalories();
        } else {
            return this.getName() + ", " + this.getDrinkSize() + ", alcohol percentage: " + this.getAlcoholPercentage() + ", price: " + getPrice() + ", calories: " + this.getCalories();
        }

    }
}
