package ru.alfabank.Homework_12.Exception.Unchecked;

//имя пассажира null или пустое

    public class InvalidPassengerNameException extends RuntimeException{
        public InvalidPassengerNameException(String message) {
            super(message);
        }

}
