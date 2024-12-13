package seminar5;

import java.util.Deque;
import java.util.LinkedList;

class BrowserHistory {
    // Напишите свое решение ниже
    Deque<String> history = new LinkedList<>();
    public void visitSite(String site) {
        // Напишите свое решение ниже
        history.addFirst(site);
    }
    public String back(int steps) {
        // Напишите свое решение ниже
        return history.stream().skip(steps).findFirst().orElse(null);
    }
    public Deque<String> getHistory() {
        // Напишите свое решение ниже
        return history;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz2 {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitSite("google.com");
        browserHistory.visitSite("stackoverflow.com");
        browserHistory.visitSite("github.com");
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.getHistory());
    }
}
