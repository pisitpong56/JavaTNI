import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("This is Zero number.");
        } else {
            String type = (num % 2 == 0) ? "Even" : "Odd";
            String sign = (num > 0) ? "Positive" : "Negative";
            System.out.println("This number is " + type + " and " + sign + " number.");
        }
    }
}

