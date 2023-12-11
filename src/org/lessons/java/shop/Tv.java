package org.lessons.java.shop;

import java.math.BigDecimal;

public class Tv extends Product{
    // ATTRIBUTI

    private int inches;
    private String smart;

    // COSTRUTTORI

    public Tv(String name, String description, BigDecimal price, BigDecimal vat, int inches, String smart) throws IllegalArgumentException {
        super(name, description, price, vat);
        this.inches = inches;
        this.smart = smart;
    }

    // GETTER E SETTER

    public String isSmart() {
        return smart;
    }

    public void setSmart(String smart) {
        this.smart = smart;
    }


    // METODI

    @Override
    public String getProductInfo() {
        return super.getProductInfo() +
                "Dimensioni: " + inches + " pollici" +  '\n' +
                "Smart: " + smart;


    }
}
