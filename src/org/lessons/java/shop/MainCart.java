package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainCart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quale prodotto vuoi inserire? Tv/Smartphone/Cuffie: ");
        String product = scanner.nextLine().toLowerCase();

        switch (product) {
            case "tv":

                System.out.println("Nome tv: ");
                String tvName = scanner.nextLine();

                System.out.println("Descrizione tv: ");
                String tvDescription = scanner.nextLine();

                System.out.println("Dimensioni tv: ");
                int tvInches = Integer.parseInt(scanner.nextLine());

                System.out.println("Prezzo tv: ");
                BigDecimal tvPrice = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));

                System.out.println("Iva");
                BigDecimal tvVat = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));

                System.out.println("Smart tv?: ");
                String tvSmart = scanner.nextLine();

                if (tvSmart.equalsIgnoreCase("si")) {
                    tvSmart = "si";
                } else {
                    tvSmart = "no";
                }

                Tv tv = new Tv(tvName, tvDescription, tvPrice, tvVat, tvInches, tvSmart);
                System.out.println(tv.getProductInfo());

                break;

            case "smartphone":
                System.out.println("Nome smartphone: ");
                String smartphoneName = scanner.nextLine();

                System.out.println("Descrizione smartphone: ");
                String smartphoneDescription = scanner.nextLine();

                System.out.println("Prezzo smartphone: ");
                BigDecimal smartphonePrice = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));

                System.out.println("Iva");
                BigDecimal smartphoneVat = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));

                System.out.println("Memoria smartphone (Gb)");
                int storage = Integer.parseInt(scanner.nextLine());


                Smartphone smartphone = new Smartphone(smartphoneName, smartphoneDescription, smartphonePrice, smartphoneVat, storage);
                System.out.println(smartphone.getProductInfo());

                break;

            case "cuffie":
                System.out.println("Nome cuffie: ");
                String headsetName = scanner.nextLine();

                System.out.println("Descrizione cuffie: ");
                String headsetDescription = scanner.nextLine();

                System.out.println("Prezzo cuffie: ");
                BigDecimal headsetPrice = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));

                System.out.println("Iva");
                BigDecimal headsetVat = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));

                System.out.println("Colore cuffie: ");
                String color = scanner.nextLine();

                System.out.println("Wireless o con cavo?: ");
                String wirelessCable = scanner.nextLine();

                if (wirelessCable.equalsIgnoreCase("wireless")) {
                    wirelessCable = "wireless";
                } else {
                    wirelessCable = "cavo";
                }

                Headset headset = new Headset(headsetName, headsetDescription, headsetPrice, headsetVat, color, wirelessCable);
                System.out.println(headset.getProductInfo());

                break;
        }
        scanner.close();
    }
}