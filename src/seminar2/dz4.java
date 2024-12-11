package seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


class ArrayOperations {
    private static File log;
    private static FileWriter fileWriter;


    public static void findMinMax(int[] arr) {
        // Реализуйте метод для поиска минимального и максимального элемента
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
            int min = arr[0];
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
                logStep(min, max);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private static void logStep(int min, int max) {
        // Реализуйте метод для записи состояния в лог-файл
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String date = sdf.format(new Date());
            fileWriter.write(date + " " + min + " " + max + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz4 {
    public static void main(String[] args) {
        int[] arr = {};
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            arr = new int[]{9, 4, 8, 3, 1};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        ArrayOperations ans = new ArrayOperations();
        ans.findMinMax(arr);
        try (BufferedReader br = new BufferedReader(new
                FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
