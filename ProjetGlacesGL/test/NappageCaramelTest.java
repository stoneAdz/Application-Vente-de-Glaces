import glcc.NappageCaramel;
import glcc.Glace;
import glcc.GlaceCornet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NappageCaramelTest {

    private NappageCaramel nappageCaramel;
    private Glace glace; // Dépendance concrète utilisée pour les tests

    @Before
    public void setUp() {
        glace = new GlaceCornet(); // Utilisation de la classe concrète GlaceCornet
        nappageCaramel = new NappageCaramel(glace);
    }

    @Test
    public void testGetDesc() {
        String expected = "Glace en cornet, avec un nappage caramel";
        assertEquals("La description doit inclure 'nappage caramel'", expected, nappageCaramel.getDesc());
    }

    @Test
    public void testGetPrix() {
        double expected = 1.55; // 0.75 (GlaceCornet) + 0.80 (NappageCaramel)
        assertEquals("Le prix doit être 1.55", expected, nappageCaramel.getPrix(), 0.001);
    }

    @Test
    public void testGetIngredients() {
        assertTrue("Les ingrédients doivent inclure 'Sucre'", nappageCaramel.getIngredients().contains("Sucre"));
        assertTrue("Les ingrédients doivent inclure 'Beurre'", nappageCaramel.getIngredients().contains("Beurre"));
        assertTrue("Les ingrédients doivent inclure 'Crème fraîche'", nappageCaramel.getIngredients().contains("Crème fraîche"));
        assertTrue("Les ingrédients doivent inclure 'Fleur de sel'", nappageCaramel.getIngredients().contains("Fleur de sel"));
    }

    @Test
    public void testGetAllergenes() {
        assertTrue("Les allergènes doivent inclure 'Lait'", nappageCaramel.getAllergenes().contains("Lait"));
    }

    @Test
    public void testGetValeursEnergetiques() {
        String expected = "Énergie : 140 kcal, Matières grasses : 6 g (dont 4 g saturées), Glucides : 20 g (dont 18 g sucres), Protéines : 0.5 g, Sel : 0.3 g";
        assertEquals("Les valeurs énergétiques doivent correspondre", expected, nappageCaramel.getValeursEnergetiques());
    }
}
