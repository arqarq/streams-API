package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class CheckKOActionAS implements Action {
    public String doIt(List<String> strings) {
        int i = 0;
        for (String line : strings) {
            if (line.matches("k+o+")) {
                i++;
            }
        }
        return String.valueOf(i);
    }
}