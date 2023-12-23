package com.example.mygarageapp;

// Import the Serializable interface

import java.io.Serializable;

// A class to represent an item
public class RecyclerViewItemModel implements Serializable {

    // Instance variables
    private double price; // The price of the item
    private String image; // The image of the item
    private String model; // The model of the item
    private String title; // The title of the item

    private String webUrl; // The title of the item
    // Constructor
    public RecyclerViewItemModel(double price, String image, String model, String title,String webUrl) {
        this.price = price;
        this.image = image;
        this.model = model;
        this.title = title;
        this.webUrl = webUrl;
    }

    // Getter methods
    public double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public String getModel() {
        return model;
    }

    public String getTitle() {
        return title;
    }

    public String getWebUrl() {
        return webUrl;
    }
    // Setter methods
    public void setPrice(double price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // A method to display the item details
    public void display() {
        System.out.println("Price: " + price);
        System.out.println("Image: " + image);
        System.out.println("Model: " + model);
        System.out.println("Title: " + title);
    }
}
