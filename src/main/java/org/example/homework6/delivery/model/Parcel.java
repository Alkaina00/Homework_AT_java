package org.example.homework6.delivery.model;

public class Parcel {
    private String nameRecipient;
    private String addressDelivery;
    protected double weightPackage;
    String numberTrack;

    public Parcel() {
    }

    public Parcel(String nameRecipient, String addressDelivery, double weightPackage, String numberTrack) {
        this.nameRecipient = nameRecipient;
        this.addressDelivery = addressDelivery;
        this.weightPackage = weightPackage;
        this.numberTrack = numberTrack;
    }

    public String getNameRecipient() {
        return nameRecipient;
    }

    public void setNameRecipient(String nameRecipient) {
        this.nameRecipient = nameRecipient;
    }

    public String getAddressDelivery() {
        return addressDelivery;
    }

    public void setAddressDelivery(String addressDelivery) {
        this.addressDelivery = addressDelivery;
    }

    public double getWeightPackage() {
        return weightPackage;
    }

    public void setWeightPackage(double weightPackage) {
        this.weightPackage = weightPackage;
    }

    public double calculateDeliveryPrice() {
        return 100 + weightPackage * 30;
    }

    public void printInfo() {
        System.out.println("Информация о посылке:" );
        System.out.printf("Имя получателя: %s%n", nameRecipient);
        System.out.printf("Адрес доставки: %s%n", addressDelivery);
        System.out.printf("Вес посылки: %.2f%n", weightPackage);
        System.out.printf("Трек-номер: %s%n", numberTrack);
    }
}
