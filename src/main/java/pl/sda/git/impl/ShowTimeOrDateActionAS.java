package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.Date;
import java.util.List;

public class ShowTimeOrDateActionAS implements Action {
    public String doIt(List<String> strings) {
        Date date = new Date();
        if (strings.size() > 5) {
            return(date.toString());
        }
        return date.toString();
    }
}