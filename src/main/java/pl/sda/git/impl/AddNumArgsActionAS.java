package pl.sda.git.impl;

import pl.sda.git.Action;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AddNumArgsActionAS implements Action {
    public String doIt(List<String> strings) {
        List<String> suma = strings.stream()
                .filter(x -> x.chars().allMatch(Character::isDigit))
                .collect(Collectors.toList());
//                .map(Integer::valueOf)
//                .collect(Collectors.summingInt(x -> x));
//                .mapToInt(x -> x).reduce(0, (x, y) -> x + y);
//                .mapToLong(Integer::valueOf)
//                .sum();
//        return String.valueOf(suma);
//        int[] iii = {0};
//        System.out.println(Arrays.toString(suma.get(0).toArray()));
//        System.out.println(Arrays.toString(suma.get(1).toArray()));
//        System.out.println(Arrays.toString(suma.get(2).toArray()));
        System.out.println((int) suma.get(0).charAt(0));
        System.out.println((int) suma.get(1).charAt(0));
        System.out.println(suma.get(2));
        char ii = 0;
        System.out.println(ii);
        return suma.toString();
    }
}