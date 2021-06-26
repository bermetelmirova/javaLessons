package com.company;

public abstract class AbstractLivePlace {
    private int amountOfRoom;
    private String adress;
    private double payment;


    public abstract void live();

    public abstract void pay();

    public AbstractLivePlace() {
    }

    public AbstractLivePlace(int amountOfRoom, String adress, double payment) {
        this.amountOfRoom = amountOfRoom;
        this.adress = adress;
        this.payment = payment;
    }

    public double getPayment() {
        return payment;
    }

    public int getAmountOfRoom() {
        return amountOfRoom;
    }

    public String getAdress() {
        return adress;
    }

}
