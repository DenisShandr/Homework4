package com.academy.Client;

import com.academy.Tariff.TariffPlane;

public class Client {
    private String name;
    private String phoneNumber;
    private TariffPlane tariff;

    public Client(String name, String phoneNumber, TariffPlane tariff) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.tariff = tariff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public TariffPlane getTariff() {
        return tariff;
    }

    public void setTariff(TariffPlane tariff) {
        this.tariff = tariff;
    }

    @Override
    public String toString() {
        return "Client: " + name +
                ", phone number: " + phoneNumber +
                ", tariff: " + tariff.getName();
    }
}
