package org.lessons.java.shop;

import java.math.BigDecimal;

public class Tv extends Product{
    // ATTRIBUTI

    private int inches;
    private boolean smart;

    // COSTRUTTORI

    public Tv(String name, String description, BigDecimal price, BigDecimal vat, int inches, boolean smart) throws IllegalArgumentException {
        super(name, description, price, vat);
        this.inches = inches;
        this.smart = smart;
    }

    // GETTER E SETTER

    public boolean getSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }


    // METODI

    // Faccio un override del metodo della superclasse
    @Override
    public String getProductInfo() {
        String isSmart = smart ? "si" : "no";
        return super.getProductInfo() +
                "Dimensioni: " + inches + " pollici" +  '\n' +
                "Smart: " + smart;


    }
}
