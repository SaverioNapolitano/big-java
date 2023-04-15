package com.snapolitano.programmingprojects.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1_1Test {

    @Test
    void trainOrCar() {
        assertEquals(0, P1_1.trainOrCar(20, 30, 50));
        assertEquals(1, P1_1.trainOrCar(80, 20, 15));
    }
}