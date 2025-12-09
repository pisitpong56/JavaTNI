import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;


        while (true) {
            System.out.print("Input some sentence: ");
            sentence = scanner.nextLine();

            if (sentence.endsWith(".")) {
                break;
            } else {
                System.out.println("The sentence must end with a full stop (.)");
            }
        }


        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}



