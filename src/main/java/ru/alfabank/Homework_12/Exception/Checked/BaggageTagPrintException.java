package ru.alfabank.Homework_12.Exception.Checked;

//не получилось напечатать багажную бирку

public class BaggageTagPrintException extends AirportServiceException{
    public BaggageTagPrintException(String message){
        super(message);
    }
}
