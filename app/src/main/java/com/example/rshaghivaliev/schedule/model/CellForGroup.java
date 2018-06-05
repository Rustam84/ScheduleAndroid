package com.example.rshaghivaliev.schedule.model;

import java.util.List;

public class CellForGroup {
    String pair;
    String lecturer;
    String cabinet;

    public CellForGroup(String pair, String lecturer, String cabinet) {
        this.pair = pair;
        this.lecturer = lecturer;
        this.cabinet = cabinet;
    }

    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getCabinet() {
        return cabinet;
    }

    public void setCabinet(String cabinet) {
        this.cabinet = cabinet;
    }
}
