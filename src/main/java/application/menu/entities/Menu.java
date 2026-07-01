package application.menu.entities;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Menu {
    private List<Pizza> pizzas;
    private List<Drink> drinks;
    private List<Topping> toppings;

    // constructor
    public Menu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.toppings = toppings;
        this.drinks = drinks;
    }
}
