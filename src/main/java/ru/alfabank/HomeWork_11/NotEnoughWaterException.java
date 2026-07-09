package ru.alfabank.HomeWork_11;

public class NotEnoughWaterException extends RuntimeException{

    //Переопределяем исключение через конструктор
    public NotEnoughWaterException(String message) {
        super(message);
    }
}
