import glcc.NappageChocolat;
import glcc.Glace;
import glcc.GlacePot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NappageChocolatTest {

    private NappageChocolat nappageChocolat;
    private Glace glace; // Dépendance concrète utilisée pour les tests

    @Before
    public void setUp() {
        glace = new GlacePot(); // Utilisation de la classe concrète GlacePot
        nappageChocolat = new NappageChocolat(glace);
    }

    @Test
    public void testGetDesc() {
        String expected = "Glace en pot, avec un nappage chocolat";
        assertEquals("La description doit inclure 'nappage chocolat'", expected, nappageChocolat.getDesc());
    }

    @Test
    public void testGetPrix() {
        double expected = 1.00; // 0.25 (GlacePot) + 0.75 (NappageChocolat)
        assertEquals("Le prix doit être 1.00", expected, nappageChocolat.getPrix(), 0.001);
    }

    @Test
    public void testGetIngredients() {
        assertTrue("Les ingrédients doivent inclure 'Chocolat noir'", nappageChocolat.getIngredients().contains("Chocolat noir"));
        assertTrue("Les ingrédients doivent inclure 'Sucre'", nappageChocolat.getIngredients().contains("Sucre"));
        assertTrue("Les ingrédients doivent inclure 'Beurre de cacao'", nappageChocolat.getIngredients().contains("Beurre de cacao"));
        assertTrue("Les ingrédients doivent inclure 'Lait'", nappageChocolat.getIngredients().contains("Lait"));
    }

    @Test
    public void testGetAllergenes() {
        assertTrue("Les allergènes doivent inclure 'Lait'", nappageChocolat.getAllergenes().contains("Lait"));
    }

    @Test
    public void testGetValeursEnergetiques() {
        String expected = "Énergie : 120 kcal, Matières grasses : 8 g (dont 5 g saturées), Glucides : 10 g (dont 8 g sucres), Protéines : 2 g, Sel : 0.02 g";
        assertEquals("Les valeurs énergétiques doivent correspondre", expected, nappageChocolat.getValeursEnergetiques());
    }
}
