package com.company;

public class Dorm extends AbstractLivePlace{
    @Override
    public void live() {
        System.out.println("Адрес: " + getAdress());
    }

    @Override
    public void pay() {
        System.out.println("Оплата за проживание: " + getPayment());
    }

    public Dorm() {
    }

    public Dorm(int amountOfRoom, String adress, double payment) {
        super(amountOfRoom, adress, payment);
    }
}
