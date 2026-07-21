package ru.alfabank.HomeWork_13;

// AssaultQueue.java
import java.util.LinkedList;

public class AssaultQueue {
    private LinkedList<String> queue = new LinkedList<>();

    // Добавляет штурмовика в конец очереди
    public void addRecruit(String name) {
        queue.addLast(name);
    }

    // Удаляет и возвращает штурмовика из начала очереди
    public String retreatCoward() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.removeFirst();
    }

    // Вывод текущего состояния очереди
    public void printQueue() {
        System.out.println("Current queue: " + queue);
    }

    @Override
    public String toString() {
        return "AssaultQueue{" +
                "queue=" + queue +
                '}';
    }
}
