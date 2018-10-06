package pl.sda.git.impl;


import pl.sda.git.Action;

import java.util.List;
import java.util.stream.Collectors;

public class SortAlphaAction implements Action {
    public String doIt(List<String> strings) {
        return strings.stream()
                .sorted()
                .collect(Collectors.joining(" "));
    }
}
