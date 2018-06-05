package com.example.rshaghivaliev.schedule;

import com.example.rshaghivaliev.schedule.model.CellForGroup;
import com.example.rshaghivaliev.schedule.model.ScheduleForGroup;

import java.util.Arrays;
import java.util.List;

public class Data {
    static List<ScheduleForGroup> list = Arrays.asList(
            new ScheduleForGroup("Monday", "8:00-9:30", new CellForGroup("a", "b", "c")),
            new ScheduleForGroup("Monday", "9:45-11:15", new CellForGroup("a", "b", "c")),
            new ScheduleForGroup("Monday", "11:30-13:00", new CellForGroup("a", "b", "c")),
            new ScheduleForGroup("Monday", "13:30-15:00", new CellForGroup("a", "b", "c")),
            new ScheduleForGroup("Monday", "15:15-16:45", new CellForGroup("a", "b", "c")),
            new ScheduleForGroup("Monday", "17:00-18:30", new CellForGroup("a", "b", "c")),

            new ScheduleForGroup("Tuesday", "8:00-9:30", new CellForGroup("ООП(курс)", "Латул Георгий", "213a/4")),
            new ScheduleForGroup("Tuesday", "9:45-11:15", new CellForGroup("Искус. интеллект(лаб)", "Григорча Виорел", "145b/4")),
            new ScheduleForGroup("Tuesday", "11:30-13:00", new CellForGroup("Java(курс)", "Епифанова Ирина", "113/4")),
            new ScheduleForGroup("Tuesday", "13:30-15:00", new CellForGroup("a", "b", "c")),
            new ScheduleForGroup("Tuesday", "15:15-16:45", new CellForGroup("a", "b", "c")),
            new ScheduleForGroup("Tuesday", "17:00-18:30", new CellForGroup("a", "b", "c"))
    );

    public static List<ScheduleForGroup> getList() {
        return list;
    }
}
