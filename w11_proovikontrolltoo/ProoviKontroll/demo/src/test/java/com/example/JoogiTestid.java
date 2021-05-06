package com.example;

import org.junit.*;
import static org.junit.Assert.*;
public class JoogiTestid{
  
    Jook kanes = new Jook("Kanes", 1.2, 1.5);
    JoogiPudel p1 = new JoogiPudel("klaas", 0.7, 0.1, kanes);
    JoogiVaat v1 = new JoogiVaat(10, 120, kanes);
    JoogiKast k1 = new JoogiKast("Plastmass", 22.0, 3.0, 12);
    JoogiKast k2 = new JoogiKast("Puu", 42.0, 5.0, 24);

    @Test
    public void kontroll_1_massiLeidmine() {
        p1.lisaJook(kanes);
        assertEquals(0.3, 0.1, p1.leiaMass());
    }

    @Test
    public void kontroll_2_hinnaLeidmine() {
        assertEquals( 0.45, 0.94, p1.leiaHind());
    }

    @Test
    public void kontroll_3_vaadiTest() {
        assertEquals(10, 120, v1.liitrid);
        v1.pudeliTaitmine(p1);
        assertEquals(0.6, 0.1,  v1.liitrid);
        
    }

    @Test
    public void kontroll_3_kastiÜhineMass() {
        p1.lisaJook(kanes);
        k2.pudeliteLisamine(p1);
        assertEquals(5.2, 3.1, k2.kastiKoguMass(p1));
        k2.pudeliteLisamine(p1);
        k2.pudeliteLisamine(p1);
        k2.pudeliteLisamine(p1);
        assertEquals(10.1, 3.1, k2.kastiKoguMass(p1));
    }
        

	@Test
	public void kontroll4_kastiOmaHind(){
		p1.lisaJook(kanes);
		assertEquals(10,13.52, k1.kastiKoguHind(p1));
	}

    
    @Test
    public void kontroll_5_kastTest() {
        k1.pudeliteLisamine(p1);
        k1.pudeliteLisamine(p1);
        assertEquals(10, 12, k1.pesasid);
        k1.pudeliteLisamine(p1);
        assertEquals(9, 12, k1.n_pudelid);
    }



  


}



   


