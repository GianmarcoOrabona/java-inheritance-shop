package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product{

    // ATTRIBUTI

    private int imei;
    private int storage;

    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, int imei, int storage) throws IllegalArgumentException {
        super(name, description, price, vat);
        this.imei = imei;
        this.storage = storage;
    }
}
