package ru.alfabank.HomeWork_6.service;

//service - класс для работы с отправлениями


import ru.alfabank.HomeWork_6.app.app;
import ru.alfabank.HomeWork_6.model.Parcel;

public class Service extends Parcel {

    public static void printParcelsReport(Parcel[] parcels) {
        for (Parcel parcel : parcels) {
            parcel.printInfo();
            System.out.println("Delivery price: " + parcel.calculateDeliveryPrice());
            System.out.println();  // пустая строка — разделитель
        }
    }

}
