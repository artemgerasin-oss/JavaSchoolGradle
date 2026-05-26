package ru.alfabank.HomeWork_2.delivery.model;

public class Parcel {
    private String recipientName;
    private String deliveryAdress;
    protected double packageWeight;
    private double defoultDelivaryTax;
    String trackNumber;

    public Parcel (){
        this.recipientName = "";
        this.deliveryAdress = "";
        this.packageWeight = 0.0;
        this.trackNumber = "";
    }

    public Parcel(String recipientName, String deliveryAdress, double packageWeight, String trackNumber){
    this.recipientName = recipientName;
    this.deliveryAdress = deliveryAdress;
    this.packageWeight = packageWeight;
    this.trackNumber = trackNumber;
    }


    // геттеры - сеттеры

    //геттеры

    public String getRecipientName() {
        return recipientName;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    //сеттеры


    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public double calculateDeliveryPrice (){
        return 100.0 + packageWeight * 30.0;
    }

    public void printInfo(){
        System.out.println("Посылка едет для: " + recipientName);
        System.out.println("по адресу: " + deliveryAdress);
        System.out.println("вес посылки: " + packageWeight);
        System.out.println("трек-номер посылки: " + trackNumber);

    }



}















