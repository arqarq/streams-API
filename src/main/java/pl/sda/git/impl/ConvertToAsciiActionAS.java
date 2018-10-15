package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class ConvertToAsciiActionAS implements Action {
    public String doIt(List<String> actionInput) {
        String allInputAsString = String.join(" ", actionInput); // z powrotem calosc w Stringu
        char[] allChars = allInputAsString.toCharArray();
        StringBuilder sb = new StringBuilder("Kody ASCII: ");

        for (char znak : allChars) {
            sb.append((int) znak).append("d ");
        }
//        sb.deleteCharAt(sb.length() - 1); //skasowanie spacji na koncu
//        sb.delete(sb.length() - 1, sb.length()); //skasowanie spacji na koncu
        return sb.toString().trim(); // skasowanie spacji na koncu
    }
}