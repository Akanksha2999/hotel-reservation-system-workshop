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
        Hotels lakewood = new Hotels("Lakewood", 110,90);
        Hotels bridgewood = new Hotels("Bridgewood", 150,50);
        Hotels ridgewood = new Hotels("Ridgewood", 220,150);
        hotelsList.add(lakewood);
        hotelsList.add(bridgewood);
        hotelsList.add(ridgewood);
        hotelsList.forEach(System.out::println);
        System.out.println(" ");
        cheapestHotelForWeekdays("2020-09-10", "2020-09-11");
        cheapestHotelForWeekend("2020-09-11", "2020-09-12");
    }

    public static void cheapestHotelForWeekdays(String startDate, String endDate) {
        LocalDate startDateFormat = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate endDateFormat = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        int numberOfDays = endDateFormat.getDayOfMonth() - startDateFormat.getDayOfMonth();
        Hotels cheapestHotelForWeekdays = hotelsList.stream().min(Comparator.comparing(Hotels::getWeekDayRate)).orElse(null);
        System.out.println("Cheapest hotel for weekdays is :");
        System.out.println(cheapestHotelForWeekdays);
        Hotels hotels = new Hotels();
        hotels.setHotelName(cheapestHotelForWeekdays.getHotelName());
        hotels.setTotalPrice(cheapestHotelForWeekdays.getWeekDayRate() * numberOfDays);
        System.out.println(numberOfDays + " days stayed in hotel ");
        System.out.println("Total Rate for " + numberOfDays + " day's during weekday is : " + hotels.getTotalPrice() );
        System.out.println(" ");
    }

    public static void cheapestHotelForWeekend(String startDate, String endDate) {
        LocalDate startDateFormat = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate endDateFormat = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        int numberOfDays = endDateFormat.getDayOfMonth() - startDateFormat.getDayOfMonth();
        Hotels cheapestHotelForWeekend = hotelsList.stream().min(Comparator.comparing(Hotels::getWeekendRate)).orElse(null);
        System.out.println("Cheapest Hotel is :");
        System.out.println(cheapestHotelForWeekend);
        Hotels hotels = new Hotels();
        hotels.setHotelName(cheapestHotelForWeekend.getHotelName());
        hotels.setTotalPrice(cheapestHotelForWeekend.getWeekendRate() * numberOfDays);
        System.out.println(numberOfDays + " days stayed in hotel ");
        System.out.println("Total Rate for " + numberOfDays + " day's during weekend is : " + hotels.getTotalPrice() );

    }
}
