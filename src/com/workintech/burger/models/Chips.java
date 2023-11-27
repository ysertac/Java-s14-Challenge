package com.workintech.burger.models;

import com.workintech.burger.enums.ChipsType;

public class Chips {
    private ChipsType chipsType;

    public Chips(ChipsType chipsType) {
        this.chipsType = chipsType;
    }

    public ChipsType getChipsType() {
        return chipsType;
    }
}
