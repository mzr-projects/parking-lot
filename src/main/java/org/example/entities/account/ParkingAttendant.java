package org.example.entities.account;

public class ParkingAttendant extends Account {

    public boolean processTicket() {
        System.out.println("Ticket processed");
        return true;
    }

    protected boolean resetPassword() {
        return false;
    }
}
