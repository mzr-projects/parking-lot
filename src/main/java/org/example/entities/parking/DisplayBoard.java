package org.example.entities.parking;

import lombok.Data;
import org.example.entities.parking.spots.Compact;
import org.example.entities.parking.spots.HandiCapped;
import org.example.entities.parking.spots.LargeSpot;
import org.example.entities.parking.spots.MotorCycleSpot;

@Data
public class DisplayBoard {

    private int id;

    private HandiCapped hadiCappedSpot;

    private Compact compactSpot;

    private LargeSpot largeSpot;

    private MotorCycleSpot motorCycleSpot;

    public void showFreeSpot(){

    }
}
