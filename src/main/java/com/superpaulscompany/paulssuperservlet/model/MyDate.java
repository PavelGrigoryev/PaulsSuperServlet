package com.superpaulscompany.paulssuperservlet.model;

import java.time.LocalDateTime;

public record MyDate(String name, LocalDateTime localDateTime) {

    @Override
    public String toString() {
        return "Town : " + name + " | " +
                "LocalTime : " + localDateTime;
    }
}
