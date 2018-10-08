package pl.sda.git;

import pl.sda.git.impl.AddNumArgsAction;
import pl.sda.git.impl.ConcatAction;
import pl.sda.git.impl.InvStringAction;
import pl.sda.git.impl.SortAlphaAction;

import java.util.*;

public class Main {
    private static final Map<String, Action> possibleActions = new HashMap<>();

    static {
        possibleActions.put("concat", new ConcatAction());
        possibleActions.put("as-alpha-sort", new SortAlphaAction());
        possibleActions.put("as-inv-string", new InvStringAction());
        possibleActions.put("as-add-num_args", new AddNumArgsAction());
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Possible actions: ");
        possibleActions.entrySet().stream()
                .map(Map.Entry::getKey)
                .map(name -> "\t" + name)
                .forEach(System.out::println);

        System.out.println("Which action do you want to perform?");
        final String actionName = scanner.nextLine();

        if (possibleActions.containsKey(actionName)) {
            System.out.println("What are the arguments?");
            final String argumentLine = scanner.nextLine();
            final List<String> arguments = Arrays.asList(argumentLine.split(" "));

            final Action action = possibleActions.get(actionName);
            final String result = action.doIt(arguments);
            System.out.println(result);
        } else {
            System.out.println("Podano nieprawidłową akcję!");
        }
    }
}