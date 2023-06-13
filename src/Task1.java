import java.util.Scanner;

public class Task1 {
    public static final int COMPARISON_NUMBER = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enteredValue;

        System.out.println("Введите целочисленное число:");

        enteredValue = scanner.nextInt();

        if (enteredValue > COMPARISON_NUMBER) {
            System.out.println("Привет");
        }
    }
}
