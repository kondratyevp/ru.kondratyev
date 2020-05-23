package ru.kondratyev.temp.task20_old;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OceanDrivers {
    public Integer TEMPERATURE;
    public Integer TWD;
    public String NAME;
    public Integer HUMIDEX;
    public String TIME_STRING;

    public OceanDrivers() {
    }

    @Override
    public String toString() {
        return "OceanDrivers{" + "\n" +
                " TEMPERATURE=" + TEMPERATURE +
                ",\n TWD=" + TWD +
                ",\n NAME='" + NAME + '\'' +
                ",\n HUMIDEX=" + HUMIDEX +
                ",\n TIME_STRING='" + TIME_STRING + '\'' +
                "\n" + '}';
    }
}
