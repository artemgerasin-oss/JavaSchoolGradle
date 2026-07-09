package ru.alfabank.Homework_12.Exception.Errors;

//Унаследуй его от Error
//Это не обычная ошибка бизнес-логики, а критическая ситуация, блокирующая работу пункта приема багажа.
//В обычной программе такие ошибки не нужно ловить через catch.


public class ConveyorBeltMalfunctionError extends Error{

}
