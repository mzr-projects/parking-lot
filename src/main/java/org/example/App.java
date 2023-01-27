package org.example;

import org.example.entities.parking.Entrance;
import org.example.entities.parking.ParkingLot;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addEntrance(new Entrance());
    }
}
