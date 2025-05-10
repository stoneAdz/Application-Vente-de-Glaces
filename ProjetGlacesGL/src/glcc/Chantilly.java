package glcc;

import java.util.List;

public class Chantilly extends Ingredient {
    // Liste fixe des allergènes
    private static final List<String> ALLERGENES = List.of("Lait");

    // Liste fixe des ingrédients
    private static final List<String> INGREDIENTS = List.of(
        "Crème", 
        "Sucre", 
        "Extrait de vanille"
    );

    private String valeursEnergetiques = "Énergie : 110 kcal, Matières grasses : 10 g (dont 7 g saturées), "
	+ "Glucides : 5 g (dont 5 g sucres), Protéines : 1 g, Sel : 0.05 g";

    public Chantilly(Glace d) {
        glace = d;
    }

    @Override
    public String getDesc() {
        return glace.getDesc() + ", chantilly";
    }

    @Override
    public double getPrix() {
        return glace.getPrix() + 0.50; // Prix additionnel pour la chantilly
    }

    // Renvoie les ingrédients spécifiques à Chantilly
    public List<String> getIngredients() {
        return INGREDIENTS;
    }

    // Renvoie les allergènes spécifiques à Chantilly
    public List<String> getAllergenes() {
        return ALLERGENES;
    }

    // Renvoie les valeurs énergétiques spécifiques à Chantilly
    public String getValeursEnergetiques() {
        return valeursEnergetiques;
    }
}
