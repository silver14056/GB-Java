package seminar3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


class FilterStrings {
    public static String[] filterShortStrings(String[] arr) {
        // Напишите свое решение ниже
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            if (s.length() > 3) {
                list.add(s);
            }
        }
        String[] arrResult = list.toArray(new String[list.size()]);
        return arrResult;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz3 {
    public static void main(String[] args) {
        String[] arr;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
                    arr = new String[]{"cat", "elephant", "dog",
                    "giraffe"};
        } else {
            arr = args[0].split(", ");
        }
        FilterStrings answer = new FilterStrings();
        String itresume_res =
                Arrays.toString(answer.filterShortStrings(arr));
        System.out.println(itresume_res);
    }
}
