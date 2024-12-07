package seminar1;

class Answer_2 {
    public static void printEvenNums() {
// Напишите свое решение ниже
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz2 {
    public static void main(String[] args) {
        Answer_2 ans = new Answer_2();
        ans.printEvenNums();
    }
}