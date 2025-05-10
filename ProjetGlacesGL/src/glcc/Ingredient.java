package glcc;

import java.util.List;

public abstract class Ingredient extends Glace {

    protected Glace glace; // La glace associée à l'ingrédient

    // Méthode pour obtenir la description complète
    @Override
    public abstract String getDesc();

    // Méthode pour obtenir les ingrédients spécifiques
    public abstract List<String> getIngredients();

    // Méthode pour obtenir les allergènes spécifiques
    public abstract List<String> getAllergenes();

    // Méthode pour obtenir les valeurs énergétiques spécifiques
    public abstract String getValeursEnergetiques();

    @Override
    public abstract double getPrix();
}
