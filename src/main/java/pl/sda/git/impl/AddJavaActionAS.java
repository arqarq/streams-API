package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;
import java.util.stream.Collectors;

public class AddJavaActionAS implements Action {
    public String doIt(List<String> strings) {
        strings = strings.stream()
//                .map(x -> new StringBuilder(x).append("java").toString())
                .map(x -> x + "java")
                .collect(Collectors.toList());
        return String.join(" ", strings);
    }
}