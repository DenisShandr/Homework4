package com.academy;

import com.academy.Client.Client;
import com.academy.Tariff.BaseTariff;
import com.academy.Tariff.UnlimTariff;
import com.academy.Tariff.TariffPlane;

import java.util.Arrays;

public class MobileCompany {

    public static void main(String[] args) {
        TariffPlane[] tariffList = new TariffPlane[6];
        Client[] clientList = new Client[10];

        TariffPlane tariff1 = new BaseTariff("Base 100", 10, 100);
        TariffPlane tariff2 = new BaseTariff("Base 400", 35, 400);
        TariffPlane tariff3 = new BaseTariff("Base 900", 70, 900);
        TariffPlane tariff4 = new UnlimTariff("Unlim Traffic", 210, true, false);
        TariffPlane tariff5 = new UnlimTariff("Unlim calls", 120, false, true);
        TariffPlane tariff6 = new UnlimTariff("Full unlim", 300, true, true);
        tariffList[0] = tariff3;
        tariffList[1] = tariff2;
        tariffList[2] = tariff1;
        tariffList[3] = tariff4;
        tariffList[4] = tariff5;
        tariffList[5] = tariff6;

        Client client1 = new Client("Anna", "+375291234567", tariff1);
        Client client2 = new Client("Oleg", "+375291002001", tariff2);
        Client client3 = new Client("Dmitry", "+375295544701", tariff3);
        Client client4 = new Client("Liza", "+375339045621", tariff4);
        Client client5 = new Client("Pavel", "+375337879300", tariff5);
        Client client6 = new Client("Kate", "+375332222222", tariff6);

        clientList[0] = client1;
        clientList[1] = client2;
        clientList[2] = client3;
        clientList[3] = client4;
        clientList[4] = client5;
        clientList[5] = client6;


        print(tariffList);


        countClients(clientList);


        print(clientList);


        findTariff(tariffList, 50, 130);


        Arrays.sort(tariffList);
        print(tariffList);


        tariffList[3].priceUp(100);
        tariffList[5].priceDown(100);
        tariffList[4].priceUp(100);
        print(tariffList);

    }

    private static void findTariff(TariffPlane[] tariffList, int minPrice, int maxPrice) {
        for (int i = 0; i < tariffList.length; i++) {
            if (tariffList[i].getSubscriptionFee() <= maxPrice && tariffList[i].getSubscriptionFee() >= minPrice) {
                System.out.println(tariffList[i]);
            }
        }
        System.out.println();
    }

    private static void countClients(Client[] clientList) {
        int countCLients = 0;
        for (int i = 0; i < clientList.length; i++) {
            if (clientList[i] != null) {
                countCLients++;
            }
        }
        System.out.println("There are " + countCLients + " clients.");
        System.out.println();
    }

    public static void print(Object[] objects) {
        for (Object object : objects) {
            if (object != null) {
                System.out.println(object);
            }
        }
        System.out.println();
    }
}
