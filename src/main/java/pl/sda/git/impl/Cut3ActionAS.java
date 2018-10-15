package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;
import java.util.stream.Collectors;

public class Cut3ActionAS implements Action {
    public String doIt(List<String> actionInput) {
        actionInput = actionInput.stream()
                .map(x -> {
                    try {
                        return x.substring(0, 3);
                    } catch (IndexOutOfBoundsException e) {
                        return x;
                    }
                })
                .collect(Collectors.toList());
        return String.join(" ", actionInput);
    }
}