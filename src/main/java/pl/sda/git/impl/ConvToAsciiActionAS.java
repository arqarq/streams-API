package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class ConvToAsciiActionAS implements Action {
    public String doIt(List<String> strings) {
        String all = String.join(" ", strings); // z powrotem calosc w Stringu
        char[] allChars = all.toCharArray();
        StringBuilder sb = new StringBuilder("Kody ASCII: ");

        for (char znak : allChars) {
            sb.append((int) znak).append("d ");
        }
//        sb.deleteCharAt(sb.length() - 1); // skasowanie spacji na koncu
        return sb.delete(sb.length() - 1, sb.length()).toString(); // skasowanie spacji na koncu
    }
}