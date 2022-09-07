import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in Â°F: ");
        int number = scanner.nextInt();
        System.out.print(number);
        System.out.printf("Â°F%n");
        double Y = number-32;
        double C = Y*5.0/9;


        System.out.printf("%.6fÂ°C%n", C);

        System.out.printf("%.0fÂ°C%n", C);

        System.out.print("If it were 2Â°C warmer it would be: ");
        System.out.printf("%.6fÂ°C%n", 2+C);
    }
}

