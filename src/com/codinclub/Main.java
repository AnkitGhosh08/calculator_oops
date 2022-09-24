package com.codinclub;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            calculator calculator = new calculator();

            Scanner scanner = new Scanner(System.in);
            System.out.print(" please Enter first number here : ");
            calculator.setA(scanner.nextFloat());
            System.out.print(" please Enter second number here : ");
            calculator.setB(scanner.nextFloat());
            float a = calculator.getA();
            float b = calculator.getB();
            service service = new service();
            System.out.print(" please select any one symbol ( +, -, * ,/ ) : ");
            String symbol = scanner.next();
            float result;
            switch (symbol) {
                case "+" :
                    result = service.addition(a,b);
                    System.out.println("subtract of number is :" + result);
                    break;
                case "-" :
                    result = service.subtracting(a,b);
                    System.out.println("subtract of number is :" + result);
                    break;
                case "*" :
                    result = service.multiply(a,b);
                    System.out.println("multiply of number is : " + result);
                    break;
                case "/" :
                    result = service.divides(a,b);
                    System.out.println("divide of number is : " + result);
                    break;
                default :
                    System.out.println("invalid symbol");
            }
    }
}
