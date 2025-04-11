package org.example.basic;

import java.time.LocalDate;
import java.util.List;

public class ProblemTwo {
    public String transform(List<LocalDate> arrivalDates) {
        StringBuilder flightStatus = new StringBuilder();
        for (LocalDate arrivalDate : arrivalDates) {
            if (arrivalDate.isAfter(LocalDate.now())) { 
                flightStatus.append(arrivalDate).append("\n");
            }
            else {
                flightStatus.append("Delayed\n");
            }
        }
        return flightStatus.toString();
    }
}
