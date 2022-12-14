package com.bridgelabz;

public class Hotels {
    String hotelName;
    int weekDayRate;
    int weekendRate;
    int totalPrice;
    int hotelRatings;

    public Hotels(){

    }


    public Hotels(String hotelName, int weekDayRate, int weekendRate,int totalPrice, int hotelRatings) {
        this.hotelName = hotelName;
        this.weekDayRate=weekDayRate;
        this.weekendRate=weekendRate;
        this.totalPrice=totalPrice;
        this.hotelRatings=hotelRatings;
    }


    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekDayRate() {
        return weekDayRate;
    }

    public void setWeekDayRate(int weekDayRate) {
        this.weekDayRate = weekDayRate;
    }
    public int getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(int weekendRate) {
        this.weekendRate = weekendRate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getHotelRatings() {
        return hotelRatings;
    }

    public void setHotelRatings(int hotelRatings) {
        this.hotelRatings = hotelRatings;
    }
    @Override
    public String toString() {
        return "Hotels{" +
                "hotelName='" + hotelName + '\'' +
                ", weekDayRate=" + weekDayRate +
                ", weekendRate=" + weekendRate +
                ", totalPrice=" + totalPrice +
                ", hotelRatings=" + hotelRatings +
                '}';
    }
}
