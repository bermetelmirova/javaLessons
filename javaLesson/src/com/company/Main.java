package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        HashSet <Human> famil = new HashSet<>();
        famil.add(new Human("Элмир",47));
        famil.add(new Human("Камила",35));
        famil.add(new Human("Бермет",8));
        Family family = new Family(famil);
        Flat flat = new Flat(4,"12 microdistrict 55",45000);
        flat.live();
        flat.pay();
    }


}