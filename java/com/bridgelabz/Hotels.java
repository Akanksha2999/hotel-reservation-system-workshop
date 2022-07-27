package com.bridgelabz;

public class Hotels {
    String hotelName;
    int weekDayRate;
    int weekendRate;


    public Hotels(String hotelName, int weekDayRate, int weekendRate) {
        this.hotelName = hotelName;
        this.weekDayRate=weekDayRate;
        this.weekendRate=weekendRate;
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

    @Override
    public String toString() {
        return "Hotels{" +
                "hotelName='" + hotelName + '\'' +
                ", weekDayRate=" + weekDayRate +
                ", weekendRate=" + weekendRate +
                '}';
    }
}
