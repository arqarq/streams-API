package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class ShowACountActionAS implements Action {
    public String doIt(List<String> strings) {
        long ile = strings.stream()
                .filter(x -> x.contains("a"))
                .count();
        return String.valueOf(ile);
    }
}