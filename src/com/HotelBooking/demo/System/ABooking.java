package com.HotelBooking.demo.System;

public abstract class ABooking {
    private int BookingID;
    private String roomName;
    private int price;
    private boolean isAvailable;
    private boolean IsBreakfastIncluded;
    private boolean parking;

    public ABooking(int bookingID, String roomName,
                    int price, boolean isAvailable,
                    boolean isBreakfastIncluded,
                    boolean parking
                    )
    {
        BookingID = bookingID;
        this.roomName = roomName;
        this.price = price;
        this.isAvailable = isAvailable;
        IsBreakfastIncluded = isBreakfastIncluded;
        this.parking = parking;
    }

    public int getBookingID() {
        return BookingID;
    }

    public void setBookingID(int bookingID) {
        BookingID = bookingID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
    public boolean isBreakfastIncluded() {
        return IsBreakfastIncluded;
    }

    public void setBreakfastIncluded(boolean breakfastIncluded) {
        IsBreakfastIncluded = breakfastIncluded;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }
}
