package org.lessons.java.shop;

import java.math.BigDecimal;

public class Headset extends Product{

    // ATTRIBUTI

    private String color;
    private String type;

    // COSTRUTTORI

    public Headset(String name, String description, BigDecimal price, BigDecimal vat, String color,String type) throws IllegalArgumentException {
        super(name, description, price, vat);
        this.color = color;
        this.type = type;
    }

    // GETTER E SETTER

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // METODI

    @Override
    public String getProductInfo() {
        return super.getProductInfo() + '\n' +
                "Colore: " + getColor() + '\n' +
                "Tipo: " + getType();
    }
}
