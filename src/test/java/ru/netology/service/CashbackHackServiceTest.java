package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(100), 900);
    }

    @Test
    public void testRemainMin() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void testRemainMax() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1000), 0);
    }
}