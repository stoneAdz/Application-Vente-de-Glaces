import glcc.GlaceCornet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GlaceCornetTest {

    private GlaceCornet glaceCornet;

    @Before
    public void setUp() {
        glaceCornet = new GlaceCornet();
    }

    @Test
    public void testGetDesc() {
        String expected = "Glace en cornet";
        assertEquals("La description doit être 'Glace en cornet'", expected, glaceCornet.getDesc());
    }

    @Test
    public void testGetPrix() {
        double expected = 0.75;
        assertEquals("Le prix doit être 0.75", expected, glaceCornet.getPrix(), 0.001);
    }

    @Test
    public void testGetNbBoules() {
        int expected = 0;
        assertEquals("Le nombre de boules doit être 0", expected, glaceCornet.getNbBoules());
    }

    @Test
    public void testSetNbBoules() {
        glaceCornet.setNbBoules(2);
        int expected = 2;
        assertEquals("Le nombre de boules doit être mis à jour à 2", expected, glaceCornet.getNbBoules());
    }

  
}
