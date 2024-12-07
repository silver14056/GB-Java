package seminar1;

class Answer_3 {
    public int sumDigits(int n) {
        // Введите свое решение ниже
        int result = 0;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
    return result;
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz3 {
    public static void main(String[] args) {
        int n = 12345;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        // Вывод результата на экран
        Answer_3 ans = new Answer_3();
        int itresume_res = ans.sumDigits(n);
        System.out.println(itresume_res);
    }
}
