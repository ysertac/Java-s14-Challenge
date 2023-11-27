package com.workintech.burger;

import com.workintech.burger.enums.BreadRollType;
import com.workintech.burger.enums.ChipsType;
import com.workintech.burger.enums.DrinkType;
import com.workintech.burger.models.*;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Hamburger", "normal", 9.90, BreadRollType.WRAP);
        hamburger.add("Pickle", 1.90);
        hamburger.add("Tomato", 2.90);
        hamburger.itemizeHamburger();
        DeluxeBurger deluxeBurger = new DeluxeBurger(new Drink(DrinkType.COKE), new Chips(ChipsType.FRENCH_FRIES));
        deluxeBurger.itemizeHamburger();
        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.90, BreadRollType.SANDWICH);
        healthyBurger.add("Pickle", 1.90);
        healthyBurger.add("Tomato", 2.90);
        healthyBurger.itemizeHamburger();
    }
}