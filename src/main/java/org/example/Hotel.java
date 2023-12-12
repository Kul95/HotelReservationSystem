package org.example;

import java.util.List;

public class Hotel {
    String hotelName;
    int hotelWeekDayRegularCustomer;
    int hotelWeekendRegularCustomer;
    int rating;

    public Hotel(String hotelName, int hotelWeekDayRegularCustomer, int hotelWeekendRegularCustomer, int rating) {
        this.hotelName = hotelName;
        this.hotelWeekDayRegularCustomer = hotelWeekDayRegularCustomer;
        this.hotelWeekendRegularCustomer = hotelWeekendRegularCustomer;
        this.rating = rating;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelWeekDayRegularCustomer=" + hotelWeekDayRegularCustomer +
                ", hotelWeekendRegularCustomer=" + hotelWeekendRegularCustomer +
                ", rating=" + rating +
                '}';
    }

    public int rateCalculation(String day) {
        if (day.equals("MONDAY") || day.equals("TUESDAY") || day.equals("WEDNESDAY") || day.equals("THURSDAY") || day.equals("FRIDAY")) {
            return getHotelWeekDayRegularCustomer();
        } else {
            return getHotelWeekendRegularCustomer();
        }
    }
}
