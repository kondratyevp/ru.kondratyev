package ru.kondratyev.task20;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

@JsonAutoDetect
public class Json {

    public static String deserialize(String url) throws IOException {
        URL url1 = new URL(url);
        InputStream is = url1.openStream();
        byte[] buffer = is.readAllBytes();
        return new String(buffer);
    }

    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            OceanDrivers drivers = mapper.readValue(deserialize
                    ("https://api.oceandrivers.com:443/v1.0/getEasyWind/EW013/?period=latestdata"), OceanDrivers.class);
            System.out.println(drivers);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
