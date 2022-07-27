package com.bridgelabz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HotelReservationSystem {
    static List<Hotels> hotelsList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System Project");
        Hotels hotelOne = new Hotels("Lakewood", 110,90);
        Hotels hotelTwo = new Hotels("Bridgewood", 190,50);
        Hotels hotelThree = new Hotels("Ridgewood", 220,150);
        hotelsList.add(hotelOne);
        hotelsList.add(hotelTwo);
        hotelsList.add(hotelThree);
        hotelsList.forEach(System.out::println);
    }
}
