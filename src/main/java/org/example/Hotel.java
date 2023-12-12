package org.example;

import java.util.List;

public class Hotel {
    String hotelName;
    int hotelWeekDayRegularCustomer;

    public Hotel(String hotelName, int hotelWeekDayRegularCustomer) {
        this.hotelName = hotelName;
        this.hotelWeekDayRegularCustomer = hotelWeekDayRegularCustomer;
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

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelWeekDayRegularCustomer=" + hotelWeekDayRegularCustomer +
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
