package com.nikhil.learning.bookmyshow.models;

import com.nikhil.learning.bookmyshow.enums.PaymentMethodType;
import com.nikhil.learning.bookmyshow.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{

    private String reference; //txn number
    private Double amount;

    @Enumerated
    private PaymentMethodType providerType;

    @Enumerated
    private PaymentStatus status;
}
