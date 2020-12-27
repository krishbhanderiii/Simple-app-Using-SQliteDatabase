package com.bawp.contacT.model;

import java.math.BigInteger;

public class Item {
    private int id;
    private String itemName;

    private BigInteger itemQuantity;

    private String dateItemAdded;

    public Item() {
    }

    public Item(String itemName,  BigInteger itemQuantity, String dateItemAdded) {
        this.itemName = itemName;

        this.itemQuantity = itemQuantity;

        this.dateItemAdded = dateItemAdded;
    }

    public Item(int id, String itemName,  BigInteger itemQuantity, String dateItemAdded) {
        this.id = id;
        this.itemName = itemName;

        this.itemQuantity = itemQuantity;

        this.dateItemAdded = dateItemAdded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }



    public  BigInteger getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(BigInteger itemQuantity) {
        this.itemQuantity = itemQuantity;
    }



    public String getDateItemAdded() {
        return dateItemAdded;
    }

    public void setDateItemAdded(String dateItemAdded) {
        this.dateItemAdded = dateItemAdded;
    }
}
