package ru.alfabank.HomeWork_6.app;

//app - класс Main

import ru.alfabank.HomeWork_6.model.ExpressParcel;
import ru.alfabank.HomeWork_6.model.FragileParcel;
import ru.alfabank.HomeWork_6.model.Parcel;
import ru.alfabank.HomeWork_6.service.Service;


public class app{
    public static void main(String[] args){


        //Турецкий все время спрашивает у Чарли: "Что там с сосисками?", а тот неизменно отвечает, что они будут готовы через пару минут (которые растягиваются надолго)
        Parcel normal   = new Parcel("Турецкий", "127 Broadway,West Ealing", 0.400, "psa8564none");


        //французский мастиф + 84 карата
        FragileParcel fragile = new FragileParcel("Микки О’Нил", "Окраина Лондона,  бродячая Пайка, дом-на колёсах 3", 45.016, "psa8563frag", true);

        //Desert Eagle Mark I
        ExpressParcel express = new ExpressParcel("Борис «Бритва» Юринов", "Tees Avenue, Perivale, Greenford, Greater London", 1.7, "psa8562ex", 18);


    Parcel empty    = new Parcel();  //без аргументов


    Parcel[] parcels = { normal, fragile, express, empty };

    Service service = new Service();
        Service.printParcelsReport(parcels);
    }


}


