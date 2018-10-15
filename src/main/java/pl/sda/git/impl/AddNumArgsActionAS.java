package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;
import java.util.stream.Collectors;

public class AddNumArgsActionAS implements Action {
    public String doIt(List<String> strings) {
        long sum = strings.stream()
//                .map(x -> x.chars())
//                .filter(x -> x.chars().allMatch(y -> (Character.isDigit(y))))
                .filter(x -> x.matches("-?\\d+"))
//                .collect(Collectors.toList()); || y == '-'
//                .map(Integer::valueOf)
//                .collect(Collectors.summingInt(x -> x));
//                .mapToInt(x -> Integer.valueOf(x))
//                .reduce(0, (x, y) -> x + y);
                .mapToLong(Integer::valueOf)
                .sum();
        return String.valueOf(sum);
    }
}