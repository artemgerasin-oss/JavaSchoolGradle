package ru.alfabank.Homework_12.Exception.Checked;

//указанного рейса нет в списке доступных рейсов

public class FlightNotFoundException extends AirportServiceException{
    public FlightNotFoundException(String message){
        super(message);
    }
}
