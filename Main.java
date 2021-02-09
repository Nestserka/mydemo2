package Revised_Test_Project;

import Revised_Test_Project.ErrorEnters.IkindlyAccept;
import Revised_Test_Project.ErrorEnters.OperationIsNotPossible;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! It is my first Java program. So please do not judge it too strictly.  ");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            while (true) {
                System.out.print("Now, enter an expression,  following 'Num OP Num'): ");
                String userIn = br.readLine();
                System.out.println(" Here is the answer");
                if (userIn.toUpperCase().trim().equals("EXIT")) break;

                String[] expression = userIn.split("\\s");
                String num1 = expression[0];
                String num2 = expression[2];
                String op = expression[1];

                if (!op.matches("[+-/*]?+")) {
                    throw new IkindlyAccept();
                }

                if (RN.isRoman(num1) && RN.isRoman(num2)) {
                    System.out.println(Calculator.calculate(expression[0], expression[2], op));

                } else if (!RN.isRoman(num1) && !RN.isRoman(num2)) {
                    System.out.println(Calculator.calculate(Integer.parseInt(num1), Integer.parseInt(num2), op));

                } else {
                    throw new OperationIsNotPossible();
                }
            }

        } catch (IkindlyAccept| IOException exc) {
            exc.printStackTrace();

}

    }

}