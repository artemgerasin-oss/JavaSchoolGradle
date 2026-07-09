package ru.alfabank.Homework_12.Exception.Unchecked;

//вес багажа меньше или равен нулю

public class InvalidBaggageWeightException extends RuntimeException {
    public InvalidBaggageWeightException(String message) {
        super(message);
    }
}