package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;
import java.util.regex.Pattern;

public class CheckKOActionAS implements Action {
    private final Pattern PATTERN_KO = Pattern.compile("k+o+");

    public String doIt(List<String> actionInput) {
        final long countOfKO = actionInput.stream()
                .filter(PATTERN_KO.asPredicate())
                .count();
        return String.valueOf(countOfKO);
/*        int i = 0;
        for (String line : actionInput) {
            if (line.matches("k+o+")) {
                i++;
            }
        }
        return String.valueOf(i);*/
    }
}