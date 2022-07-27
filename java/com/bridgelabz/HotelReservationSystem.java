package com.bridgelabz;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    public static void main(String[] args)  {
        System.out.println("Welcome to Hotel Reservation System Program");
        List<Hotels> hotelsList = new ArrayList<>();
        Hotels hotelOne = new Hotels("LakeWood", 220);
        Hotels hotelTwo = new Hotels("BridgeWood", 300);
        Hotels hotelThree = new Hotels("RidgeWood", 350);
        hotelsList.add(hotelOne);
        hotelsList.add(hotelTwo);
        hotelsList.add(hotelThree);
        hotelsList.forEach(System.out::println);
    }
}
