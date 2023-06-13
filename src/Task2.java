import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("Введите имя:");

        name = scanner.nextLine();

        if (name.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

    }
}
