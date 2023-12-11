package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    // ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;


    // COSTRUTTORI

    public Product(String name, String description, BigDecimal price, BigDecimal vat) throws IllegalArgumentException{
        validateName(name);
        validatePrice(price);
        validateVat(vat);
        codeGenerator();
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }


    // GETTER E SETTER

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException{
        validateName(name);
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }


    // METODI


    // Metodo che mi genera un codice casuale
    private void codeGenerator () {
        Random randomCode = new Random();
        this.code = randomCode.nextInt(1, 10001);
    }

    // Metodo che mi calcola il prezzo con l'iva
    public BigDecimal getVatPrice() {
        BigDecimal vatPrice = price.multiply(vat);
        return price.add(vatPrice).setScale(2, RoundingMode.HALF_EVEN);
    }

    // Metodo che mi stampa codice-nome dell'oggetto
    public String getFullName() {
        return "<-----Product----->" + '\n' +
                getCode() + " - " + getName() + '\n';
    }

    // Metodo che mi stampa le informazioni dell'oggetto
    public String getProductInfo() {
        return getFullName() +

                " " + '\n' +
                "<-----Product Info----->" + '\n' +
                "Name: " + getName() + '\n' +
                "Description: " + getDescription() + '\n' +
                "Price without VAT: " + getPrice() + " €" + '\n' +
                "Price + VAT: " + getVatPrice() + " €" + '\n' +
                "Product Code: " + getCode() + '\n';
    }

    // metodi di validazione
    private void validateName(String name) throws IllegalArgumentException{
        if(name == null || name.isEmpty()){
            // name non è valido
            throw new IllegalArgumentException("name empty");
        }
    }

    private void validatePrice(BigDecimal price) throws IllegalArgumentException{
        if(price == null || price.compareTo(new BigDecimal(0)) < 0){
            // prezzo negativo
            throw new IllegalArgumentException("price negative " + price);
        }
    }

    private void validateVat(BigDecimal vat) throws IllegalArgumentException{
        if(vat == null || vat.compareTo(new BigDecimal(0))< 0){
            throw new IllegalArgumentException("vat negative " + vat);
        }
    }

}