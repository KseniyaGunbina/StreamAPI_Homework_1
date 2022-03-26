import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // отфильтровать положительные числа
        List<Integer> positiveInt = new ArrayList<>();
        for (Integer a : intList) {
            if (a > 0) {
                positiveInt.add(a);
            }
        }

        // найти в positiveInt четные числа
        List<Integer> evenInt = new ArrayList<>();
        for (Integer b : positiveInt) {
            if (b % 2 == 0) {
                evenInt.add(b);
            }
        }

        // отсортировать в порядке возрастания
        evenInt.sort(Comparator.naturalOrder());

        // вывод результата
        for (Integer c : evenInt) {
            System.out.println(c);
        }


    }



}
