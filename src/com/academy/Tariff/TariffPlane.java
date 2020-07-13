package com.academy.Tariff;

import com.academy.Tools.ProviderService;

public abstract class TariffPlane implements ProviderService, Comparable<TariffPlane> {

    private String name;
    private int subscriptionFee;

    public TariffPlane(String name, int subscriptionFee) {
        this.name = name;
        this.subscriptionFee = subscriptionFee;
    }

    public TariffPlane(String name) {
        this.name = name;
    }

    @Override
    public int priceUp(int priceUp) {
       return subscriptionFee += priceUp;
    }

    @Override
    public int priceDown(int priceDown) {
        if (subscriptionFee - priceDown < 0){
            return subscriptionFee = 0;
        }
        return subscriptionFee -= priceDown;
    }

    @Override
    public String toString() {
        return "Tariff plane: " + name +
                ". Subscription fee: " + subscriptionFee + "$";
    }

    @Override
    public int compareTo(TariffPlane tariffPlane) {
        return Integer.compare(subscriptionFee, tariffPlane.subscriptionFee);
    }

    public String getName() {
        return name;
    }

    public int getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubscriptionFee(int subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }
}
