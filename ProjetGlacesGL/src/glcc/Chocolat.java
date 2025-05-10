package glcc;

import java.util.List;

public class Chocolat extends Ingredient {
    // Liste fixe des allergènes
    private static final List<String> ALLERGENES = List.of("Lait", "Œufs");

    // Liste fixe des ingrédients
    private static final List<String> INGREDIENTS = List.of(
        "Lait", 
        "Crème", 
        "Sucre", 
        "Jaunes d'œufs", 
        "Cacao en poudre", 
        "Chocolat noir"
    );

    private String valeursEnergetiques = "Énergie : 240 kcal, Matières grasses : 16 g (dont 11 g saturées), "
    + "Glucides : 25 g (dont 20 g sucres), Protéines : 4 g, Sel : 0.2 g";

    public Chocolat(Glace d) {
        glace = d;
    }

    @Override
    public String getDesc() {
        return glace.getDesc() + ", chocolat";
    }

    @Override
    public double getPrix() {
        return glace.getPrix() + 1.3; // Exemple de prix
    }

    @Override
    public int getNbBoules() {
        return glace.getNbBoules() + 1;
    }

    // Renvoie les ingrédients spécifiques à Chocolat
    public List<String> getIngredients() {
        return INGREDIENTS;
    }

    // Renvoie les allergènes spécifiques à Chocolat
    public List<String> getAllergenes() {
        return ALLERGENES;
    }

    // Renvoie les valeurs énergétiques spécifiques à Chocolat
    public String getValeursEnergetiques() {
        return valeursEnergetiques;
    }
}
