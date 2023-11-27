package com.workintech.burger.models;

import com.workintech.burger.enums.BreadRollType;

public class DeluxeBurger extends Hamburger {
    private Drink drink;
    private Chips chips;
    public DeluxeBurger(Drink drink, Chips chips) {
        super("DELUXE BURGER", "DOUBLE", 19.10, BreadRollType.DOUBLE_BURGER);
        this.drink = drink;
        this.chips = chips;
    }

    @Override
    public void add(String name, double price) {
        System.out.println("\nDeluxe Burger can not take any addition!");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("DRINK: " + drink.getType() + "\n");
        builder.append("CHIPS: " + chips.getChipsType() + "\n");
        System.out.println(builder + "\n");
        super.itemizeHamburger();
    }
}
