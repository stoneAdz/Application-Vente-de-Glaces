import glcc.GlacePot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GlacePotTest {

    private GlacePot glacePot;

    @Before
    public void setUp() {
        glacePot = new GlacePot();
    }

    @Test
    public void testGetDesc() {
        String expected = "Glace en pot";
        assertEquals("La description doit être 'Glace en pot'", expected, glacePot.getDesc());
    }

    @Test
    public void testGetPrix() {
        double expected = 0.25;
        assertEquals("Le prix doit être 0.25", expected, glacePot.getPrix(), 0.001);
    }

    @Test
    public void testGetNbBoules() {
        int expected = 0;
        assertEquals("Le nombre de boules doit être 0", expected, glacePot.getNbBoules());
    }

    @Test
    public void testSetNbBoules() {
        glacePot.setNbBoules(3);
        int expected = 3;
        assertEquals("Le nombre de boules doit être mis à jour à 3", expected, glacePot.getNbBoules());
    }


}
