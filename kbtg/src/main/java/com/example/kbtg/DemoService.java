package com.example.kbtg;

import java.util.Random;

public class DemoService {

    private Random random;

//    public DemoService(Random random) {
//        this.random = random;
//    }



//    public static void main(String[] args) {
//
//    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String generateData(String name) {
        int number = random.nextInt(10);
        if (number >= 5 && number <= 8) {
            return name + number;
        }
        throw new RuntimeException("run number " + number);
    }
}
