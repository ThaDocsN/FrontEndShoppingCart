package com.thadocizn.frontendshoppingcart.model;

import com.google.gson.annotations.SerializedName;

public class Cart {

    @SerializedName("cart_id")
    private long cartId;
    @SerializedName("name")
    private String name;
    @SerializedName("quantity")
    private int quantity;

    public Cart(long cartId, String name, int quantity) {
        this.cartId = cartId;
        this.name = name;
        this.quantity = quantity;
    }
}
