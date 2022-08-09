package E1;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //E1
        //-------------------------------------------------------------------------//

        int firstNumber,secondNumber , result =0;
        char operation;
        System.out.print("Enter your first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Enter your second number: ");
        secondNumber = scanner.nextInt();
        System.out.println("Choose your operation :\n" +
                "( + )\n" +
                "( - )\n" +
                "( / )\n" +
                "( * )\n" +
                "( % )");
        operation = scanner.next().charAt(0);
        if (operation == '+'){
            result = firstNumber + secondNumber;
        }else if(operation == '-'){
            result = firstNumber - secondNumber;
        } else if (operation == '/') {
            result = firstNumber/secondNumber;
        } else if (operation == '*') {
            result = firstNumber*secondNumber;
        } else if (operation == '%') {
            result = firstNumber%secondNumber;
        }
        System.out.println(firstNumber+" "+secondNumber+" "+" = "+result);

        //-------------------------------------------------------------------------//

    }
}