package com.client.ws.ws.rasmooplus.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "user_type")
public class UserType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_type_id")
    private long id;

    private String name;

    private String description;

    public UserType() {
    }

    public UserType(String description, String name, long id) {
        this.description = description;
        this.name = name;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
