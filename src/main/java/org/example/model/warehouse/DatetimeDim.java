package org.example.model.warehouse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DatetimeDim {
    private int id;
    private int year;
    private int quarter;
    private int month;
    private int dayOfMonth;
    private String dayName;
    private int weekOfYear;
    private int hour;
    private int minute;
    private int second;
    private String period;
    private String timeOfDay;
    private int dayInQuarter;
    private int dayInMonth;
    private int dayInYear;
    private int weekInMonth;
    private int weekInYear;
    private String monthName;
    private String quarterName;
    private String yearName;
    private boolean isWeekend;
    private boolean isHoliday;
    private Date mmDd;
    private String mmDdYyyy;
    private Time hhMmSs;
    private String militaryTime;
    private String isoTime;
    private Date date;
    private Time time;

}
