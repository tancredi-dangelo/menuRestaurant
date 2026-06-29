package application.menu.entities;

public abstract class MenuItem {
    private String name;
    private double price;
    private int calories;

    // constructor
    public MenuItem(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    // getters

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getCalories() {
        return calories;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }

}
