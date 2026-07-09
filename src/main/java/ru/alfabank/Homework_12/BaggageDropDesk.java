package ru.alfabank.Homework_12;

import ru.alfabank.Homework_12.Exception.Checked.BaggageTagPrintException;
import ru.alfabank.Homework_12.Exception.Checked.FlightNotFoundException;
import ru.alfabank.Homework_12.Exception.Checked.OverweightBaggageException;
import ru.alfabank.Homework_12.Exception.Unchecked.InvalidBaggageWeightException;
import ru.alfabank.Homework_12.Exception.Unchecked.InvalidPassengerNameException;

import java.util.ArrayList;

public class BaggageDropDesk {

        private final String[] flights;

            public BaggageDropDesk(String[] flights) {
                this.flights = flights;
            }


    public BaggageTicket dropBaggage(String passengerName, String flightName, int baggageWeight) throws FlightNotFoundException, OverweightBaggageException, BaggageTagPrintException{

        if (passengerName == null || passengerName.isEmpty()) {
        throw new InvalidPassengerNameException("Поле имя не может быть пустым");
        }

        if(baggageWeight <= 0){
            throw new InvalidBaggageWeightException("Вес посылки не соответстует параметрам! ");
        }

        if (baggageWeight > 23) {
            int result = baggageWeight - 23;
            int sumOfTax = ((result * 100) / 3);
            throw new OverweightBaggageException("Вес посылки превышен на " + result + "\n Необходимо внести доплату"
                    + " в размере = " + sumOfTax);
        }

        if (!flightName.contains(flightName)){
                throw new FlightNotFoundException("Такого номера рейса не существует! Необходимо проверить номер");
        }

        if (flightName.equals("AE-404")){
            throw new BaggageTagPrintException ("Ошибка печати! \n Необходимо проверить наличие ленты в термопринтере! ");
        }

        return new BaggageTicket(passengerName, flightName, baggageWeight);


    }
}

