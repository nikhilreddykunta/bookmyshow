package com.nikhil.learning.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer extends BaseModel{
    private String fullName;
    private String city;
    private String phoneNumber;
    private String email;

    @OneToOne
    private User user;
}
