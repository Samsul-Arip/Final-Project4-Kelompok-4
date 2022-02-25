package com.samsul.finalproject4_kelompok4.utils;

import android.util.Log;

public class Constant {

    public final static String REQUEST_CODE = "request_code";
    public final static String DATE = "date";
    public final static String PASSANGERS = "passangers";
    public final static String ID = "id_bus";
    public final static String SEAT = "seat";
    public final static String IMAGE = "image";

    public final static String NAME_DEPARTURE = "departure";
    public final static String NAME_TERMINAL_DEPARTURE = "terminal_departure";

    public final static String NAME_ARRIVAL = "arrival";
    public final static String NAME_TERMINAL_ARRIVAL = "terminal_arrival";

    public final static String START_LOCATION = "start_location";
    public final static String START_TIME = "start_time";
    public final static String END_TIME = "end_time";
    public final static String END_LOCATION = "end_location";
    public final static String TOTAL_TIME = "total_time";
    public final static String CLASS_ECONOMY = "class";
    public final static String BUS_NAME = "bus_name";
    public final static String TOTAL_PRICE = "total_price";
    public final static String TOTAL_SEAT = "total_seat";



    public static void logCat(String Tag, String value) {
        Log.d(Tag, value);
    }


}
