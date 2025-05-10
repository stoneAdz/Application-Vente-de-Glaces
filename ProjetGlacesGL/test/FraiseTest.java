import glcc.Fraise;
import glcc.Glace;
import glcc.GlacePot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraiseTest {

    private Fraise fraise;
    private Glace glace; // Dépendance concrète utilisée pour les tests

    @Before
    public void setUp() {
        glace = new GlacePot(); // Utilisation de la classe concrète GlacePot
        fraise = new Fraise(glace);
    }

    @Test
    public void testGetDesc() {
        String expected = "Glace en pot, fraise";
        assertEquals("La description doit inclure 'fraise'", expected, fraise.getDesc());
    }

    @Test
    public void testGetPrix() {
        double expected = 1.25; // 0.25 (GlacePot) + 1.0 (Fraise)
        assertEquals("Le prix doit être 1.25", expected, fraise.getPrix(), 0.001);
    }

    @Test
    public void testGetNbBoules() {
        int expected = 1; // 0 (GlacePot) + 1 (Fraise)
        assertEquals("Le nombre de boules doit être 1", expected, fraise.getNbBoules());
    }

    @Test
    public void testGetIngredients() {
        assertTrue("Les ingrédients doivent inclure 'Purée de fraises'", fraise.getIngredients().contains("Purée de fraises"));
        assertTrue("Les ingrédients doivent inclure 'Lait'", fraise.getIngredients().contains("Lait"));
        assertTrue("Les ingrédients doivent inclure 'Crème'", fraise.getIngredients().contains("Crème"));
    }

    @Test
    public void testGetAllergenes() {
        assertTrue("Les allergènes doivent inclure 'Lait'", fraise.getAllergenes().contains("Lait"));
        assertTrue("Les allergènes doivent inclure 'Oeufs'", fraise.getAllergenes().contains("Oeufs"));
    }

    @Test
    public void testGetValeursEnergetiques() {
        String expected = "Énergie : 200 kcal, Matières grasses : 12 g (dont 8 g saturées), Glucides : 25 g (dont 22 g sucres), Protéines : 3 g, Sel : 0.2 g";
        assertEquals("Les valeurs énergétiques doivent correspondre", expected, fraise.getValeursEnergetiques());
    }
}
