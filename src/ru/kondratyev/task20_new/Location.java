package ru.kondratyev.task20_new;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {

    @JsonDeserialize(as = ArrayList.class)
    public List<Location> locations = new ArrayList<>();

    public Integer distance;
    public String title;
    public String location_type;
    public Integer woeid;
    public String latt_long;

    public Location() {
    }

    public Location(String title, String location_type) {
        this.location_type = location_type;
        this.title = title;
        this.locations = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Location{\n" +
                "distance=" + distance + ",\n" +
                "title='" + title + '\'' + ",\n" +
                "location_type='" + location_type + '\'' + ",\n" +
                "woeid=" + woeid + ",\n" +
                "latt_long='" + latt_long + '\'' + ",\n" +
                '}';
    }
}

