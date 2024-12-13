package seminar3;

import java.util.ArrayList;
import java.util.Arrays;


class FilterNegative {
    public static int[] filterNegative(int[] a) {
        // Напишите свое решение ниже
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                list.add(a[i]);
            }
        }
        int[] b = new int[list.size()];
        for (int i = 0; i < b.length; i++) {
            b[i] = list.get(i);
        }
        return b;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz1 {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
                    a = new int[]{-1, 2, -3, 4, -5, 6};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        FilterNegative answer = new FilterNegative();
        String itresume_res =
                Arrays.toString(answer.filterNegative(a));
        System.out.println(itresume_res);
    }
}

