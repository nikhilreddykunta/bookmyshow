package com.nikhil.learning.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Theatre extends BaseModel{

    private String name;
    private String address;

    @OneToMany
    private List<Screen> screens = new ArrayList<>();
}
