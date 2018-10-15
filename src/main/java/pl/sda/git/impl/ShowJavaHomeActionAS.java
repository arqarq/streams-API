package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class ShowJavaHomeActionAS implements Action {
    public String doIt(List<String> actionInput) {
        return System.getProperty("java.home");
    }
}