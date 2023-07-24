package module11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {

    public static void main(String[] args) {

        List<String> arr = Arrays.asList("1, 2, 0", "4, 5");

        // Отримуємо всі числа з масиву
        List<Integer> numbers = new ArrayList<>();
        for (String str : arr) {
            String[] numArr = str.split(", ");
            for (String num : numArr) {
                numbers.add(Integer.parseInt(num));
            }
        }


        System.out.printf(numbers.stream()
                .sorted()
                .map(i -> i.toString())
                .collect(Collectors.joining(", ")));

    }
}
