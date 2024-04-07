package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTestJupiter {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(100), 900);
    }

    @Test
    public void testRemainMin() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void testRemainMax() {
        CashbackHackService service = new CashbackHackService();

        Assertions.assertEquals(service.remain(1000), 0);
    }
}