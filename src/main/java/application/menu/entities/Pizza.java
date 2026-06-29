package application.menu.entities;

import application.menu.enums.PizzaSize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza extends MenuItem{
    private String name;
    private PizzaSize pizzaSize;
    private double price;
    private int calories;
    private List<Topping> toppings;

    // constructor
    public Pizza(String name, PizzaSize pizzaSize, Topping... toppings) {
        super(name, 0, 0);
        this.pizzaSize = pizzaSize;
        this.toppings = Arrays.asList(toppings);
        
        double price = (pizzaSize == PizzaSize.XL) ? 6.99 : 4.99;
        int calories = (pizzaSize == PizzaSize.XL) ? 1000: 800;

        for (Topping topping : this.toppings) {
            price += topping.getPrice();
            calories += topping.getCalories();
        }

        setPrice(price);
        setCalories(calories);

    }


    // getters
    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }
    public List<Topping> getToppings() {
        return toppings;
    }
    public double getPrice() {
        return price;
    }



    // setters
    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
        if (pizzaSize == PizzaSize.XL) { this.setCalories(this.getCalories() + 200); }
    }
    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
    public void setBasePrice(double price) {
        this.price = price;
    }


    // methods

    @Override
    public String toString() {
        return this.getName() + ": " + this.getToppings() + ", size: " + this.getPizzaSize() + ", price: " + getPrice() + ", calories: " + this.getCalories();
    }
}
