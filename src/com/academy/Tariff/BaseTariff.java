package com.academy.Tariff;

public class BaseTariff extends TariffPlane {

    int amountOfInclusion;

    public BaseTariff(String name, int subscriptionFee, int amountOfInclusion) {
        super(name, subscriptionFee);
        this.amountOfInclusion = amountOfInclusion;
    }

    @Override
    public String toString() {
        return super.toString() +
                ". Voice call: " + amountOfInclusion + " minutes" +
                ". Traffic: " + amountOfInclusion + " Mb.";
    }

    public int getAmountOfInclusion() {
        return amountOfInclusion;
    }

    public void setAmountOfInclusion(int amountOfInclusion) {
        this.amountOfInclusion = amountOfInclusion;
    }

}
