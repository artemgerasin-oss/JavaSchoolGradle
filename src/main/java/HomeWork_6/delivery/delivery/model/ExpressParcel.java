package HomeWork_6.delivery.delivery.model;

public class ExpressParcel extends Parcel{

    private int deliveryHours;

    public ExpressParcel (String recipientName, String deliveryAdress, double packageWeight, String trackNumber, int deliveryHours){

        super(recipientName, deliveryAdress, packageWeight, trackNumber);
        this.deliveryHours = deliveryHours;

    }
    @Override
    public double calculateDeliveryPrice() {
        double base = super.calculateDeliveryPrice();
        if (deliveryHours < 24) {
            return base + 500.0;
        }
        return base;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Delivery deadline: " + deliveryHours + " hours");
    }

}
