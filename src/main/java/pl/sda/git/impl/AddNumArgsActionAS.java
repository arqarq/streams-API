package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;
import java.util.regex.Pattern;

public class AddNumArgsActionAS implements Action {
    private final Pattern NUMBER_PATTERN = Pattern.compile("^[+-]?\\d+(\\.\\d+)?$");

    public String doIt(List<String> actionInput) {
//        List<String> temp
        double sum = actionInput.stream()
//                .map(x -> x.chars())
//                .filter(x -> x.chars().allMatch(y -> (Character.isDigit(y))))
                .filter(NUMBER_PATTERN.asPredicate()) //.filter(x -> x.matches("-?\\d+"))
//                .peek(x -> System.out.print(x + " "))
                //.collect(Collectors.toList());
//                .collect(Collectors.toList()); || y == '-'
//                .map(Integer::valueOf)
//                .collect(Collectors.summingInt(x -> x));
//                .mapToInt(x -> Integer.valueOf(x))
//                .reduce(0, (x, y) -> x + y);
//        long sum = temp.stream()
//                .mapToLong(Integer::valueOf)
//                .sum();
                //double sum = temp.stream()
//                .map(Double::valueOf)
                .mapToDouble(Double::valueOf)
//                .collect(Collectors.summingDouble(x -> x));
//                .flatMapToDouble(x -> Double.sum(x, 0))
                .sum();
//        return String.valueOf(sum);
        return String.valueOf(sum);
    }
}