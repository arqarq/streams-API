package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class ConvertToAsciiActionAS implements Action {
    public String doIt(List<String> actionInput) {
        StringBuilder sb = new StringBuilder("Kody ASCII: ");

/*        String allInputAsString = String.join(" ", actionInput); // z powrotem calosc w Stringu
        char[] allChars = allInputAsString.toCharArray();
        for (char znak : allChars) {
            sb.append((int) znak).append("d ");
        }
//        sb.deleteCharAt(sb.length() - 1); //skasowanie spacji na koncu
//        sb.delete(sb.length() - 1, sb.length()); //skasowanie spacji na koncu
        return sb.toString().trim(); // skasowanie spacji na koncu*/

        final String revertedAsciiValuesOfStrings = actionInput.stream()
                .flatMapToInt(String::chars)
                .mapToObj(String::valueOf)
                .map(StringBuilder::new)
                .map(x -> x.append("d "))
                .reduce(StringBuilder::append)
                .map(StringBuilder::toString)
                .orElse("(nic nie podano)");
        return sb.append(revertedAsciiValuesOfStrings).toString().trim();
    }
}