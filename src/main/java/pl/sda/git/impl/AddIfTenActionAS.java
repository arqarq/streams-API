package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;
import java.util.stream.DoubleStream;

public class AddIfTenActionAS implements Action {
    public String doIt(List<String> actionInput) {
        DoubleStream longStream = actionInput.stream()
//                .filter(x -> x.matches("-?\\d+"))
                .filter(x -> x.matches("^[+-]?\\d+(\\.\\d+)?$"))
                .mapToDouble(Double::valueOf);
        if (actionInput.size() > 10) {
            double result = longStream.sum();
            return String.valueOf(result);
        }
        double result = longStream.reduce(1, (x, y) -> x * y);
        return String.valueOf(result);
    }
}