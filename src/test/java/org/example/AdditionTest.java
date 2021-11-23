package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void add() {
        System.out.println("Test True ___ ****  condition");
        assertTrue(Addition.add(5, 3) == 8);
    }
}