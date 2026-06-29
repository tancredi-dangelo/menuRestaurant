package application.menu;

import application.menu.entities.Drink;
import application.menu.entities.Menu;
import application.menu.entities.Pizza;
import application.menu.entities.Topping;
import application.menu.enums.DrinkSize;
import application.menu.enums.PizzaSize;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class AppConfig {


    // MENU

    @Bean
    public Menu menu(List<Pizza> pizzas,
                     List<Topping> toppings,
                     List<Drink> drinks) {
        return new Menu(pizzas, toppings, drinks);
    }


    // PIZZE

    @Bean
    public Pizza pizzaMargherita() {
        return new Pizza("Margherita", PizzaSize.NORMAL, tomato());
    }

    @Bean
    public Pizza pizzaSalami() {
        return new Pizza("Pizza Salami", PizzaSize.NORMAL, salami());
    }

    @Bean Pizza pizzaHawaii() {
        return new Pizza("Pizza Hawaii", PizzaSize.NORMAL, pineapple());
    }

    @Bean Pizza pizzaCottoEFunghi() {
        return new Pizza("Pizza Romana", PizzaSize.NORMAL, ham(), mushrooms());

    }

    // TOPPING

    @Bean
    public Topping salami() {
        return new Topping("Salami", 1.00, 100);
    }

    @Bean
    public Topping tomato() {
        return new Topping("Tomato", 0.50, 25);
    }

    @Bean
    public Topping cheese() {
        return new Topping("Cheese", 0.50, 40);
    }

    @Bean
    public Topping ham() {
        return new Topping("Ham", 0.50, 90);
    }

    @Bean
    public Topping mushrooms() {
        return new Topping("Mushrooms", 0.50, 25);
    }

    @Bean
    public Topping onion() {
        return new Topping("Onion", 0.50, 25);
    }

    @Bean
        public Topping pineapple() {
        return new Topping("Pineapple", 0.50, 25);
    }



    // DRKIK
    @Bean
    public Drink cocaCola() {
        return new Drink("Coca Cola", 2, 200, DrinkSize.CL33, false, 0);
    }

    @Bean
    public Drink fanta() {
        return new Drink("Fanta", 2, 150, DrinkSize.CL33, false, 0);
    }

    @Bean
    public Drink waterLarge() {
        return new Drink("Water .75L", 2.50, 0, DrinkSize.CL75, false, 0);
    }

    @Bean
    public Drink beer() {
        return new Drink("Beer", 3, 200, DrinkSize.CL50, true, 5);
    }


    


}
