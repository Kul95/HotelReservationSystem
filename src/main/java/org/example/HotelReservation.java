package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
    static List<Hotel> list = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation system");
        HotelReservation hotelReservation = new HotelReservation();

        Hotel hotel1 = new Hotel("Lakewood", 110,90,3);
        Hotel hotel2 = new Hotel("Bridgewood", 160,80,4);
        Hotel hotel3 = new Hotel("Ridgewood", 220,150,5);

        //   Adding the Hotels to Hotel Reservation Class
        list.add(hotel1);
        list.add(hotel2);
        list.add(hotel3);
        System.out.println(list);
        findCheapestHotel();
        cheapestBestRatedHotel();

    }

    public static void findCheapestHotel() {

        LocalDate date = LocalDate.of(2020, Month.SEPTEMBER, 11);
        LocalDate date1 = LocalDate.of(2020, Month.SEPTEMBER, 12);
        DayOfWeek localDate1 = date.getDayOfWeek();
        DayOfWeek localDate2 = date1.getDayOfWeek();
        String day1 = String.valueOf(localDate1);
        String day2 = String.valueOf(localDate2);
        System.out.println(day2);
        System.out.println(day1);
        int sum1 = list.get(0).rateCalculation(day1) + list.get(0).rateCalculation(day2);
        int sum2 = list.get(1).rateCalculation(day1) + list.get(1).rateCalculation(day2);
        int sum3 = list.get(2).rateCalculation(day1) + list.get(2).rateCalculation(day2);


        if (sum1 < sum2 && sum1 < sum3) {
            System.out.println("This Rate for Hotel Lakewood");
            System.out.println("Minimum Rates For The Hotel :- " + sum1 + "$");

        } else if (sum2 < sum1 && sum2 < sum3) {
            System.out.println("This Rate for Hotel Bridgewood");
            System.out.println("Cheapest Rates For The Hotel is :- " + sum2 + "$");

        } else {
            System.out.println("This Rate  for Hotel Ridgewood");
            System.out.println("Cheapest Rates For The Hotel :- " + sum3 + "$");

        }
    }

    public static void cheapestBestRatedHotel(){
        int rating=Integer.MAX_VALUE;
        for (Hotel hotel:list){
            if (hotel.getRating()<rating){
                rating=hotel.getRating();
            }
        }
        int bestRating=rating;
        list.stream().filter(i->i.getRating()==bestRating).forEach(System.out::println);
    }
}
