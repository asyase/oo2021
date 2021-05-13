package com.example;
import org.junit.Test;



import static org.junit.Assert.*;

public class IonsTest {

    @Test
    public void createHydron() {
        Ions ions = new Ions();
        Ion hydron = ions.createHydron();
        assertNotNull(hydron);
        assertNotNull(hydron.getName());
        assertEquals("H", hydron.getName());
        assertEquals(1.007825, hydron.getMass(), 0);
        assertEquals(+1, hydron.getCharge(), 0);

    }

    @Test
    public void createNitrate() {
        Ions ions = new Ions();
        Ion nitrate = ions.createNitrate();
        assertNotNull(nitrate);
        assertNotNull(nitrate.getName());
        assertEquals("NO", nitrate.getName());
        assertEquals(62.0049, nitrate.getMass(), 0);
        assertEquals(-1, nitrate.getCharge(), 0);

    }
}