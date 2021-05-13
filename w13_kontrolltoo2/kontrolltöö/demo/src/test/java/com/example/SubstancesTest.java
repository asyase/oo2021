package com.example;
import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.*;

public class SubstancesTest {

    private Substance sodiumChloride, calciumOxide, calciumSingleChloride;
    private Ions ions = new Ions();

    @Before
    public void createSubstance(){
        Substances substances = new Substances();
        sodiumChloride = substances.createSodiumChloride();
        calciumOxide = substances.createCalciumOxide();
        calciumSingleChloride = substances.createCalciumSingleChloride();
    }

    @Test
    public void checkSubstance(){
        assertNotNull(sodiumChloride);
        assertNotNull(calciumOxide);
        assertNotNull(calciumSingleChloride);

    }

    @Test
    public void calculateMass() {
        assertEquals(58.443, sodiumChloride.calculateMass(ions.createSodium(), ions.createChlorine()), 0.00023);
        assertEquals(56.0774, calciumOxide.calculateMass(ions.createCalcium(), ions.createOxide()), 0.0004);

    }

    @Test
    public void getName() {
        assertNotNull(sodiumChloride.getName());
        assertNotNull(calciumOxide.getName());
        assertNull(calciumSingleChloride.getName());
        assertEquals("NaCl", sodiumChloride.getName());
        assertEquals("CaO", calciumOxide.getName());
    }

    @Test
    public void getMolecularWeight() {
        assertEquals( 58.443, sodiumChloride.getMolecularWeight(), 0.00023);
        assertEquals(56.0774, calciumOxide.getMolecularWeight(), 0.0004);
        assertEquals(0, calciumSingleChloride.getMolecularWeight(), 0);
    }
}