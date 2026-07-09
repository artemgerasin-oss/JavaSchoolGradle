package ru.alfabank.HomeWork_9;

import com.github.lalyos.jfiglet.FigletFont;
import net.datafaker.Faker;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Brands_pictures {


//часть уно

    // Массив с фамилиями для первого генератора
    public static final String[] LAST_NAMES = {
            "Schmidt",
            "Anderson",
            "Petrov",
            "Bashirov"
    };

    public static final Random random = new Random();

    // Часть 1: Случайный метод для выбора фамилии из массива
    private static String getRandomLastNameFromArray() {
        return LAST_NAMES[random.nextInt(LAST_NAMES.length)];
    }

    // Часть 1: Генерация названия-логотипа компании

    public static void generateCompanyLogo() throws IOException {
        // Строка 1: случайная фамилия из нашего массива
        String line1 = getRandomLastNameFromArray();

        // Строка 2: символ "&"
        String line2 = "&";

        // Строка 3: случайная фамилия из datafaker
        Faker faker = new Faker();
        String line3 = faker.name().lastName();


        System.out.println("Company: " + line1 + " & " + line3);
        System.out.println();

        // ASCII отрисовка логотипа (псевдографика)
        System.out.println(FigletFont.convertOneLine(line1));
        System.out.println(FigletFont.convertOneLine(line2));
        System.out.println(FigletFont.convertOneLine(line3));
        System.out.println();

    }
//часть 2

    public static void generateLegalData() {
        Faker faker = new Faker();

        // Полное ФИО
        String fullName = faker.name().name();

        // Телефонный номер
        String phoneNumber = faker.phoneNumber().phoneNumber();

        // Адрес
        String address = faker.address().fullAddress();


        System.out.println("Yristen faken daten ahtung starting >>>>");

        System.out.println("--- FIO: " + fullName);
        System.out.println("--- Teleponchick: " + phoneNumber);
        System.out.println("--- Adressen: " + address);
    }


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        boolean programWork = true;
        int choiceMenu;


        while (programWork) {


            System.out.println("1 - generate logo");
            System.out.println("2 - generate Yristen faken daten ahtung ");
            System.out.println("3 - Exit");
            System.out.println("--------------");
            System.out.println("Choice number for program");
            choiceMenu = scanner.nextInt();
            System.out.println("--------------");

            switch (choiceMenu){
                case 1:
                    System.out.println("Start generate logo");
                    generateCompanyLogo();
                    break;
                case 2:
                    System.out.println("Start generate Yristen daten ");
                    generateLegalData();
                    break;
                case 3:
                    System.out.println("Exit");
                    programWork = false;

                    default:
                    System.out.println("\n Error, repeat choice!");
                    continue;

            }
        }




}

}






//ДЗ 9 - зависимости

//Часть 1. Название-Логотип.
//Название должно генерироваться случайным образом из трех частей
//      - случайная_фамилия1 + " & " + случайная_фамилия2 - например Ernst & Young, Dolce & Gabanna и т.д.
//      Генерируемый логотип представляет собой эти три части, каждая расположенная на новой строке.
//      Но не все так просто - логотип должен отрисовываться ASCII псевдографикой (иначе какой же это логотип?). Пример на картинке:
//      Пока вы не возмутились "как я блин должен/должна все это написать" - слава богу в мире есть добрые люди которые разработали зависимости как раз под этот случай.
//      Найдите на сайте https://mvnrepository.com/ две зависимости:
//     1. datafaker (от datafaker.net) версии 2.5.4 - (генератор случайных данных)
//     2. jfiglet (от lalyos.github.com) версии 0.0.8 - (ASCII рисовалка) И подключите их в свой проект (в файле конфигурации Gradle-проекта - build.gradle).
//Генерируемые названия-логотипы компаний будут состоять из трех строк-частей - создаем-генерируем три отдельные строки:
//          1. случайная фамилия на английском - создайте массив с хотя бы 4 фамилиями и напишите метод, который будет выбирать и возвращать из этого массива случайное значение с помощью объекта класса Random
//          2. слово "&" (его генерировать не надо, просто задали значение)
//          3. случайная фамилия на английском номер 2 - вместо самописной генерилки используйте подключенную зависимость datafaker: создайте объект Faker и у объекта вызовите цепочку методов .name().lastName()
//Три строки для логотипа есть, теперь красиво отрисовываем их с помощью нашей второй зависимости jfiglet: у класса FigletFont вызываем метод convertOneLine() и передаем в него строку, которую хотим преобразовать для красивой отрисовки. Результат каждого из вызовов методов - передаем в System.out.println.
//
//
//Часть 2. Генерилка юр данных для регистрации
//Зайдите в исходный код класса Faker и попробуйте найти методы, которые могут генерировать:
//  1. полное ФИО
//  2. телефонный номер
//  3. адрес
//      Под логотипом выведите всю эту сгенерированную информацию. Пример полного вывода:
//
//Часть 3. Медитация
//       Помедитируйте над тремя вопросами (ответы запишите в ANSWERS.md-файл в пакете с кодом решения):
//        1. Нужно ли было впринципе писать свой собственный генератор с фамилиями? Было бы проще использовать генератор из datafaker?
//        2. Какая из двух библиотек из этого задания может больше пригодится при написании автотестов - jfiglet или datafaker?
//        3. Каким образом JAR-файлы этих библиотек попали к нам в проект?
