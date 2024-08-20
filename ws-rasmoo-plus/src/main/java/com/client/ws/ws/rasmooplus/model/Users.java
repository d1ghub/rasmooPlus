package com.client.ws.ws.rasmooplus.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "users_id`")
    private long id;

    private String email;

    private String phone;

    private String cpf;

    @Column(name = "dt_subscription")
    private LocalDate dtSubscription = LocalDate.now();

    @Column(name = "dt_expiration")
    private LocalDate dtExpiration = LocalDate.now();

    @OneToMany
    @JoinColumn(name = "user_type_id")
    private UserType userType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subscriptions_type_id")
    private SubscriptionsType subscriptionsType;

    public Users() {
    }

    public Users(SubscriptionsType subscriptionsType, UserType userType, LocalDate dtExpiration, LocalDate dtSubscription, String cpf, String phone, String email, long id) {
        this.subscriptionsType = subscriptionsType;
        this.userType = userType;
        this.dtExpiration = dtExpiration;
        this.dtSubscription = dtSubscription;
        this.cpf = cpf;
        this.phone = phone;
        this.email = email;
        this.id = id;
    }

    public SubscriptionsType getSubscriptionsType() {
        return subscriptionsType;
    }

    public void setSubscriptionsType(SubscriptionsType subscriptionsType) {
        this.subscriptionsType = subscriptionsType;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public LocalDate getDtExpiration() {
        return dtExpiration;
    }

    public void setDtExpiration(LocalDate dtExpiration) {
        this.dtExpiration = dtExpiration;
    }

    public LocalDate getDtSubscription() {
        return dtSubscription;
    }

    public void setDtSubscription(LocalDate dtSubscription) {
        this.dtSubscription = dtSubscription;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
