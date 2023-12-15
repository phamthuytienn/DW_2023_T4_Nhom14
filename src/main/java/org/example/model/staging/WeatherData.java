package org.example.model.staging;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeatherData {
    private String province;
    private String district;
    private String date;
    private String time;
    private String temperatureMin;
    private String temperatureMax;
    private String description;
    private String humidity;
    private String windSpeed;
    private String uvIndex;
    private String visibility;
    private String pressure;
    private String stopPoint;
    private String url;
    private String ip;
}
