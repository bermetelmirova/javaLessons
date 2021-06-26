package com.company;

public class Flat extends AbstractLivePlace {

    @Override
    public void live() {
        System.out.println("Адрес: " + getAdress());
    }

    @Override
    public void pay() {
        System.out.println("Оплата за комм.услуги: " + getPayment());
    }

    public Flat() {
    }

    public Flat(int amountOfRoom, String adress, double payment) {
        super(amountOfRoom, adress, payment);
    }
}
