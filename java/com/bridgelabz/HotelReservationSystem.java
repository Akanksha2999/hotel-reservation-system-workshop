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
        Hotels hotelOne = new Hotels("Lakewood", 220);
        Hotels hotelTwo = new Hotels("Bridgewood", 300);
        Hotels hotelThree = new Hotels("Ridgewood", 500);
        hotelsList.add(hotelOne);
        hotelsList.add(hotelTwo);
        hotelsList.add(hotelThree);
        hotelsList.forEach(System.out::println);
        System.out.println(" ");
        cheapestHotel("2020-09-10", "2020-09-11");
    }

    public static void cheapestHotel(String startDate, String endDate) {
        LocalDate startDateFormat = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate endDateFormat = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        int numberOfDays = endDateFormat.getDayOfMonth() - startDateFormat.getDayOfMonth();
        Hotels cheapestHotel = hotelsList.stream().min(Comparator.comparing(Hotels::getHotelRate)).orElse(null);
        System.out.println("Cheapest Hotel is :");
        System.out.println(cheapestHotel);
        int totalRate = numberOfDays * cheapestHotel.hotelRate;
        System.out.println(numberOfDays + " days stayed in hotel ");
        System.out.println("Total Rate for " + numberOfDays + " days is : " + totalRate );
    }
}
