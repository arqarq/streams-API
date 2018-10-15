package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class InvStringActionAS implements Action {
    public String doIt(List<String> actionInput) {
        return new StringBuilder(String.join("", actionInput)).reverse().toString();
    }
}