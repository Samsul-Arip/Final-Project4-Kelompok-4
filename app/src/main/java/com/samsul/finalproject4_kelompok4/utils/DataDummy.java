package com.samsul.finalproject4_kelompok4.utils;

import com.samsul.finalproject4_kelompok4.data.remote.model.ResponseBus;
import com.samsul.finalproject4_kelompok4.data.remote.model.ResponseLocation;
import java.util.ArrayList;
import java.util.List;

public class DataDummy {

    public static List<ResponseLocation> generateLocation() {
        ArrayList<ResponseLocation> list = new ArrayList<>();
        list.add(new ResponseLocation(1, "Pekanbaru", "Terminal bandaraya"));
        list.add(new ResponseLocation(2, "Pekanbaru", "Terminal Payung Sekaki"));
        list.add(new ResponseLocation(3, "Pematang Reba", "Terminal Gerbang Sari"));
        list.add(new ResponseLocation(4, "Medan", "Terminal Amplas"));
        list.add(new ResponseLocation(5, "Medan", "Terminal Pinang Baris"));
        list.add(new ResponseLocation(6, "Palembang", "Terminal Alang Lebar"));
        list.add(new ResponseLocation(7, "Palembang", "Terminal Karya Jaya"));
        list.add(new ResponseLocation(8, "Kabupaten Garut", "Terminal Guntur Melati"));
        list.add(new ResponseLocation(9, "Kabupaten Garut", "Terminal Pamaungpeuk"));
        list.add(new ResponseLocation(10, "Kota Depok", "Terminal Depok"));
        list.add(new ResponseLocation(11, "Kota Depok", "Terminal Jati Jajar"));

        return list;
    }

