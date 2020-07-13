package com.academy.Tariff;

public class UnlimTariff extends TariffPlane {

    boolean internetTraffic;
    boolean voiceCall;

    public UnlimTariff(String name, int subscriptionFee, boolean internetTraffic, boolean voiceCall) {
        super(name, subscriptionFee);
        this.internetTraffic = internetTraffic;
        this.voiceCall = voiceCall;
    }

    @Override
    public String toString() {
        if (internetTraffic && voiceCall) {
            return super.toString() + " Full unlim.";
        }
        if (internetTraffic) {
            return super.toString() + " Internet unlim.";
        }
        if (voiceCall) {
            return super.toString() + " Voice calls unlim.";
        }
        return "Impossible tariff!!! Check the entered data.";
    }

    public boolean isInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(boolean internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    public boolean isVoiceCall() {
        return voiceCall;
    }

    public void setVoiceCall(boolean voiceCall) {
        this.voiceCall = voiceCall;
    }


}
