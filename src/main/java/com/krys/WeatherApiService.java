package com.krys;


import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Component
public class WeatherApiService {

    @Value("${api.weather.key}")
    private String apiKey;

    @Value("${api.weather.current.url}")
    private String weaherApiUrl;

    private ResourceLoader resourceLoader;
    private Gson gson;

    public WeatherApiService (ResourceLoader resourceLoader, Gson gson){
        this.resourceLoader = resourceLoader;
        this.gson = gson;
    };

    public void fetchWeather(String userCity){
        String fullUrl = weaherApiUrl.replace("{appId}",apiKey).replace("{city}",userCity);
        try {
            InputStream jsonWeather = resourceLoader.getResource(fullUrl).getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(jsonWeather);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }

}
