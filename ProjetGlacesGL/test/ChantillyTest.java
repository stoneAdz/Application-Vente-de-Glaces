import glcc.Chantilly;
import glcc.Glace;
import glcc.GlaceCornet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChantillyTest {

    private Chantilly chantilly;
    private Glace glace; // Dépendance concrète utilisée pour les tests

    @Before
    public void setUp() {
        glace = new GlaceCornet(); // Utilisation de la classe concrète GlaceCornet
        chantilly = new Chantilly(glace);
    }

    @Test
    public void testGetDesc() {
        String expected = "Glace en cornet, chantilly";
        assertEquals("La description doit inclure 'chantilly'", expected, chantilly.getDesc());
    }

    @Test
    public void testGetPrix() {
        double expected = 1.25; // 0.75 (GlaceCornet) + 0.50 (Chantilly)
        assertEquals("Le prix doit être 1.25", expected, chantilly.getPrix(), 0.001);
    }

    @Test
    public void testGetIngredients() {
        assertTrue("Les ingrédients doivent inclure 'Crème'", chantilly.getIngredients().contains("Crème"));
        assertTrue("Les ingrédients doivent inclure 'Sucre'", chantilly.getIngredients().contains("Sucre"));
        assertTrue("Les ingrédients doivent inclure 'Extrait de vanille'", chantilly.getIngredients().contains("Extrait de vanille"));
    }

    @Test
    public void testGetAllergenes() {
        assertTrue("Les allergènes doivent inclure 'Lait'", chantilly.getAllergenes().contains("Lait"));
    }

    @Test
    public void testGetValeursEnergetiques() {
        String expected = "Énergie : 110 kcal, Matières grasses : 10 g (dont 7 g saturées), Glucides : 5 g (dont 5 g sucres), Protéines : 1 g, Sel : 0.05 g";
        assertEquals("Les valeurs énergétiques doivent correspondre", expected, chantilly.getValeursEnergetiques());
    }
}
