package com.company;

import java.util.Objects;

public class Cat {
    private int number;

    public Cat() {
    }

    public Cat(int number) {
        this.number = number;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this.hashCode() != o.hashCode()) {
//           return false;
//        }
//        Cat cat = (Cat) o;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
