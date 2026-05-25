package org.example.homework6.delivery.model;

public class ExpressParcel extends Parcel {
    private int deliveryHours;

    public ExpressParcel(int deliveryHours, String nameRecipient, String addressDelivery, double weightPackage, String numberTrack) {
        super(nameRecipient, addressDelivery, weightPackage, numberTrack);
        this.deliveryHours = deliveryHours;
    }

    @Override
    public double calculateDeliveryPrice() {
        return deliveryHours < 24 ? super.calculateDeliveryPrice() + 500 : super.calculateDeliveryPrice();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Delivery deadline: %d hours%n", deliveryHours);
    }
}
