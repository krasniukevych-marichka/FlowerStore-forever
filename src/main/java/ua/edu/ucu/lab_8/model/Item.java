package ua.edu.ucu.lab_8.model;


public abstract class Item {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double price();
}
