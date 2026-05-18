package HomeWork_6.delivery.delivery.service;

//service - класс для работы с отправлениями


import HomeWork_6.delivery.delivery.model.Parcel;

public class Service extends Parcel {

    public static void printParcelsReport(Parcel[] parcels) {
        for (Parcel parcel : parcels) {
            parcel.printInfo();
            System.out.println("Delivery price: " + parcel.calculateDeliveryPrice());
            System.out.println();  // пустая строка — разделитель
        }
    }

}
