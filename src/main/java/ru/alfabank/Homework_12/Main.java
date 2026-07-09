package ru.alfabank.Homework_12;

public class Main {

    public static void main(String[] args) {

        String[] flights = { "A320-58", "TK-777", "KC-909", "AE-404" };

        BaggageTicket ticketOne = new BaggageTicket("Vasya","A320-58",23);

        System.out.println(ticketOne);

//        Создай стойку приема багажа BaggageDropDesk. Проверь в main работу по разным сценариям:
            BaggageDropDesk baggage = new BaggageDropDesk(flights);

            System.out.println("успешная сдача багажа");
            baggage.dropBaggage("Vasya","A320-58",20);



//        1. успешная сдача багажа
//        2. указанного пассажиром рейса не существует в базе
//        3. багаж слишком тяжелый
//        4. проблема с печатью бирки
//        5. некорректное имя пассажира (null)
//        6. некорректный вес багажа (отрицательный)


    }










}