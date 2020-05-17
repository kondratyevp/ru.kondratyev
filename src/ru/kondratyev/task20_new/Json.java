package ru.kondratyev.task20_new;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Json {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://www.metaweather.com/api/location/search/?lattlong=36.96,-122.02");
            ObjectMapper mapper = new ObjectMapper();
            Location[] locations = mapper.readValue(url, Location[].class);
            for (Location location : locations)
                System.out.println(location);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
