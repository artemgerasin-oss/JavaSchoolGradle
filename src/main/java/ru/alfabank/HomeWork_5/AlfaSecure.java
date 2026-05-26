package ru.alfabank.HomeWork_2.HomeWork_5;


import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDate;
import java.util.Random;

public class AlfaSecure {


//Протокол ГЕНЕРАТОР
        public static String generateAccessCode() {

        int year = LocalDate.now().getYear(); // достаём год для первых четырёх символов
        String separator = "-";
        int magic = (int) Math.pow(3, 7);
        String lastPartToString = String.format("%04d",magic); // приводим данные функции magic к инт

            return year+separator+lastPartToString;
        }


//    Протокол ВАЛИДАТОР
//    Реализуйте метод isValidCode(String code, int minLength) - возвращает boolean.
//    Метод должен вернуть true, если:
//      code не равен null
//          длина code больше или равна minLength
//              code содержит символ "-"
//
//    Во всех остальных случаях - false.


//Протокол ВАЛИДАТОР
        private static boolean isValidCode(String code, int minLength){

        if (code == null) {
                return false;
            }
            return code.length() >= minLength & code.contains("-");
        }

//Протокол ЛОГГЕР
//v 1.0
        private static void logEvent(String message){
        System.out.println("[INFO]"+ message);
        }

//v 2.0
        public static void logEvent(String message, boolean isCritical){
            if (isCritical){
                System.out.println("[INFO]"+ message);
            }else {
                logEvent(message);
            }
        }

// ПРОТОКОЛ РАНДОМАЙЗЕР
    public static String generateAgentId(String prefix, int seed) {
        Random rnd = new Random(seed);
        int number = Math.abs(rnd.nextInt(9000) + 1000);
        return prefix + "-" + number;
    }



//    Протокол ДАШБОРД
//    Соберите всё в методе main(). Система должна выполнить следующий сценарий:
//    - Сгенерировать код доступа через generateAccessCode() и сохранить в переменную
//    -Проверить его через isValidCode(code, 8) и вывести результат
//    - Записать в лог событие "Server protection activated"
//    - Записать критическое событие "Intrusion attempt detected" (isCritical = true)
//    -Сгенерировать три ID агентов: prefix "AGENT", seed 42, 77 и 13 - вывести каждый

    public static void main(String[] args) {

    String accessCode = generateAccessCode();
    isValidCode(accessCode,8);
    logEvent("Server protection activated");
    logEvent("Intrusion attempt detected",true);


    System.out.println(generateAgentId("Agent", 42));
    System.out.println(generateAgentId("Agent", 72));
    System.out.println(generateAgentId("Agent", 13));



}
}
