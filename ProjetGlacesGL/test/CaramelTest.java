import glcc.Caramel;
import glcc.Glace;
import glcc.GlacePot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaramelTest {

    private Caramel caramel;
    private Glace glace; // Dépendance concrète utilisée pour les tests

    @Before
    public void setUp() {
        glace = new GlacePot(); // Utilisation de la classe concrète GlacePot
        caramel = new Caramel(glace);
    }

    @Test
    public void testGetDesc() {
        String expected = "Glace en pot, caramel";
        assertEquals("La description doit inclure 'caramel'", expected, caramel.getDesc());
    }

    @Test
    public void testGetPrix() {
        double expected = 1.25; // 0.25 (GlacePot) + 1.0 (Caramel)
        assertEquals("Le prix doit être 1.25", expected, caramel.getPrix(), 0.001);
    }

    @Test
    public void testGetNbBoules() {
        int expected = 1; // 0 (GlacePot) + 1 (Caramel)
        assertEquals("Le nombre de boules doit être 1", expected, caramel.getNbBoules());
    }

    @Test
    public void testGetIngredients() {
        assertTrue("Les ingrédients doivent inclure 'Lait'", caramel.getIngredients().contains("Lait"));
        assertTrue("Les ingrédients doivent inclure 'Crème'", caramel.getIngredients().contains("Crème"));
        assertTrue("Les ingrédients doivent inclure 'Fleur de sel de Guérande'", caramel.getIngredients().contains("Fleur de sel de Guérande"));
    }

    @Test
    public void testGetAllergenes() {
        assertTrue("Les allergènes doivent inclure 'Lait'", caramel.getAllergenes().contains("Lait"));
        assertTrue("Les allergènes doivent inclure 'Oeufs'", caramel.getAllergenes().contains("Oeufs"));
        assertTrue("Les allergènes doivent inclure 'Peut contenir des traces de fruits à coques'", caramel.getAllergenes().contains("Peut contenir des traces de fruits à coques"));
    }

    @Test
    public void testGetValeursEnergetiques() {
        String expected = "Énergie : 250 kcal, Matières grasses : 15 g (dont 10 g saturées), Glucides : 30 g (dont 28 g sucres), Protéines : 3 g, Sel : 0.3 g";
        assertEquals("Les valeurs énergétiques doivent correspondre", expected, caramel.getValeursEnergetiques());
    }
}
 