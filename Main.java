import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calculator!");
        System.out.println("Please introduce 2 numbers->");
        System.out.println("Number 1 is:");
        int number1 = input.nextInt();
        System.out.println("Number 2 is:");
        int number2 = input.nextInt();
        System.out.println("Now you have to choose 1 of the 4 operators below ->");
        System.out.println("+");
        System.out.println("-");
        System.out.println("/");
        System.out.println("*");
        input.nextLine();
        String operator = input.nextLine();
        int result = 0;
        double div = 0;

        Calculator calculator = new Calculator();

        switch (operator) {
            case "+":
                result = number1 + number2;
                System.out.println("Sum of the two numbers is -> " + result);
                System.out.println("Sum using method is -> " + calculator.sum(number1, number2));
                break;
            case "-":
                result = number1 - number2;
                System.out.println("Dif of the two numbers is -> " + result);
                System.out.println("Dif using method is -> " + calculator.dif(number1, number2));
                break;
            case "/":
                div = (double) number1 / number2;
                System.out.println("Div of the two numbers is -> " + div);
                System.out.println("Div using method is -> " + calculator.div(number1, number2));
                break;
            case "*":
                result = number1 * number2;
                System.out.println("Mul of the two numbers is -> " + result);
                System.out.println("Mul using method is -> " + calculator.mul(number1, number2));
                break;
            default:
                System.out.println("Wrong operator");

        }


    }

}