package Calc;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Actions makeAction = new Actions();
        System.out.println("Welcome to Calculator!\nPlease choose type of numerals:\n" +
                "  1. Roman\n  2. Arabic");
        int choice = input.nextInt();
        String exit;
        String check = "exit";
        switch (choice) {
            case 1: {
                Convert converting = new Convert();
                System.out.println("Calculator works with numbers from I to X\n" +
                        "Use 'Space' betwen signs and numbers, and 'Enter' to get result.");
                do {
                    String letA = input.next();
                    String sign = input.next();
                    String letB = input.next();
                    int a = converting.stringToInt(letA);
                    int b = converting.stringToInt(letB);
                    int res;
                    String letRes;
                    switch (sign) {
                        case "+":
                            res = (makeAction.add(a, b));
                            letRes = converting.intToString(res);
                            System.out.print(letA + " + " + letB + " = " + letRes + "\n");
                            break;
                        case "-":
                            res = (makeAction.substract(a, b));
                            if (res < 0)
                                System.out.print(letA + " - " + letB + " = null - You got negative value\n");
                            else {
                                letRes = converting.intToString(res);
                                System.out.print(letA + " - " + letB + " = " + letRes + "\n");
                            }
                            break;
                        case "*":
                            res = (makeAction.multiply(a, b));
                            letRes = converting.intToString(res);
                            System.out.print(letA + " * " + letB + " = " + letRes + "\n");
                            break;
                        case "/":
                            res = (makeAction.divide(a, b));
                            letRes = converting.intToString(res);
                            System.out.print(letA + " / " + letB + " = " + letRes + "\n");
                            break;
                        default:
                            System.out.println("Error! Unknown action.");
                    }
                    System.out.println("Type new expression or 'exit' to finish");
                    exit = input.nextLine();
                    //I can't stop it. Don't know why...
                } while (!check.equals(exit));
            }
            break;

            case 2: {
                System.out.println("Use 'Space' betwen signs and numbers, and 'Enter' to get result.");
                do {
                    int a = input.nextInt();
                    String sign = input.next();
                    int b = input.nextInt();
                    int res;
                    switch (sign) {
                        case "+":
                            res = (makeAction.add(a, b));
                            System.out.print(a + " + " + b + " = " + res + "\n");
                            break;
                        case "-":
                            res = makeAction.substract(a, b);
                            System.out.print(a + " - " + b + " = " + res + "\n");
                            break;
                        case "*":
                            res = makeAction.multiply(a, b);
                            System.out.print(a + " * " + b + " = " + res + "\n");
                            break;
                        case "/":
                            try {
                                res = makeAction.divide(a, b);
                                System.out.print(a + " / " + b + " = " + res + "\n");
                            } catch (ArithmeticException e) {
                                System.out.println("division by zero");
                            }
                            break;
                        default:
                            System.out.println("Error! Unknown action.");
                    }
                    System.out.println("Type new expression or 'exit' to finish");
                    exit = input.nextLine();
                }
                while (!check.equals(exit));
            }
            break;
            default:
                System.out.println("Incorrect choice. Choose '1' or '2'");
        }
    }
}

