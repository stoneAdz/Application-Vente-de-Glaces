package glcc;

import java.util.List;

public class NappageCaramel extends Ingredient {
    // Liste fixe des allergènes
    private static final List<String> ALLERGENES = List.of("Lait");

    // Liste fixe des ingrédients
    private static final List<String> INGREDIENTS = List.of(
        "Sucre", 
        "Beurre", 
        "Crème fraîche", 
        "Fleur de sel"
    );

    private String valeursEnergetiques = "Énergie : 140 kcal, Matières grasses : 6 g (dont 4 g saturées), "
    + "Glucides : 20 g (dont 18 g sucres), Protéines : 0.5 g, Sel : 0.3 g";

    public NappageCaramel(Glace d) {
        glace = d;
    }

    @Override
    public String getDesc() {
        return glace.getDesc() + ", avec un nappage caramel";
    }

    @Override
    public double getPrix() {
        return glace.getPrix() + 0.80; // Prix additionnel pour le nappage caramel
    }

    // Renvoie les ingrédients spécifiques au nappage caramel
    public List<String> getIngredients() {
        return INGREDIENTS;
    }

    // Renvoie les allergènes spécifiques au nappage caramel
    public List<String> getAllergenes() {
        return ALLERGENES;
    }

    // Renvoie les valeurs énergétiques spécifiques au nappage caramel
    public String getValeursEnergetiques() {
        return valeursEnergetiques;
    }
}
