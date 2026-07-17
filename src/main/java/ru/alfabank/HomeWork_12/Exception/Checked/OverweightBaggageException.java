package ru.alfabank.HomeWork_12.Exception.Checked;

//багаж слишком тяжелый

public class OverweightBaggageException extends AirportServiceException{
    public OverweightBaggageException(String message){
        super(message);
    }
}
