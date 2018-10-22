package pl.sda.git.impl;

import pl.sda.git.Action;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class ShowDateIf3ActionAS implements Action {
    public String doIt(List<String> actionInput) {
        if (actionInput.size() == 3) {
            StringBuilder date = new StringBuilder()
                    .append(actionInput.get(0))
                    .append('-')
                    .append(actionInput.get(1))
                    .append('-')
                    .append(actionInput.get(2));
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d-M-y");
            LocalDate localDate;
            try {
                localDate = LocalDate.parse(date, dateTimeFormatter);
            } catch (DateTimeParseException ex) {
                return "Nic z tym nie zrobię, bo niewłaściwe dane wej.";
            }
            dateTimeFormatter = DateTimeFormatter.ofPattern("d.MM.yyyy");
            return localDate.format(dateTimeFormatter);
        }
        return "Nic z tym nie zrobię.";
    }
}