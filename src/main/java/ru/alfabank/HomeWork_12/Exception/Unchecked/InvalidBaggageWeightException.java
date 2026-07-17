package ru.alfabank.HomeWork_12.Exception.Unchecked;

//вес багажа меньше или равен нулю

public class InvalidBaggageWeightException extends RuntimeException {
    public InvalidBaggageWeightException(String message) {
        super(message);
    }
}