package com.nikhil.learning.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseModel{
    private String username;
    private String password;
}
