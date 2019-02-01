package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;
import java.util.stream.Collectors;

public class SortAlphaActionAS implements Action {
    public String doIt(List<String> actionInput) {
        return actionInput.stream()
                .sorted()
                .collect(Collectors.joining(" "));
    }
}
