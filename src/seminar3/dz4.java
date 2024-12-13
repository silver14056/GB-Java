package seminar3;

import java.util.Arrays;


class AverageCalculator {
    public static int calculateAverage(int[] a) {
        // Напишите свое решение ниже
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double average = (double) sum / a.length;
        int intresult = (int) Math.round(average);
        return intresult;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz4 {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
                    a = new int[]{4, 2, 7, 5, 1};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        AverageCalculator answer = new AverageCalculator();
        int result = answer.calculateAverage(a);
        System.out.println(result);
    }
}
