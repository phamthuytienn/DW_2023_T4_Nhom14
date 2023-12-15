package org.example.model.control;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataFileConfig {

    public Integer id;
    public String name;
    public String code;
    public String description;
    public String source_path;
    public String location;
    public String format;
    public String separator;
    public String columns;
    public String destination;
    public Timestamp created_at;
    public Timestamp updated_at;
    public Integer created_by;
    public Integer updated_by;
    public String backup_path;
    public String sourcetination;

}
