package com.company;

public class Hotel extends AbstractLivePlace{

    @Override
    public void live() {
        System.out.println("Адрес: " + getAdress());
    }

    @Override
    public void pay() {
        System.out.println("Оплата за проживание: " + getPayment());
    }

    public Hotel() {
    }

    public Hotel(int amountOfRoom, String adress, double payment) {
        super(amountOfRoom, adress, payment);
    }
}
