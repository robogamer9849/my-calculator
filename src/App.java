import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        mymath calculate = new mymath();

        System.out.println("Hello, this is a calculator!");

        System.out.print("type a numebr:");
        int num1 = input.nextInt();

        System.out.print("type another numebr:");
        int num2 = input.nextInt();

        System.out.print("what do you want to do with numbers?");
        char amall = input.next().charAt(0);
        
        if (amall == '+') {
            System.out.printf("%d %c %d = %d", num1,amall,num2,calculate.add(num1, num2));
            System.out.println();
        }
        else if (amall == '-') {
            System.out.printf("%d %c %d = %d", num1,amall,num2,calculate.subtract(num1, num2));
            System.out.println();
        }
        else if (amall == '*') {
            System.out.printf("%d %c %d = %d", num1,amall,num2,calculate.multiply(num1, num2));
            System.out.println();
        }
        else if (amall == '/') {
            System.out.printf("%d %c %d = %d", num1,amall,num2,calculate.divid(num1, num2));
            System.out.println();
        }
        else if (amall == '%') {
            System.out.printf("%d %c %d = %d5", num1,amall,num2,calculate.leftOver(num1, num2));
            System.out.println();
        }
        else if (amall == '^') {
            System.out.printf("%d %c %d = %d", num1,amall,num2,calculate.power(num1, num2));
            System.out.println();
        }
        else if (amall == '!') {
            System.out.printf("%c%d = %d", amall,num1,calculate.squareRoot(num1));
            System.out.println();
            // System.out.printf("%c%d = %d", amall,num2,calculate.squareRoot(num2));
            // System.out.println();
        }
        else if (amall == '|') {
            System.out.printf("%c%d = %d", amall,num1,calculate.absolutevalue(num1));
            System.out.println();
            // System.out.printf("%c%d = %d", amall,num2,calculate.squareRoot(num2));
            // System.out.println();
        }
        else {
            System.out.println("!invalid input!");
        }

        input.close();


        // System.out.println(calculate.add(5, 2)); // 7
        // System.out.println(calculate.subtract(5, 2)); // 3
        // System.out.println(calculate.multiply(5, 2)); //10
        // System.out.println(calculate.divid(5, 2)); //2
        // System.out.println(calculate.leftOver(5, 2)); //2
        // System.out.println(calculate.power(5,2)); // 25
        // System.out.println(calculate.squareRoot(2)); // 2.2
        // System.out.println(calculate.absolutevalue(5)); // 5
    }
}
