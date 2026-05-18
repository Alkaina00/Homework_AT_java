package org.example.homework6.delivery.app;

import org.example.homework6.delivery.model.ExpressParcel;
import org.example.homework6.delivery.model.FragileParcel;
import org.example.homework6.delivery.model.Parcel;
import org.example.homework6.delivery.service.ParcelService;

public class Main {
    public static void main(String[] args) {
        Parcel parcel = new Parcel("Андрей", "Москва, ул. Арбат, д. 1", 15, "TRK123");
        FragileParcel fragileParcel = new FragileParcel(true, "Марина", "Москва, ул. Арбат, д. 1", 5, "TRK125");
        ExpressParcel expressParcel = new ExpressParcel(12, "Михаил", "Москва, ул. Арбат, д. 1", 25, "TRK127");
        Parcel parcelWithoutArgs = new Parcel();

        Parcel[] parcels = {parcel, fragileParcel, expressParcel, parcelWithoutArgs};

        ParcelService parcelService = new ParcelService();
        parcelService.printParcelsReport(parcels);
    }
}
