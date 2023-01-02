import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an expression like A + B");
        String result =  calc(scanner.nextLine());
        System.out.println(result);
        scanner.close();
    }

    public static String calc(String input) {
        Logic logic = new Logic();

        try {
            logic.testVariables(input);
        } catch (WrongExpressionException e) {
            return "throws Exception";
        }

        int i = logic.calculating();

        return String.valueOf(i);
    }
}
