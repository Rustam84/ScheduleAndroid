package com.example.rshaghivaliev.schedule.model;

import java.util.List;

public class ScheduleForGroup {
    String day;
    String time;
    CellForGroup cellForGroup;

    public ScheduleForGroup(String day, String time, CellForGroup cellForGroup) {
        this.day = day;
        this.time = time;
        this.cellForGroup = cellForGroup;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public CellForGroup getCellForGroup() {
        return cellForGroup;
    }

    public void setCellForGroup(CellForGroup cellForGroup) {
        this.cellForGroup = cellForGroup;
    }
}
