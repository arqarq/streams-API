package pl.sda.git.impl;


import pl.sda.git.Action;

import java.util.List;

public class ConcatAction implements Action {
    public String doIt(List<String> strings) {
        return String.join("", strings);
    }
}
