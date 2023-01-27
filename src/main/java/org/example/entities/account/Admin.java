package org.example.entities.account;

import org.example.entities.parking.DisplayBoard;
import org.example.entities.parking.Entrance;
import org.example.entities.parking.Exit;

public class Admin extends Account{

    public boolean addParkingSpot(String floorName,String spot){
        return true;
    }

    public boolean addDisplayBoard(String floorName, DisplayBoard displayBoard){
        return true;
    }

    public boolean addEntrance(Entrance entrance){
        return true;
    }

    public boolean addExit(Exit exit){
        return true;
    }

    protected boolean resetPassword() {
        return false;
    }
}
