import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int start = sc.nextInt();

        System.out.print("Enter the second number: ");
        int end = sc.nextInt();


        System.out.println("\nAll numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }


        System.out.println("\n\nEven numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

