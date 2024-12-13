package seminar3;

import java.util.Arrays;
import java.util.LinkedHashSet;


class UniqueElements {
    public static int[] getUniqueElements(int[] a) {
        // Напишите свое решение ниже
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : a) {
            set.add(i);
        }
        int[] b = new int[set.size()];
        for (int i = 0; i < b.length; i++) {
            b[i] = set.iterator().next();
            set.remove(b[i]);
        }
        return b;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz2 {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
                    a = new int[]{1, 2, 2, 3, 4, 4, 5};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        UniqueElements answer = new UniqueElements();
        String itresume_res =
                Arrays.toString(answer.getUniqueElements(a));
        System.out.println(itresume_res);
    }
}
