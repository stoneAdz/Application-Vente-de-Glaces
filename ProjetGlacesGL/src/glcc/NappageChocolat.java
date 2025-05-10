package glcc;

import java.util.List;

public class NappageChocolat extends Ingredient {
    // Liste fixe des allergènes
    private static final List<String> ALLERGENES = List.of("Lait");

    // Liste fixe des ingrédients
    private static final List<String> INGREDIENTS = List.of(
        "Chocolat noir", 
        "Sucre", 
        "Beurre de cacao", 
        "Lait"
    );

    private String valeursEnergetiques = "Énergie : 120 kcal, Matières grasses : 8 g (dont 5 g saturées), "
	+ "Glucides : 10 g (dont 8 g sucres), Protéines : 2 g, Sel : 0.02 g";

    public NappageChocolat(Glace d) {
        glace = d;
    }

    @Override
    public String getDesc() {
        return glace.getDesc() + ", avec un nappage chocolat";
    }

    @Override
    public double getPrix() {
        return glace.getPrix() + 0.75; // Prix additionnel pour le nappage chocolat
    }

    // Renvoie les ingrédients spécifiques au nappage chocolat
    public List<String> getIngredients() {
        return INGREDIENTS;
    }

    // Renvoie les allergènes spécifiques au nappage chocolat
    public List<String> getAllergenes() {
        return ALLERGENES;
    }

    // Renvoie les valeurs énergétiques spécifiques au nappage chocolat
    public String getValeursEnergetiques() {
        return valeursEnergetiques;
    }
}
