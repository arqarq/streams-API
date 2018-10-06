package pl.sda.git.impl;


import pl.sda.git.Action;

import java.util.List;

public class InvStringAction implements Action {
    public String doIt(List<String> strings) {
        return new StringBuilder(String.join("", strings)).reverse().toString();
    }
}
