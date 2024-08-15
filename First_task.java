import java.util.Scanner;

public class First_task {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести первое число
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt(); // Считываем первое число

        // Просим пользователя ввести второе число
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt(); // Считываем второе число

        // Сравниваем два числа и выводим результат
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Выполняем арифметические операции и выводим результаты
        int sum = a + b;
        System.out.println("Сложение: " + sum);

        int difference = a - b;
        System.out.println("Вычитание: " + difference);

        int product = a * b;
        System.out.println("Умножение: " + product);

        if (b != 0) {
            double division = (double) a / b; // Приводим a к типу double для получения точного результата
            System.out.println("Деление: " + division);
        } else {
            System.out.println("Деление на ноль невозможно."); // Обрабатываем случай деления на ноль
        }
    }
}
