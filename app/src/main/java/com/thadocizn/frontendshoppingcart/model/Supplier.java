package com.thadocizn.frontendshoppingcart.model;

import com.google.gson.annotations.SerializedName;

public class Supplier {

    @SerializedName("supplier_id")
    private long supplierId;

    @SerializedName("name")
    private String name;

    public Supplier(long supplierId, String name) {
        this.supplierId = supplierId;
        this.name = name;
    }

}
