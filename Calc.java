import java.util.Scanner;

class RomanNumber{
    public int stringToInt(String letter){
        int num=0;
        switch (letter){
            case "I": num = 1; break;
            case "II": num = 2; break;
            case "III": num = 3; break;
            case "IV": num = 4; break;
            case "V": num = 5; break;
            case "VI": num = 6; break;
            case "VII": num = 7; break;
            case "VIII": num = 8; break;
            case "IX": num = 9; break;
            case "X": num = 10; break;
            default: System.out.println("Error! Type number from I to X.");
        }
        return num;
    }
    public String intToString(int res){
        String let=null;
        String letR=null;
        int var=0;
        if (res<=10){
            var = res;
        }
        else if (res>10){
            var = res - 10;
        }
        switch (var){
            case 1: let = "I"; break;
            case 2: let = "II"; break;
            case 3: let ="III" ; break;
            case 4: let = "IV"; break;
            case 5: let = "V"; break;
            case 6: let = "VI"; break;
            case 7: let = "VII"; break;
            case 8: let ="VIII" ; break;
            case 9: let = "IX"; break;
            case 10: let = "X"; break;
            default: let = "null";
        }
        if (res<=10){
            letR = let;
        }
        else if (res>10){
            letR = "X" + let ;
        }
        return letR;
    }
}

public class Calc {
    public Calc(){
    }

    public int addR(int a, int b){
        int res = a + b;
        return res;
    }
    public int substractR(int a, int b){
        int res = a - b;
        return res;
    }
    public int multiplyR(int a, int b){
        int res = a * b;
        return res;
    }
    public int divideR(int a, int b) {
        int res = a / b;
        return res;
    }


    public void add(int a, int b){
        int sum = a + b;
        System.out.println(a+" + "+b+ " = "+sum+"\n");
    }
    public void substract(int a, int b){
        int dif = a - b;
        System.out.println(a+" - "+b+ " = "+dif+"\n");
    }
    public void multiply(int a, int b){
        int prod = a * b;
        System.out.println(a+" * "+b+ " = "+prod+"\n");
    }
    public void divide(double a, double b){
        double div = a / b;
        System.out.println(a+" / "+b+ " = "+div+"\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calc myCalc = new Calc();
        RomanNumber change = new RomanNumber();
        RomanNumber back = new RomanNumber();
        System.out.println("Welcome to Calculator!\nPlease choose type of numerals:\n" +
                "  1. Roman\n  2. Arabic");
        int choice = input.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Welcome to Calculator with Roman numerals!\n" +
                        "Calculator works with numbers from I to X\nPlease press 'Enter' after every operation.");

                String yN = "Y";
                do {
                    yN = input.nextLine();
                    String letter1 = input.nextLine();
                    int a = change.stringToInt(letter1);
                    String signR = input.nextLine();
                    String letter2 = input.nextLine();
                    int b = change.stringToInt(letter2);
                    int res;
                    String let;
                    switch (signR) {
                        case "+":
                            myCalc.addR(a, b);
                            res = (myCalc.addR(a, b));
                            let = back.intToString(res);
                            System.out.println("Result\n"+let+"\n");
                            break;
                        case "-":
                            myCalc.substractR(a, b);
                            res = (myCalc.substractR(a, b));
                            let = back.intToString(res);
                            System.out.println("Result\n"+let+"\n");
                            break;
                        case "*":
                            myCalc.multiplyR(a, b);
                            res = (myCalc.multiplyR(a, b));
                            let = back.intToString(res);
                            System.out.println("Result\n"+let+"\n");
                            break;
                        case "/":
                            myCalc.divideR(a, b);
                            res = (myCalc.divideR(a, b));
                            let = back.intToString(res);
                            System.out.println("Result\n"+let+"\n");
                            break;
                        default:
                            System.out.println("Error! Unknown action.");
                    }
                    System.out.println("Press 'Enter' to proceed or type 'exit' to finish");
                }
                while (yN != "exit");
            }
            break;

            case 2: {
                System.out.println("Welcome to Calculator with Arabic numerals!" +
                        "\nPlease press 'Enter' after every operation.");

                String yesNo = "Y";
                do {
                    int a = input.nextInt();
                    String sign = input.next();
                    int b = input.nextInt();
                    switch (sign) {
                        case "+":
                            myCalc.add(a, b);
                            break;
                        case "-":
                            myCalc.substract(a, b);
                            break;
                        case "*":
                            myCalc.multiply(a, b);
                            break;
                        case "/":
                            myCalc.divide(a, b);
                            break;
                        default:
                            System.out.println("Error! Unknown action.");
                    }
                    System.out.println("Press 'Enter' to proceed or type 'exit' to finish");
                    yesNo = input.nextLine();
                }
                while (yesNo != "exit");
            }
            break;
            default:
                System.out.println("Incorrect choice. Choose '1' or '2'");
        }
    }
}
