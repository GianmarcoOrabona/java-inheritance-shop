package org.lessons.java.shop;

public class Category {
    // ATTRIBUTI

    private String name;
    private String description;

    // COSTRUTTORI


    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // GETTER E SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    // METODI


    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
