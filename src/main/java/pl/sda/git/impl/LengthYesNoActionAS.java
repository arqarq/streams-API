package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class LengthYesNoActionAS implements Action {
    public String doIt(List<String> actionInput) {
        if (!actionInput.isEmpty()) {
            int l = actionInput.get(0).length();
            return actionInput.stream()
                    .map(String::length)
                    .allMatch(x -> x == l) ? "Tak" : "Nie";
        }
        return "Tak";
    }
}