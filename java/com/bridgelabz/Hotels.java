package com.bridgelabz;

public class Hotels {
    String hotelName;
    int hotelRate;


    public Hotels(String hotelName, int hotelRate) {
        this.hotelName = hotelName;
        this.hotelRate = hotelRate;
    }

    @Override
    public String toString() {
        return "Hotels{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelRate=" + hotelRate +
                '}';
    }
}
