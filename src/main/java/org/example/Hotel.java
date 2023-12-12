package org.example;

import java.util.List;

public class Hotel {
    String hotelName;
    int hotelWeekDayRegularCustomer;
    int hotelWeekendRegularCustomer;

    public Hotel(String hotelName, int hotelWeekDayRegularCustomer, int hotelWeekendRegularCustomer) {
        this.hotelName = hotelName;
        this.hotelWeekDayRegularCustomer = hotelWeekDayRegularCustomer;
        this.hotelWeekendRegularCustomer = hotelWeekendRegularCustomer;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelWeekDayRegularCustomer() {
        return hotelWeekDayRegularCustomer;
    }

    public void setHotelWeekDayRegularCustomer(int hotelWeekDayRegularCustomer) {
        this.hotelWeekDayRegularCustomer = hotelWeekDayRegularCustomer;
    }

    public int getHotelWeekendRegularCustomer() {
        return hotelWeekendRegularCustomer;
    }

    public void setHotelWeekendRegularCustomer(int hotelWeekendRegularCustomer) {
        this.hotelWeekendRegularCustomer = hotelWeekendRegularCustomer;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelWeekDayRegularCustomer=" + hotelWeekDayRegularCustomer +
                ", hotelWeekendRegularCustomer=" + hotelWeekendRegularCustomer +
                '}';
    }

    public int rateCalculation(String day) {
        if (day.equals("MONDAY") || day.equals("TUESDAY") || day.equals("WEDNESDAY") || day.equals("THURSDAY") || day.equals("FRIDAY")) {
            return hotelWeekDayRegularCustomer;
        } else {
            return 0;
        }
    }
}
