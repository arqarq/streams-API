package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;
import java.util.stream.LongStream;

public class AddIfTenActionAS implements Action {
    public String doIt(List<String> actionInput) {
        LongStream longStream = actionInput.stream()
                .filter(x -> x.matches("-?\\d+"))
                .mapToLong(Integer::valueOf);
        if (actionInput.size() > 10) {
            long result = longStream.sum();
            return String.valueOf(result);
        }
        long result = longStream.reduce(1, (x, y) -> x * y);
        return String.valueOf(result);
    }
}