import java.util.Scanner;


public class MainApp {
    private static void testDelimiterApp() {
        System.out.println("Testing NumberDelimiter");
        NumberDelimiter delimiter = new NumberDelimiter(NumberDelimiter.SEPARATOR_COMMA);
        while (true) {
            String input = MainApp.readString("Enter a numeric string: ");
            if (input.length() == 0) {
                break;
            }
            String result = delimiter.addSeparatorToNumericString(input);
            System.out.println(result);
        }
    }

    private static String readString(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        MainApp.testDelimiterApp();
    }
}
