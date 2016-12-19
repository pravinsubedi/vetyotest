package com.asterdio.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Admin on 12/19/2016.
 */

@Entity
@Table
public class User
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String phone_number;
    @NotNull
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User() {
    }

    public User( String name, String email, String phone_number, String address) {
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
    }
}
