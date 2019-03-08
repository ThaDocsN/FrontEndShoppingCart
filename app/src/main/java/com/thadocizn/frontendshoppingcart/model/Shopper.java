package com.thadocizn.frontendshoppingcart.model;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Shopper {
    @SerializedName("shopper_id")
    private long shopperId;

    @SerializedName("bill_address")
    private String billAddress;

    @SerializedName("ship_address")
    private String shipAddress;

    @SerializedName("phone_number")
    private String phoneNumber;

    @SerializedName("payment_method")
    private String paymentMethod;



    public Shopper() {

    }

    public Shopper(long shopperId,
                   String billAddress,
                   String shipAddress,
                   String phoneNumber,
                   String paymentMethod) {
        this.shopperId = shopperId;
        this.billAddress = billAddress;
        this.shipAddress = shipAddress;
        this.phoneNumber = phoneNumber;
        this.paymentMethod = paymentMethod;
    }
}
