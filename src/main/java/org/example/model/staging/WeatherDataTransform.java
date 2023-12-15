package org.example.model.staging;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeatherDataTransform {
    private String province;
    private String district;
    private Date date;
    private Time time;
    private Float temperatureMin;
    private Float temperatureMax;
    private String description;
    private Float humidity;
    private Float windSpeed;
    private Float uvIndex;
    private Float visibility;
    private Integer pressure;
    private Float stopPoint;
    private String url;
    private String ip;
}
