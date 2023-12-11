package org.lessons.java.shop;

import java.math.BigDecimal;

public class Tv extends Product{
    // ATTRIBUTI

    private boolean smart;

    public Tv(String name, String description, BigDecimal price, BigDecimal vat, boolean smart) throws IllegalArgumentException {
        super(name, description, price, vat);
        this.smart = smart;
    }
}
