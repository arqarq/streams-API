package pl.sda.git;

import pl.sda.git.impl.*;

import java.util.*;

public class Main {
    private static final Map<String, Action> possibleActions = new HashMap<>();

    static {
        possibleActions.put("concat", new ConcatAction());
        possibleActions.put("as-alpha-sort", new SortAlphaActionAS());
        possibleActions.put("as-inv-string", new InvStringActionAS());
        possibleActions.put("as-add-num_args", new AddNumArgsActionAS());
        possibleActions.put("as-replace-b", new ReplaceBtoAbcAS());
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Possible actions:");
        possibleActions.entrySet().stream()
                .map(Map.Entry::getKey)
                .map(name -> "\t" + name)
                .forEach(System.out::println);

        System.out.println("Which action do you want to perform?");
        final String actionName = scanner.nextLine();

        if (possibleActions.containsKey(actionName)) {
            System.out.println("What are the arguments?");
            final String argumentLine = scanner.nextLine();
            final List<String> arguments = Arrays.asList(argumentLine.trim().split("\\s+")); // split po jednej lub wielu spacjach
            final Action action = possibleActions.get(actionName);
            final String result = action.doIt(arguments);
            System.out.println(result);
        } else {
            System.out.println("Podano nieprawidłową akcję!");
        }
    }
}