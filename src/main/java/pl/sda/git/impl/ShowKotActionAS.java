package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;
import java.util.stream.Collectors;

public class ShowKotActionAS implements Action {
    public String doIt(List<String> strings) {
        List<String> ileKotow = strings.stream()
                .filter(x -> x.contains("kot"))
                .collect(Collectors.toList());
        return String.join(" ", ileKotow);
    }
}