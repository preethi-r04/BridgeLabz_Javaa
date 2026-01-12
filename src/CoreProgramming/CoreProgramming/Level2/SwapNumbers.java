import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println(
            "The swapped numbers are " + number1 + " and " + number2
        );
    }

    public static class SI {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Principal amount: ");
            double principal = sc.nextDouble();
            System.out.print("Enter Rate of Interest: ");
            double rate = sc.nextDouble();
            System.out.print("Enter Time: ");
            double time = sc.nextDouble();
            double simpleInterest = (principal * rate * time) / 100;
            System.out.println(
                "The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time
            );
        }
    }
}
