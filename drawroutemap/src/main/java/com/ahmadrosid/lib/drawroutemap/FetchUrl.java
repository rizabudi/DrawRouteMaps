package com.ahmadrosid.lib.drawroutemap;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by ocittwo on 11/14/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */
public class FetchUrl {
    public static String getUrl(LatLng origin, LatLng dest, String apiKey) {
        String str_origin = "origin=" + origin.latitude + "," + origin.longitude;
        String str_dest = "destination=" + dest.latitude + "," + dest.longitude;
        String sensor = "sensor=false";
        String avoid = "avoid=tolls|highways";
        apiKey = "key=" + apiKey;
        String parameters = str_origin + "&" + str_dest + "&" + sensor + "&" + avoid + "&" + apiKey;
        String output = "json";
        return "https://maps.googleapis.com/maps/api/directions/" + output + "?" + parameters;
    }
}
