package com.nikhil.learning.bookmyshow.models;

import com.nikhil.learning.bookmyshow.enums.PaymentMethodType;
import com.nikhil.learning.bookmyshow.enums.PaymentStatus;

public class Payment extends BaseModel{
    private String reference; //txn number
    private Double amount;
    private PaymentMethodType providerType;
    private PaymentStatus status;
}
