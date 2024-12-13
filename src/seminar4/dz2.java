package seminar4;


import java.util.LinkedList;


class MyStack {
    // Напишите свое решение ниже
    private LinkedList<String> stack = new LinkedList<>();

    public void push(String element) {
        // добавляет элемент на вершину стека
        stack.addFirst(element);
    }

    public String pop() {
        // возвращает элемент с вершины и удаляет его
        return stack.removeFirst();
    }

    public String peek() {
        // возвращает элемент с вершины, не удаляя
        return stack.peekFirst();
    }
    public LinkedList<String> getElements() {
        // возвращает все элементы стека
        return new LinkedList<String>(stack);
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz2 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            stack.push("apple");
            stack.push("banana");
            stack.push("pear");
            stack.push("grape");
        } else {
            for (String arg : args) {
                stack.push(arg);
            }
        }
        System.out.println(stack.getElements());
        System.out.println(stack.pop());
        System.out.println(stack.getElements());
        System.out.println(stack.peek());
    }
}
