package com.HotelBooking.demo.System.Rooms;

import com.HotelBooking.demo.System.ABooking;

public class SingleRoom extends ABooking {
    public SingleRoom() {
        super(
                3,
                "Single Room",
                500,
                true,
                true,
                true
            );
    }
}
