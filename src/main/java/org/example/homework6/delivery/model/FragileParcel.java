package org.example.homework6.delivery.model;

public class FragileParcel extends Parcel {
    private boolean requiresCarefulHandling;

    public FragileParcel(boolean requiresCarefulHandling, String nameRecipient, String addressDelivery, double weightPackage, String numberTrack) {
        super(                                                                                                                                                                  nameRecipient, addressDelivery, weightPackage, numberTrack);
        this.requiresCarefulHandling = requiresCarefulHandling;
    }

    @Override
    public double calculateDeliveryPrice() {
        return super.calculateDeliveryPrice() + 200;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Handle with care: %b%n", requiresCarefulHandling);
    }
}