    public static List<ResponseBus> generateBus(String startLocation, String endLocation) {
        ArrayList<ResponseBus> list = new ArrayList<>();
        if(startLocation.equalsIgnoreCase("medan") && endLocation.equalsIgnoreCase("medan")) {
            list.add(new ResponseBus(5,
                    "Sempati Star",
                    "17.15",
                    "20.00",
                    "Medan",
                    "Terminal Amplas",
                    "Pematang Reba",
                    "Terminal Pinang baris",
                    "4.7",
                    "160 Review",
                    "170.000",
                    "3H 15 minutes",
                    "Class Economy",
                    "https://mediapenulis.com/wp-content/uploads/2020/03/Bus-Symphonie.jpg"));
            list.add(new ResponseBus(
                    6,
                    "Sempati Star",
                    "17.15",
                    "20.00",
                    "Medan",
                    "Terminal Pinang baris",
                    "Pematang Reba",
                    "Terminal Amplas",
                    "4.7",
                    "160 Review",
                    "170.000",
                    "3H 15 minutes",
                    "Class Economy",
                    "https://mediapenulis.com/wp-content/uploads/2020/03/Bus-Symphonie.jpg"
            ));
        } else if(startLocation.equalsIgnoreCase("pekanbaru") && endLocation.equalsIgnoreCase("pekanbaru")) {
            list.add(new ResponseBus(1,
                    "Symphonie",
                    "17.15",
                    "19.00",
                    "Pekanbaru",
                    "Terminal bandaraya",
                    "Pekanbaru",
                    "Terminal payung Sekaki",
                    "4.9",
                    "120 Review",
                    "160.000",
                    "3H 15 minutes",
                    "Class Economy","https://mediapenulis.com/wp-content/uploads/2020/03/Bus-Blue-Star.jpg"));
            list.add(new ResponseBus(2,
                    "Symphonie",
                    "17.15",
                    "19.00",
                    "Pekanbaru",
                    "Terminal payung Sekaki",
                    "Pekanbaru",
                    "Terminal bandaraya",
                    "4.9",
                    "120 Review",
                    "160.000",
                    "3H 15 minutes",
                    "Class Economy","https://mediapenulis.com/wp-content/uploads/2020/03/Bus-Blue-Star.jpg"));
        } else if(startLocation.equalsIgnoreCase("pematang reba") && endLocation.equalsIgnoreCase("medan")) {
            list.add(new ResponseBus(3,
                    "Blue Star",
                    "16.15",
                    "22.00",
                    "Pematang Reba",
                    "Terminal Gerbang Sari",
                    "Medan",
                    "Terminal Amplas",
                    "4.7",
                    "150 Review",
                    "600.000",
                    "4H 15 minutes",
                    "Class Middle",
                    "https://mediapenulis.com/wp-content/uploads/2020/03/Bus-Marissa-Holiday.jpg"
            ));
            list.add(new ResponseBus(4,
                    "Blue Star",
                    "16.15",
                    "22.00",
                    "Medan",
                    "Terminal Amplas",
                    "Pematang Reba",
                    "Terminal Gerbang sari",
                    "4.7",
                    "150 Review",
                    "600.000",
                    "4H 15 minutes",
                    "Class Middle",
                    "https://mediapenulis.com/wp-content/uploads/2020/03/Bus-Marissa-Holiday.jpg"
            ));
        } else if(startLocation.equalsIgnoreCase("palembang") && endLocation.equalsIgnoreCase("palembang")) {
            list.add(new ResponseBus(
                    7,
                    "Marissa Holiday",
                    "17.15",
                    "20.00",
                    "Palembang",
                    "Terminal Alang Lebar",
                    "Pematang Reba",
                    "Terminal Karya Jaya",
                    "4.7",
                    "160 Review",
                    "170.000",
                    "3H 15 minutes",
                    "Class Economy","https://mediapenulis.com/wp-content/uploads/2020/03/Bus-Scorpion-Holiday.jpg"
            ));
            list.add(new ResponseBus(
                    8,
                    "Marissa Holiday",
                    "17.15",
                    "20.00",
                    "Palembang",
                    "Terminal Karya Jaya",
                    "Pematang Reba",
                    "Terminal Alang Lebar",
                    "4.7",
                    "160 Review",
                    "170.000",
                    "3H 15 minutes",
                    "Class Economy","https://mediapenulis.com/wp-content/uploads/2020/03/Bus-Scorpion-Holiday.jpg"
            ));
        } else if(startLocation.equalsIgnoreCase("kabupaten garut") && endLocation.equalsIgnoreCase("kabupaten garut")) {
            list.add(new ResponseBus(
                    9,
                    "Scorpion Holiday",
                    "17.15",
                    "20.00",
                    "Kabupaten garut",
                    "Terminal Terminal Guntur Melati",
                    "Pematang Garut",
                    "Terminal Pamaungpeuk",
                    "4.9",
                    "190 Review",
                    "180.000",
                    "3H 15 minutes",
                    "Class Economy","https://mediapenulis.com/wp-content/uploads/2020/03/Bus-Suryaputra.jpg"
            ));
            list.add(new ResponseBus(
                    10,
                    "Scorpion Holiday",
                    "17.15",
                    "20.00",
                    "Kabupaten garut",
                    "Terminal pamaungpuk",
                    "Pematang Garut",
                    "Terminal Terminal Guntur Melati",
                    "4.9",
                    "190 Review",
                    "180.000",
                    "3H 15 minutes",
                    "Class Economy","https://mediapenulis.com/wp-content/uploads/2020/03/Bus-Suryaputra.jpg"
            ));
        } else if(startLocation.equalsIgnoreCase("kabupaten depok") && endLocation.equalsIgnoreCase("kabupaten depok")) {
            list.add(new ResponseBus(
                    10,
                    "Suryaputra",
                    "18.00",
                    "20.00",
                    "Kabupaten Depok",
                    "Terminal Depok",
                    "Pematang Depok",
                    "Terminal Jati Jajar",
                    "5.0",
                    "700 Review",
                    "180.000",
                    "2H 00 minutes",
                    "Class Economy","https://mediapenulis.com/wp-content/uploads/2020/03/Bus-City-Trans-Utama.jpg"
            ));

            list.add(new ResponseBus(
                    10,
                    "Suryaputra",
                    "18.00",
                    "20.00",
                    "Kabupaten Jati jajar",
                    "Terminal Depok",
                    "Pematang Depok",
                    "Terminal Depok",
                    "5.0",
                    "700 Review",
                    "180.000",
                    "2H 00 minutes",
                    "Class Economy","https://mediapenulis.com/wp-content/uploads/2020/03/Bus-City-Trans-Utama.jpg"
            ));
        }

        return list;
    }

}
