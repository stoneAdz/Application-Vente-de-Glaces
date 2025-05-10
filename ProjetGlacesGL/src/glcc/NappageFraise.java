package glcc;

import java.util.List;

public class NappageFraise extends Ingredient {
    // Liste fixe des allergènes
    private static final List<String> ALLERGENES = List.of("Aucun");

    // Liste fixe des ingrédients
    private static final List<String> INGREDIENTS = List.of(
        "Purée de fraises", 
        "Sucre", 
        "Eau", 
        "Jus de citron"
    );

    private String valeursEnergetiques = "Énergie : 90 kcal, Matières grasses : 0 g, "
                + "Glucides : 22 g (dont 20 g sucres), Protéines : 0.5 g, Sel : 0 g";

    public NappageFraise(Glace d) {
        glace = d;
    }

    @Override
    public String getDesc() {
        return glace.getDesc() + ", avec un nappage fraise";
    }

    @Override
    public double getPrix() {
        return glace.getPrix() + 0.70; // Prix additionnel pour le nappage fraise
    }

    // Renvoie les ingrédients spécifiques au nappage fraise
    public List<String> getIngredients() {
        return INGREDIENTS;
    }

    // Renvoie les allergènes spécifiques au nappage fraise
    public List<String> getAllergenes() {
        return ALLERGENES;
    }

    // Renvoie les valeurs énergétiques spécifiques au nappage fraise
    public String getValeursEnergetiques() {
        return valeursEnergetiques;
    }
}
