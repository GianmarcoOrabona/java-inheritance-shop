package org.lessons.java.shop;

import java.math.BigDecimal;

public class Headset extends Product{

    // ATTRIBUTI
    private String type;

    public Headset(String name, String description, BigDecimal price, BigDecimal vat, String type) throws IllegalArgumentException {
        super(name, description, price, vat);
        this.type = type;
    }
}
