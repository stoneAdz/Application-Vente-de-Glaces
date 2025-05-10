package glcc;

import java.util.List;

public class Pistache extends Ingredient {
    // Liste fixe des allergènes
    private static final List<String> ALLERGENES = List.of("Lait", "Œufs", "Fruits à coque");

    // Liste fixe des ingrédients
    private static final List<String> INGREDIENTS = List.of(
        "Lait", 
        "Crème", 
        "Sucre", 
        "Jaunes d'œufs", 
        "Pistaches"
    );

    private String valeursEnergetiques = "Énergie : 230 kcal, Matières grasses : 15 g (dont 10 g saturées), "
    + "Glucides : 20 g (dont 18 g sucres), Protéines : 5 g, Sel : 0.1 g";

    public Pistache(Glace d) {
        glace = d;
    }

    @Override
    public String getDesc() {
        return glace.getDesc() + ", pistache";
    }

    @Override
    public double getPrix() {
        return glace.getPrix() + 1.5; // Exemple de prix
    }

    @Override
    public int getNbBoules() {
        return glace.getNbBoules() + 1;
    }

    // Renvoie les ingrédients spécifiques à Pistache
    public List<String> getIngredients() {
        return INGREDIENTS;
    }

    // Renvoie les allergènes spécifiques à Pistache
    public List<String> getAllergenes() {
        return ALLERGENES;
    }

    // Renvoie les valeurs énergétiques spécifiques à Pistache
    public String getValeursEnergetiques() {
        return valeursEnergetiques;
    }
}
