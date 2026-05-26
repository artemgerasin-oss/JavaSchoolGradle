package ru.alfabank.HomeWork_2.delivery.service;

//service - класс для работы с отправлениями


import ru.alfabank.HomeWork_2.delivery.model.Parcel;

public class Service extends Parcel {

    public static void printParcelsReport(Parcel[] parcels) {
        for (Parcel parcel : parcels) {
            parcel.printInfo();
            System.out.println("Delivery price: " + parcel.calculateDeliveryPrice());
            System.out.println();  // пустая строка — разделитель
        }
    }

}
