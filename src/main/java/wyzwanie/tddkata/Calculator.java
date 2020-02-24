package wyzwanie.tddkata;

import java.util.Scanner;

public class Calculator {

    public Integer add(String input) {

        if (input == null || input.length() == 0) {
            return 0;
        } else {
            String[] values = input.replaceAll("\\s", "").split(",");

            Integer sum = 0;
            for (String s : values) {
                try {
                    sum += Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    return -1;
                }
            }
            return sum;
        }
    }

    //Do not modify code below this line. This is just a runner

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter calculation. Ctrl+d for exit.");

        Calculator calculator = new Calculator();
        System.out.print("> ");
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println(input + " ==> " + calculator.add(input));

            System.out.print("> ");
        }

    }
}
