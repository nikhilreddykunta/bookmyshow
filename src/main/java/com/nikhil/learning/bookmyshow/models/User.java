package com.nikhil.learning.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class User extends BaseModel{
    private String username;
    private String password;
}
