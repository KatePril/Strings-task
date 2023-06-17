package app.utils;

import java.util.Scanner;

public final class Input {

    public static String inputString(String message) {
        Scanner scanner = new Scanner(System.in);
        printMessage(message);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static String[] inputPattern(String messagePattern, String messagePatternReplacement) {
        Scanner scanner = new Scanner(System.in);
        printMessage(messagePattern);
        String pattern = scanner.nextLine();
        printMessage(messagePatternReplacement);
        String patternReplacement = scanner.nextLine();
        return new String[] {pattern, patternReplacement};
    }

    private static void printMessage(String message) {
        System.out.println(message + ": ");
    }
}
