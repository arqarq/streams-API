package pl.sda.git;

import pl.sda.git.impl.*;

import java.util.*;

public class Main {
    private static final Map<String, Action> possibleActions = new LinkedHashMap<>();

    static {
        possibleActions.put("concat", new ConcatAction());
        possibleActions.put("as-add-all-lengths", new AddAllLengthsActionAS());
        possibleActions.put("as-add-if10", new AddIfTenActionAS());
        possibleActions.put("as-add-java", new AddJavaActionAS());
        possibleActions.put("as-add-num-args", new AddNumArgsActionAS());
        possibleActions.put("as-alpha-sort", new SortAlphaActionAS());
        possibleActions.put("as-check-ko", new CheckKOActionAS());
        possibleActions.put("as-conv-ascii", new ConvertToAsciiActionAS());
        possibleActions.put("as-count-a", new ShowACountActionAS());
        possibleActions.put("as-cut3", new Cut3ActionAS());
        possibleActions.put("as-exception", new ExceptionIf4ActionAS());
        possibleActions.put("as-inv-string", new InvStringActionAS());
        possibleActions.put("as-length-yes/no", new LengthYesNoActionAS());
        possibleActions.put("as-replace-b", new ReplaceBtoAbcActionAS());
        possibleActions.put("as-show-date-if3", new ShowDateIf3ActionAS());
        possibleActions.put("as-show-date/time", new ShowTimeOrDateActionAS());
        possibleActions.put("as-show-javahome", new ShowJavaHomeActionAS());
        possibleActions.put("as-show-kot-only", new ShowKotActionAS());
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
            String[] argsWithoutSpaces = argumentLine.trim().split("\\s+"); // split po jednej lub wielu spacjach
            final List<String> arguments = Arrays.asList(argsWithoutSpaces);

            final Action action = possibleActions.get(actionName);
            final String result = action.doIt(arguments);
            System.out.println(result);
        } else {
            System.out.println("Podano nieprawidłową akcję!");
        }
    }
}