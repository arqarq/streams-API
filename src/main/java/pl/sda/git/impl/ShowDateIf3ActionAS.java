package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class ShowDateIf3ActionAS implements Action {
    public String doIt(List<String> strings) {
        if (strings.size() == 3) {
            StringBuilder date = new StringBuilder();
            date.append(strings.get(0)).append('.').append(strings.get(1)).append('.').append(strings.get(2)).trimToSize();
            return date.toString();
        }
        return "Nic z tym nie zrobię.";
    }
}