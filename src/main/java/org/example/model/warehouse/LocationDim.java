package org.example.model.warehouse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocationDim {
    private int id;
    private String url;
    private String districtName;
    private String provinceName;

}
