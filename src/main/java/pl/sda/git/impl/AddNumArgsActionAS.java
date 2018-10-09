package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class AddNumArgsActionAS implements Action {
    public String doIt(List<String> strings) {
        long suma = strings.stream()
//                .map(x -> x.chars())
//                .filter(x -> x.chars().allMatch(y -> (Character.isDigit(y))))
                .filter(x -> x.matches("-?\\d+"))
//                .collect(Collectors.toList()); || y == '-'
//                .map(Integer::valueOf)
//                .collect(Collectors.summingInt(x -> x));
//                .mapToInt(x -> x).reduce(0, (x, y) -> x + y);
                .mapToLong(Integer::valueOf)
                .sum();
        return String.valueOf(suma);
    }
}