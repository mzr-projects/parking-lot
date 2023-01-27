package org.example.entities.payment;

public class CreditCard extends Payment {

    protected boolean initiateTransaction() {
        return false;
    }
}
