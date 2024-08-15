public class Third_task {
    public static void main(String[] args) {
        // Инициализируем массив с числами
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Выводим четные числа из массива
        System.out.println("Четные числа в массиве:");
        for (int i = 0; i < numbers.length; i++) { // Используем простой цикл for
            if (numbers[i] % 2 == 0) { // Проверяем, является ли число четным
                System.out.println(numbers[i]); // Если число четное, выводим его на экран
            }
        }
    }
}
