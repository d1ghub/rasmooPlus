package com.client.ws.ws.rasmooplus.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "subscriptions_type")
public class SubscriptionsType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscriptions_type_id")
    private long id;

    private String name;

    @Column(name = "access_months")
    private Long acessMonth;

    private BigDecimal price;

    @Column(name = "product_key")
    private Long productKey;


    public SubscriptionsType(Long productKey, BigDecimal price, Long acessMonth, String name, long id) {
        this.productKey = productKey;
        this.price = price;
        this.acessMonth = acessMonth;
        this.name = name;
        this.id = id;
    }

    public SubscriptionsType() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAcessMonth() {
        return acessMonth;
    }

    public void setAcessMonth(Long acessMonth) {
        this.acessMonth = acessMonth;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getProductKey() {
        return productKey;
    }

    public void setProductKey(Long productKey) {
        this.productKey = productKey;
    }
}


