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
public class DataFile {
    public Integer id;
    public String name;
    public Integer row_count;
    public Integer df_config_id;
    public String status;
    public Timestamp file_timestamp;
    public Timestamp data_range_from;
    public Timestamp data_range_to;
    public String note;
    public Timestamp created_at;
    public Timestamp updated_at;
    public Integer created_by;
    public Integer updated_by;
    public Boolean is_inserted;
    public Timestamp deleted_at;

    public DataFileConfig dataFileConfig;




}