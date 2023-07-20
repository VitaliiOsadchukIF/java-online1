package module11;

import java.util.List;
import java.util.stream.IntStream;
import static java.util.Arrays.asList;

public class OddName {

    // Створення об'єктів класу Names з іменами
    public static void main(String[] args) {
        Names andrij = new Names("Andrij");
        Names oksana = new Names("Oksana");
        Names sergij = new Names("Sergij");
        Names vitaliy = new Names("Vitaliy");
        Names taras = new Names("Taras");
        Names maria = new Names("Maria");

        // Створення списку з іменами
        List<Names> input = asList(andrij, oksana, sergij, vitaliy, taras, maria);
        IntStream.range(0, input.size()) // Використання IntStream для створення послідовності чисел від 0 до розміру списку
                .filter(i -> i % 2 != 0) // Фільтрація елементів за допомогою лямбда-виразу
                .forEach (i -> System.out.println(input.get(i))); // Виконання дії для кожного елемента за допомогою лямбда-виразу

    }
}
