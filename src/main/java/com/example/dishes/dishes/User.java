package com.example.dishes.dishes;

//import org.hibernate.annotations.Entity;
import org.hibernate.validator.constraints.NotBlank;
//import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    private final String name;

    @NotBlank(message = "Email is mandatory")
    private final String email;

    protected User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    // standard constructors / setters / getters / toString
}
