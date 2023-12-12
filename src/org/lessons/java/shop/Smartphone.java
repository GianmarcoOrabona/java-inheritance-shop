package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product{

    // ATTRIBUTI

    private int imei;
    private int storage;

    // COSTRUTTORI

    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, int storage) throws IllegalArgumentException {
        super(name, description, price, vat);
        this.imei = createImeiCode();
        this.storage = storage;
    }

    // GETTER E SETTER

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }


    // METODI

    // Faccio un override del metodo della superclasse
    @Override
    public String getProductInfo() {
        return super.getProductInfo() +
                "Imei: " + getImei() + '\n' +
                "Memoria: " + getStorage() + "Gb";
    }

    private int createImeiCode(){
        Random random= new Random();
        return random.nextInt(1000, Integer.MAX_VALUE);
    }
}
