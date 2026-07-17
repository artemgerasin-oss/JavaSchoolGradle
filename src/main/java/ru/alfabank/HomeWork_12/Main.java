package ru.alfabank.HomeWork_12;

import ru.alfabank.HomeWork_12.BaggageDropDesk;
import ru.alfabank.HomeWork_12.Exception.Checked.BaggageTagPrintException;
import ru.alfabank.HomeWork_12.Exception.Checked.FlightNotFoundException;
import ru.alfabank.HomeWork_12.Exception.Checked.OverweightBaggageException;
import ru.alfabank.HomeWork_12.Exception.Errors.ConveyorBeltMalfunctionError;
import ru.alfabank.HomeWork_12.Exception.Unchecked.InvalidBaggageWeightException;
import ru.alfabank.HomeWork_12.Exception.Unchecked.InvalidPassengerNameException;


import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

        //Создаём массив рейсов и стойку проверки багажа
        ArrayList<String> flights = new ArrayList<>(List.of("SU-123","TK-777", "KC-909", "AE-404"));
        BaggageDropDesk baggageDropDesk = new BaggageDropDesk(flights);

        //Проверяем различные сценарии, обложив их проверками
        //Успешная сдача багажа
        try {
            baggageDropDesk.dropBaggage( "Petrov Ivan", flights.get(2), 22);
        } catch (FlightNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (BaggageTagPrintException e) {
            System.out.println(e.getMessage());
        } catch (OverweightBaggageException e) {
            System.out.println(e.getMessage());
        } catch (InvalidBaggageWeightException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPassengerNameException e) {
            System.out.println(e.getMessage());
        } catch (ConveyorBeltMalfunctionError e) {
            System.out.println(e.getMessage());
        }

        //Указанного пассажиром рейса не существует в базе
        try {
            baggageDropDesk.dropBaggage( "Petrov Ivan", "RTG-554", 22);
        } catch (FlightNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (BaggageTagPrintException e) {
            System.out.println(e.getMessage());
        } catch (OverweightBaggageException e) {
            System.out.println(e.getMessage());
        } catch (InvalidBaggageWeightException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPassengerNameException e) {
            System.out.println(e.getMessage());
        } catch (ConveyorBeltMalfunctionError e) {
            System.out.println(e.getMessage());
        }

        //Багаж слишком тяжёлый
        try {
            baggageDropDesk.dropBaggage( "Petrov Ivan", flights.get(2), 24);
        } catch (FlightNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (BaggageTagPrintException e) {
            System.out.println(e.getMessage());
        } catch (OverweightBaggageException e) {
            System.out.println(e.getMessage());
        } catch (InvalidBaggageWeightException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPassengerNameException e) {
            System.out.println(e.getMessage());
        } catch (ConveyorBeltMalfunctionError e) {
            System.out.println(e.getMessage());
        }

        //Проблема с печатью бирки
        try {
            baggageDropDesk.dropBaggage( "Petrov Ivan", flights.get(3), 22);
        } catch (FlightNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (BaggageTagPrintException e) {
            System.out.println(e.getMessage());
        } catch (OverweightBaggageException e) {
            System.out.println(e.getMessage());
        } catch (InvalidBaggageWeightException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPassengerNameException e) {
            System.out.println(e.getMessage());
        } catch (ConveyorBeltMalfunctionError e) {
            System.out.println(e.getMessage());
        }

        //Некорректное имя пассажира null
        try {
            baggageDropDesk.dropBaggage( null, flights.get(2), 22);
        } catch (FlightNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (BaggageTagPrintException e) {
            System.out.println(e.getMessage());
        } catch (OverweightBaggageException e) {
            System.out.println(e.getMessage());
        } catch (InvalidBaggageWeightException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPassengerNameException e) {
            System.out.println(e.getMessage());
        } catch (ConveyorBeltMalfunctionError e) {
            System.out.println(e.getMessage());
        }

        //Некорректный вес багажа (отрицательный)
        try {
            baggageDropDesk.dropBaggage( "Petrov Ivan", flights.get(2), -22);
        } catch (FlightNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (BaggageTagPrintException e) {
            System.out.println(e.getMessage());
        } catch (OverweightBaggageException e) {
            System.out.println(e.getMessage());
        } catch (InvalidBaggageWeightException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPassengerNameException e) {
            System.out.println(e.getMessage());
        } catch (ConveyorBeltMalfunctionError e) {
            System.out.println(e.getMessage());
        }
    }
}
