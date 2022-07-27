package com.bridgelabz;

public class Hotels {
    String hotelName;
    int hotelRate;


    public Hotels(String hotelName, int hotelRate) {
        this.hotelName = hotelName;
        this.hotelRate = hotelRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelRate() {
        return hotelRate;
    }

    public void setHotelRate(int hotelRate) {
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
