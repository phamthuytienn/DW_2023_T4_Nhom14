package org.example.model.warehouse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeatherFact {
    private int id;
    private int datetimeId;
    private int locationId;
    private float temperatureMin;
    private float humidity;
    private float visibility;
    private float windSpeed;
    private String stopPoint;
    private int uvIndex;
    private String url;
    private float temperatureMax;
    private String description;
}