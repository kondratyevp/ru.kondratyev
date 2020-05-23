package ru.kondratyev.task20;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {

    @JsonDeserialize(as = ArrayList.class)
    private List<Location> locations = new ArrayList<>();

    @JsonProperty("distance")
    private Integer distance;
    @JsonProperty("title")
    private String title;
    @JsonProperty("location_type")
    private String location_type;
    @JsonProperty("woeid")
    private Integer woeID;
    @JsonProperty("latt_long")
    private String latitude_longitude;

    public Location() {
    }

    /*@JsonCreator
    public Location(
            @JsonProperty("distance") int distance,
            @JsonProperty("title") String title,
            ) {
        this.id = id;
        this.name = name;*/


    @Override
    public String toString() {
        return "Location{\n" +
                "distance=" + distance + ",\n" +
                "title='" + title + '\'' + ",\n" +
                "location_type='" + location_type + '\'' + ",\n" +
                "woeID=" + woeID + ",\n" +
                "latitude_longitude='" + latitude_longitude + '\'' + ",\n" +
                '}';
    }


}

