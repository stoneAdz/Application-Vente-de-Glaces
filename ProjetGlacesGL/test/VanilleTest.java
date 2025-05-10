import glcc.Vanille;
import glcc.Glace;
import glcc.GlacePot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VanilleTest {

    private Vanille vanille;
    private Glace glace; // Dépendance concrète utilisée pour les tests

    @Before
    public void setUp() {
        glace = new GlacePot(); // Utilisation de la classe concrète GlacePot
        vanille = new Vanille(glace);
    }

    @Test
    public void testGetDesc() {
        String expected = "Glace en pot, vanille";
        assertEquals("La description doit inclure 'vanille'", expected, vanille.getDesc());
    }

    @Test
    public void testGetPrix() {
        double expected = 1.25; // 0.25 (GlacePot) + 1.0 (Vanille)
        assertEquals("Le prix doit être 1.25", expected, vanille.getPrix(), 0.001);
    }

    @Test
    public void testGetNbBoules() {
        int expected = 1; // 0 (GlacePot) + 1 (Vanille)
        assertEquals("Le nombre de boules doit être 1", expected, vanille.getNbBoules());
    }

    @Test
    public void testGetIngredients() {
        assertTrue("Les ingrédients doivent inclure 'Lait'", vanille.getIngredients().contains("Lait"));
        assertTrue("Les ingrédients doivent inclure 'Crème'", vanille.getIngredients().contains("Crème"));
        assertTrue("Les ingrédients doivent inclure 'Extrait de vanille'", vanille.getIngredients().contains("Extrait de vanille"));
        assertTrue("Les ingrédients doivent inclure 'Sucre'", vanille.getIngredients().contains("Sucre"));
    }

    @Test
    public void testGetAllergenes() {
        assertTrue("Les allergènes doivent inclure 'Lait'", vanille.getAllergenes().contains("Lait"));
        assertTrue("Les allergènes doivent inclure 'Œufs'", vanille.getAllergenes().contains("Œufs"));
    }

    @Test
    public void testGetValeursEnergetiques() {
        String expected = "Énergie : 220 kcal, Matières grasses : 14 g (dont 9 g saturées), Glucides : 24 g (dont 22 g sucres), Protéines : 4 g, Sel : 0.1 g";
        assertEquals("Les valeurs énergétiques doivent correspondre", expected, vanille.getValeursEnergetiques());
    }
}
