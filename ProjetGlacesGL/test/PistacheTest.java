import glcc.Pistache;
import glcc.Glace;
import glcc.GlacePot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PistacheTest {

    private Pistache pistache;
    private Glace glace; // Dépendance concrète utilisée pour les tests

    @Before
    public void setUp() {
        glace = new GlacePot(); // Utilisation de la classe concrète GlacePot
        pistache = new Pistache(glace);
    }

    @Test
    public void testGetDesc() {
        String expected = "Glace en pot, pistache";
        assertEquals("La description doit inclure 'pistache'", expected, pistache.getDesc());
    }

    @Test
    public void testGetPrix() {
        double expected = 1.75; // 0.25 (GlacePot) + 1.5 (Pistache)
        assertEquals("Le prix doit être 1.75", expected, pistache.getPrix(), 0.001);
    }

    @Test
    public void testGetNbBoules() {
        int expected = 1; // 0 (GlacePot) + 1 (Pistache)
        assertEquals("Le nombre de boules doit être 1", expected, pistache.getNbBoules());
    }

    @Test
    public void testGetIngredients() {
        assertTrue("Les ingrédients doivent inclure 'Lait'", pistache.getIngredients().contains("Lait"));
        assertTrue("Les ingrédients doivent inclure 'Crème'", pistache.getIngredients().contains("Crème"));
        assertTrue("Les ingrédients doivent inclure 'Pistaches'", pistache.getIngredients().contains("Pistaches"));
        assertTrue("Les ingrédients doivent inclure 'Sucre'", pistache.getIngredients().contains("Sucre"));
    }

    @Test
    public void testGetAllergenes() {
        assertTrue("Les allergènes doivent inclure 'Lait'", pistache.getAllergenes().contains("Lait"));
        assertTrue("Les allergènes doivent inclure 'Œufs'", pistache.getAllergenes().contains("Œufs"));
        assertTrue("Les allergènes doivent inclure 'Fruits à coque'", pistache.getAllergenes().contains("Fruits à coque"));
    }

    @Test
    public void testGetValeursEnergetiques() {
        String expected = "Énergie : 230 kcal, Matières grasses : 15 g (dont 10 g saturées), Glucides : 20 g (dont 18 g sucres), Protéines : 5 g, Sel : 0.1 g";
        assertEquals("Les valeurs énergétiques doivent correspondre", expected, pistache.getValeursEnergetiques());
    }
}
