import glcc.Chocolat;
import glcc.Glace;
import glcc.GlaceCornet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChocolatTest {

    private Chocolat chocolat;
    private Glace glace; // Dépendance concrète utilisée pour les tests

    @Before
    public void setUp() {
        glace = new GlaceCornet(); // Utilisation de la classe concrète GlaceCornet
        chocolat = new Chocolat(glace);
    }

    @Test
    public void testGetDesc() {
        String expected = "Glace en cornet, chocolat";
        assertEquals("La description doit inclure 'chocolat'", expected, chocolat.getDesc());
    }

    @Test
    public void testGetPrix() {
        double expected = 2.05; // 0.75 (GlaceCornet) + 1.3 (Chocolat)
        assertEquals("Le prix doit être 2.05", expected, chocolat.getPrix(), 0.001);
    }

    @Test
    public void testGetNbBoules() {
        int expected = 1; // 0 (GlaceCornet) + 1 (Chocolat)
        assertEquals("Le nombre de boules doit être 1", expected, chocolat.getNbBoules());
    }

    @Test
    public void testGetIngredients() {
        assertTrue("Les ingrédients doivent inclure 'Lait'", chocolat.getIngredients().contains("Lait"));
        assertTrue("Les ingrédients doivent inclure 'Crème'", chocolat.getIngredients().contains("Crème"));
        assertTrue("Les ingrédients doivent inclure 'Chocolat noir'", chocolat.getIngredients().contains("Chocolat noir"));
    }

    @Test
    public void testGetAllergenes() {
        assertTrue("Les allergènes doivent inclure 'Lait'", chocolat.getAllergenes().contains("Lait"));
        assertTrue("Les allergènes doivent inclure 'Œufs'", chocolat.getAllergenes().contains("Œufs"));
    }

    @Test
    public void testGetValeursEnergetiques() {
        String expected = "Énergie : 240 kcal, Matières grasses : 16 g (dont 11 g saturées), Glucides : 25 g (dont 20 g sucres), Protéines : 4 g, Sel : 0.2 g";
        assertEquals("Les valeurs énergétiques doivent correspondre", expected, chocolat.getValeursEnergetiques());
    }
}
