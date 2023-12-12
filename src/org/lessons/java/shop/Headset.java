package org.lessons.java.shop;

import java.math.BigDecimal;

public class Headset extends Product{

    // ATTRIBUTI

    private String color;
    private boolean type;

    // COSTRUTTORI

    public Headset(String name, String description, BigDecimal price, BigDecimal vat, String color,boolean type) throws IllegalArgumentException {
        super(name, description, price, vat);
        this.color = color;
        this.type = type;
    }

    // GETTER E SETTER

    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // METODI

    // Faccio un override del metodo della superclasse
    @Override
    public String getProductInfo() {
        String isWireless = type ? "bluetooth" : "cavo";
        return super.getProductInfo() +
                "Colore: " + getColor() + '\n' +
                "Tipo: " + getType();
    }


}
