package com.client.ws.ws.rasmooplus.model;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "user_payment_info")
public class UserPaymentInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_payment_info_id")
    private Long id;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "card_expiration_month")
    private Long cardExpirationMonth;

    @Column(name = "card_expiration_year")
    private Long cardExpirationYear;

    @Column(name = "card_security_code")
    private String cardSecurityCode;

    private BigDecimal price;

    private Long instalments;

    @Column(name = "dt_payment")
    private LocalDate dtPayment = LocalDate.now();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public UserPaymentInfo() {
    }

    public UserPaymentInfo(LocalDate dtPayment, Long id, String cardNumber, Long cardExpirationMonth, Long cardExpirationYear, String cardSecurityCode, BigDecimal price, Long instalments, User user) {
        this.dtPayment = dtPayment;
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardExpirationMonth = cardExpirationMonth;
        this.cardExpirationYear = cardExpirationYear;
        this.cardSecurityCode = cardSecurityCode;
        this.price = price;
        this.instalments = instalments;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDtPayment() {
        return dtPayment;
    }

    public void setDtPayment(LocalDate dtPayment) {
        this.dtPayment = dtPayment;
    }

    public Long getInstalments() {
        return instalments;
    }

    public void setInstalments(Long instalments) {
        this.instalments = instalments;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCardSecurityCode() {
        return cardSecurityCode;
    }

    public void setCardSecurityCode(String cardSecurityCode) {
        this.cardSecurityCode = cardSecurityCode;
    }

    public Long getCardExpirationYear() {
        return cardExpirationYear;
    }

    public void setCardExpirationYear(Long cardExpirationYear) {
        this.cardExpirationYear = cardExpirationYear;
    }

    public Long getCardExpirationMonth() {
        return cardExpirationMonth;
    }

    public void setCardExpirationMonth(Long cardExpirationMonth) {
        this.cardExpirationMonth = cardExpirationMonth;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
