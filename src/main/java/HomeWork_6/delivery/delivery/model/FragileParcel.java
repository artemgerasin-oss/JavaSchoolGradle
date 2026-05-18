package HomeWork_6.delivery.delivery.model;

public class FragileParcel extends Parcel{

    private boolean requiresCarefulHandling;


    public FragileParcel(String recipientName, String deliveryAdress, double packageWeight, String trackNumber, boolean requiresCarefulHandling){

        super(recipientName, deliveryAdress, packageWeight, trackNumber);
        //super (Parcel);
        this.requiresCarefulHandling = requiresCarefulHandling;

    }

    @Override
    public double calculateDeliveryPrice(){

        double base = super.calculateDeliveryPrice();
        return base + 200.0;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Handle with care: " + requiresCarefulHandling);
    }



}
