package org.example.homework6.delivery.service;

import org.example.homework6.delivery.model.Parcel;

public class ParcelService {
    public void printParcelsReport(Parcel[] parcels) {
        for(Parcel parcel: parcels) {
            parcel.printInfo();
            System.out.printf("Стоимость доставки: %.2f%n", parcel.calculateDeliveryPrice());
            System.out.println();
        }
    }
}
