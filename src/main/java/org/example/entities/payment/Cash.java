package org.example.entities.payment;

public class Cash extends Payment{

    protected boolean initiateTransaction() {
        return false;
    }
}
