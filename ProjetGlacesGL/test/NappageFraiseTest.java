import glcc.NappageFraise;
import glcc.Glace;
import glcc.GlacePot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NappageFraiseTest {

    private NappageFraise nappageFraise;
    private Glace glace; // Dépendance concrète utilisée pour les tests

    @Before
    public void setUp() {
        glace = new GlacePot(); // Utilisation de la classe concrète GlacePot
        nappageFraise = new NappageFraise(glace);
    }

    @Test
    public void testGetDesc() {
        String expected = "Glace en pot, avec un nappage fraise";
        assertEquals("La description doit inclure 'nappage fraise'", expected, nappageFraise.getDesc());
    }

    @Test
    public void testGetPrix() {
        double expected = 0.95; // 0.25 (GlacePot) + 0.70 (NappageFraise)
        assertEquals("Le prix doit être 0.95", expected, nappageFraise.getPrix(), 0.001);
    }

    @Test
    public void testGetIngredients() {
        assertTrue("Les ingrédients doivent inclure 'Purée de fraises'", nappageFraise.getIngredients().contains("Purée de fraises"));
        assertTrue("Les ingrédients doivent inclure 'Sucre'", nappageFraise.getIngredients().contains("Sucre"));
        assertTrue("Les ingrédients doivent inclure 'Eau'", nappageFraise.getIngredients().contains("Eau"));
        assertTrue("Les ingrédients doivent inclure 'Jus de citron'", nappageFraise.getIngredients().contains("Jus de citron"));
    }

    @Test
    public void testGetAllergenes() {
        assertTrue("Les allergènes doivent inclure 'Aucun'", nappageFraise.getAllergenes().contains("Aucun"));
    }

    @Test
    public void testGetValeursEnergetiques() {
        String expected = "Énergie : 90 kcal, Matières grasses : 0 g, Glucides : 22 g (dont 20 g sucres), Protéines : 0.5 g, Sel : 0 g";
        assertEquals("Les valeurs énergétiques doivent correspondre", expected, nappageFraise.getValeursEnergetiques());
    }
}
