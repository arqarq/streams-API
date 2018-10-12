package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class LengthYesNoActionAS implements Action {
    public String doIt(List<String> strings) {
        if (strings != null) {
            int l = strings.get(0).length();
            return strings.stream()
                    .map(String::length)
                    .allMatch(x -> x == l) ? "Tak" : "Nie";
        }
        return "Tak";
    }
}