import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        while (true) {
            System.out.print("Enter word: ");
            String word = scanner.nextLine();

            if (word.equalsIgnoreCase("stop")) {
                break;
            }

            result.append(word).append(" ");
        }

        System.out.println(result.toString().trim());
        scanner.close();
    }
}


