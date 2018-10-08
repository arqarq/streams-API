package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class AddNumArgsAction implements Action {
    public String doIt(List<String> strings) {
        long sum = strings.stream()
                .filter(x -> x.chars().allMatch(Character::isDigit))
//                .map(Integer::valueOf)
//                .collect(Collectors.summingInt(x -> x));
//                .mapToInt(x -> x).reduce(0, (x, y) -> x + y);
                .mapToLong(Integer::valueOf).sum();
        return String.valueOf(sum);
    }
}