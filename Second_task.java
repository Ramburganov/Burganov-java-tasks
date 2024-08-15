import java.util.Scanner;

public class Second_task {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести первую строку
        System.out.print("Введите первую строку (a): ");
        String a = scanner.nextLine(); // Считываем первую строку

        // Просим пользователя ввести вторую строку
        System.out.print("Введите вторую строку (b): ");
        String b = scanner.nextLine(); // Считываем вторую строку

        // Сравниваем строки и выводим результат
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
