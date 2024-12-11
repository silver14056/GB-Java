package seminar2;

class TextCleaner {
    public static String removeEmptyLines(String text) {
        // Введите свое решение ниже
        String[] splitText = text.split("\n");
        StringBuilder sb = new StringBuilder();
        for (String s : splitText) {
            if (!s.isEmpty()) {
                sb.append(s).append("\n");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz3 {
    public static void main(String[] args) {
        String text = "";
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            text = "line1\n\nline2\n\nline3";
        } else {
            text = args[0];
        }
        TextCleaner ans = new TextCleaner();
        System.out.println(ans.removeEmptyLines(text));
    }
}
