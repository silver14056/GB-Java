package seminar1;

class Answer_1 {
    public int factorial(int n) {
    // Введите свое решение ниже
    if (n < 0) return -1;

    int result = 1;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки


public class dz1 {
    public static void main(String[] args) {
        int n = 5;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        // Вывод результата на экран
        Answer_1 ans = new Answer_1();
        int itresume_res = ans.factorial(n);
        System.out.println(itresume_res);
    }
}
