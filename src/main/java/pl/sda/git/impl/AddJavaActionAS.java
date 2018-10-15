package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;
import java.util.stream.Collectors;

public class AddJavaActionAS implements Action {
    public String doIt(List<String> actionInput) {
        return actionInput.stream()
                .map(x -> new StringBuilder(x).append("java")) //.map(x -> x + "java")
                .collect(Collectors.joining(" "));
    }
}