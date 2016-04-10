package com.example.model;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "t_users")
@Getter @Setter
public class User {
    public static final String ROLE_ADMIN = "ROLE_ADMIN";
    public static final String ROLE_USER  = "ROLE_USER";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(unique = true)
    private String name;

    @JsonIgnore
    private String password;

    private String role = ROLE_USER;


    public User() {

    }

    public User(String name, String password, String role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }
}
