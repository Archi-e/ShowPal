package com.archie.ShowPal.model;

import com.archie.ShowPal.model.constant.PaymentMode;
import com.archie.ShowPal.model.constant.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private String refNo;
    private LocalDateTime timeOfPayment;
    private double amount;
    @ManyToOne
    private Ticket ticket;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
}
