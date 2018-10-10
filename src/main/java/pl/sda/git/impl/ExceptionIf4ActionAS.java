package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class ExceptionIf4ActionAS implements Action {
    public String doIt(List<String> strings) {
        if (strings.size() > 3) {
            throw new RuntimeException("Wyrzucam wyjątek!");
        }
        return "";
    }
}