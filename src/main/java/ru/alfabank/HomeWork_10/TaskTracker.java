package ru.alfabank.HomeWork_10;

import java.util.ArrayList;

public class TaskTracker {


    // Создаем аррей лист

    private final ArrayList<Task> tasks;


    // Конструктор

    public TaskTracker() {
        this.tasks = new ArrayList<>();
    }


    // Задаём метод добавления таски в список

    public void addTask(String title) {
        tasks.add(new Task(title));
        System.out.println("Задача \"" + title + "\" успешно добавлена.");
    }


    // Метод вывода всех тасок

    public void printAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
            return;
        }
        System.out.println("--- Список всех задач ---");
        for (Task task : tasks) {
            task.printTaskInfo();
        }
    }


    // Метод поиска таски по названию

    public void findTaskByTitle(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                System.out.print("Задача найдена: ");
                task.printTaskInfo();
                return;
            }
        }
        System.out.println("Задача не найдена");
    }


    // Задаём метод пометки таски как выполненной

    public void completeTask(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                task.markAsCompleted();
                System.out.println("Задача \"" + title + "\" отмечена как выполненная.");
                return;
            }
        }
        System.out.println("Не удалось выполнить: задача с названием \"" + title + "\" не найдена.");
    }

    // Метод вывода статистики всех тасок

    public void printStatistics() {
        int total = tasks.size();
        int completed = 0;

        for (Task task : tasks) {
            if (task.isCompleted()) {
                completed++;
            }
        }

        int open = total - completed;

        System.out.println("--- Статистика по задачам ---");
        System.out.println("Всего задач: " + total);
        System.out.println("Выполнено: " + completed);
        System.out.println("Открыто: " + open);
    }
}
