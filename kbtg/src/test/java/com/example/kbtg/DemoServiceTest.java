package com.example.kbtg;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoServiceTest {
    @Test
    @DisplayName("ในการทำงานต้อง random ได้ค่า 5")
    public void random_5(){

        DemoService demoService = new DemoService();
        demoService.setRandom(new Random5());
        String actualResult = demoService.generateData("papatpon");
        assertEquals("papatpon5", actualResult);
    }

    @Test
    @DisplayName("throw exception runtime is not in range")
    public void random_throw_exception(){

        assertThrows(RuntimeException.class, () -> {
            DemoService demoService = new DemoService();
            demoService.setRandom(new Random11());
            String actualResult = demoService.generateData("papatpon");
        });

    }
}

class Random5 extends Random {
    @Override
    public int nextInt(int bound) {
        return 5;
    }
}

class Random11 extends Random {
    @Override
    public int nextInt(int bound) {
        return 11;
    }
}