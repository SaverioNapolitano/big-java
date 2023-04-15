package com.snapolitano.programmingprojects.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1_2Test {

    @Test
    void workCarUsePercentage() {
        assertEquals(50.0, P1_2.workCarUsePercentage(400, 0, 1600, 1));
        assertEquals(80.0, P1_2.workCarUsePercentage(10, 0, 100, 4));
    }

    @Test
    void personalCarUse() {
        assertEquals(50.0, P1_2.personalCarUse(P1_2.workCarUsePercentage(400, 0, 1600, 1)));
        assertEquals(20, P1_2.personalCarUse(P1_2.workCarUsePercentage(10, 0, 100, 4)));
    }
}