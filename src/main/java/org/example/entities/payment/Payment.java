package org.example.entities.payment;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/*
 * This object creates when the vehicle enters the Parking
 * */
@Getter
@Setter
public abstract class Payment {

    protected double amount;

    protected PaymentStatus paymentStatus;

    protected Date timeStamp;

    protected abstract boolean initiateTransaction();

    public void calculate() {

    }
}
