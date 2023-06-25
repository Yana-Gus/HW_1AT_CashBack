package ru.netology.service;

//import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @org.junit.Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemainZeroWhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}