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
        demoService.setRandom(new MockRandom(5));
        String actualResult = demoService.generateData("papatpon");
        assertEquals("papatpon5", actualResult);
    }

    @Test
    @DisplayName("throw exception runtime is not in range")
    public void random_throw_exception(){

        RuntimeException expectedException = assertThrows(RuntimeException.class, () -> {
            DemoService demoService = new DemoService();
            demoService.setRandom(new MockRandom(11));
            demoService.generateData("papatpon");
        });

        assertEquals("run number 11", expectedException.getMessage());

    }
}

class MockRandom extends Random {

    private final int result;

    MockRandom(int result) {
        this.result = result;
    }

    @Override
    public int nextInt(int bound) {
        return this.result;
    }
}

//class Random11 extends Random {
//    @Override
//    public int nextInt(int bound) {
//        return 11;
//    }
//}