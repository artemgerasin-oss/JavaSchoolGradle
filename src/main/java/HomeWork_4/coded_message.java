package HomeWork_4;
import java.util.Scanner;

//Напишите программу, которая:
//
// 1 Ввод данных
//  Запрашивает у пользователя последовательно 5 частей закодированного сообщения
//  Каждая часть — отдельная строка
//
//  2 Проверка корректности
//  Если введённая строка совпадает с "NULL" (без учёта регистра)
//  Выводит предупреждение:
//  "Часть сообщения повреждена! Используем резервный фрагмент..."
//  Вместо неё добавляет в сообщение строку: "XX"
//
// 3 Сборка сообщения
//  Объединяет все части в единое сообщение
//  Разделяет части символом #
//
//  4 Форматирование и вывод
//  Выводит итоговое сообщение в виде:
//  Расшифрованное послание: [сообщение]


public class coded_message {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] parts = new String[5];


            System.out.println("Введите 5 частей закодированного сообщения:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Часть " + (i + 1) + ": ");
                String input = scanner.nextLine().toUpperCase();

                if ("NULL".equals(input)) {
                    System.out.println("Часть сообщения повреждена! Используем резервный фрагмент...");
                    parts[i] = "XX";
                } else {
                    parts[i] = input;
                }
            }


            StringBuilder message = new StringBuilder();
            for (int i = 0; i < parts.length; i++) {
                if (i > 0) message.append("#");
                message.append(parts[i]);
            }


            System.out.println("\nРасшифрованное послание: " + message.toString());

            scanner.close();

        }



}


