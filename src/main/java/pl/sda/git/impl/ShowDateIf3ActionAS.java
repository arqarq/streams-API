package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class ShowDateIf3ActionAS implements Action {
    public String doIt(List<String> actionInput) {
        if (actionInput.size() == 3) {
            StringBuilder date = new StringBuilder();
            date.append(actionInput.get(0)).append('.').append(actionInput.get(1)).append('.').append(actionInput.get(2)).trimToSize();
            return date.toString();
        }
        return "Nic z tym nie zrobię.";
    }
}