package com.example.rshaghivaliev.schedule;

import com.example.rshaghivaliev.schedule.model.CellForGroup;
import com.example.rshaghivaliev.schedule.model.ScheduleForGroup;

import java.util.Arrays;
import java.util.List;

public class Data {
    static List<ScheduleForGroup> list = Arrays.asList(
            new ScheduleForGroup("Monday", "11:30-13:00", new CellForGroup("Calc. numeric(curs)", "G.Râbacova", "213a/4")),
            new ScheduleForGroup("Monday", "13:30-15:00", new CellForGroup("Manag. proiectelor (curs)", "T.Bragaru", "213a/4")),

            new ScheduleForGroup("Tuesday", "11:30-13:00", new CellForGroup("Sec.inf.(lab,par)", "II: O.Cerbu", "326/4")),
            new ScheduleForGroup("Tuesday", "13:30-15:00", new CellForGroup("Limb.script.(lab)", "A.Gladei", "253/4")),
            new ScheduleForGroup("Tuesday", "15:15-16:45", new CellForGroup("Sec.inf.(curs)", "O.Cerbu", "213/4")),

            new ScheduleForGroup("Wednesday", "11:30-13:00", new CellForGroup("Etica (sem, imp)", "Gh.Căpățână", "401/4")),
            new ScheduleForGroup("Wednesday", "13:30-15:00", new CellForGroup("Animație comp.(lab)", "Gh.Marin", "145a/4")),
            new ScheduleForGroup("Wednesday", "15:15-16:45", new CellForGroup("Limb.script.(lab)", "I: A.Gladei", "237/4")),
            new ScheduleForGroup("Wednesday", "15:15-16:45", new CellForGroup("Calcul numeric (lab)", "II: V.Pațiuc", "253/4")),
            new ScheduleForGroup("Wednesday", "17:00-18:30", new CellForGroup("Sec.inf.(lab)", "I: O.Cerbu", "326/4"))
    );

    public static List<ScheduleForGroup> getList() {
        return list;
    }
}
