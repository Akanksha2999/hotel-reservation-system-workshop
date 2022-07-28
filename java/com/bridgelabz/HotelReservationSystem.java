package com.bridgelabz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class HotelReservationSystem {
    static List<Hotels> hotelsList = new ArrayList<>();
    static LinkedList<Hotels> specialHotelList = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System Project");
        System.out.println("Rates for normal customers are: ");
        Hotels lakewood = new Hotels("Lakewood", 110, 90, 200, 3);
        Hotels bridgewood = new Hotels("Bridgewood", 150, 50, 200, 4);
        Hotels ridgewood = new Hotels("Ridgewood", 220, 150, 370, 5);
        hotelsList.add(lakewood);
        hotelsList.add(bridgewood);
        hotelsList.add(ridgewood);
        hotelsList.forEach(System.out::println);
        System.out.println(" ");
        System.out.println("Special rates for reward customers are: ");
        Hotels lakewoodReward = new Hotels("Lakewood", 80, 80, 160, 3);
        Hotels bridgewoodReward = new Hotels("Bridgewood", 110, 50, 160, 4);
        Hotels ridgewoodReward = new Hotels("Ridgewood", 100, 40, 150, 5);
        specialHotelList.add(lakewoodReward);
        specialHotelList.add(bridgewoodReward);
        specialHotelList.add(ridgewoodReward);
        specialHotelList.forEach(System.out::println);
        cheapestHotelForWeekdays("2020-09-10", "2020-09-11");
        cheapestHotelForWeekend("2020-09-11", "2020-09-12");
        cheapestBestRatedHotel("2020-09-11", "2020-09-12");
        bestRatedHotel("2020-09-11", "2020-09-12");
        System.out.println(" ");
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
        System.out.println("Total Rate for " + numberOfDays + " day's during weekday is : " + hotels.getTotalPrice());
        System.out.println(" ");
    }

    public static void cheapestHotelForWeekend(String startDate, String endDate) {
        LocalDate startDateFormat = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate endDateFormat = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        int numberOfDays = endDateFormat.getDayOfMonth() - startDateFormat.getDayOfMonth();
        Hotels cheapestHotelForWeekend = hotelsList.stream().min(Comparator.comparing(Hotels::getWeekendRate)).orElse(null);
        System.out.println("Cheapest Hotel for weekend is :");
        System.out.println(cheapestHotelForWeekend);
        Hotels hotels = new Hotels();
        hotels.setHotelName(cheapestHotelForWeekend.getHotelName());
        hotels.setTotalPrice(cheapestHotelForWeekend.getWeekendRate() * numberOfDays);
        System.out.println(numberOfDays + " days stayed in hotel ");
        System.out.println("Total Rate for " + numberOfDays + " day's during weekend is : " + hotels.getTotalPrice());
        System.out.println(" ");

    }

    public static void cheapestBestRatedHotel(String startDate, String endDate) {
        LocalDate startDateFormat = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate endDateFormat = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        int numberOfDays = endDateFormat.getDayOfMonth() - startDateFormat.getDayOfMonth();
        Hotels cheapestBestRatedHotel = hotelsList.stream().filter(n -> n.hotelRatings == 4).min(Comparator.comparing(Hotels::getHotelRatings)).orElse(null);
        System.out.println("Cheapest best rated Hotel is :");
        System.out.println(cheapestBestRatedHotel);
        Hotels hotels = new Hotels();
        hotels.setHotelName(cheapestBestRatedHotel.getHotelName());
        hotels.setTotalPrice(cheapestBestRatedHotel.getWeekendRate() * numberOfDays);
        System.out.println("Total Rate for " + numberOfDays + " day's during weekend is : " + hotels.getTotalPrice());
        System.out.println(" ");

    }

    public static void bestRatedHotel(String startDate, String endDate) {
        LocalDate startDateFormat = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate endDateFormat = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        int numberOfDays = endDateFormat.getDayOfMonth() - startDateFormat.getDayOfMonth();
        Hotels bestRatedHotel = hotelsList.stream().filter(n -> n.hotelRatings > 4).min(Comparator.comparing(Hotels::getHotelRatings)).orElse(null);
        System.out.println("Best rated Hotel is :");
        System.out.println(bestRatedHotel);
        Hotels hotels = new Hotels();
        hotels.setHotelName(bestRatedHotel.getHotelName());


    }
}
