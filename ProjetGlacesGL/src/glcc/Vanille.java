package glcc;

import java.util.List;

// Classe chocolat qui hérite de decorateurIngredient et donc indirectement de dessert.
public class Vanille extends Ingredient
{

	 // Liste fixe des allergènes
	 private static final List<String> ALLERGENES = List.of("Lait", "Œufs");

	 // Liste fixe des ingrédients
	 private static final List<String> INGREDIENTS = List.of(
		 "Lait", 
		 "Crème", 
		 "Sucre", 
		 "Jaunes d'œufs", 
		 "Extrait de vanille"
	 );
 
	 private String valeursEnergetiques = "Énergie : 220 kcal, Matières grasses : 14 g (dont 9 g saturées), "
	 + "Glucides : 24 g (dont 22 g sucres), Protéines : 4 g, Sel : 0.1 g";


	// Constructeur qui prend en paramètre le dessert.
	public Vanille(Glace d)
	{
                glace = d;
	}
	
	// On affiche le libellé du dessert et on rajoute le libellé de l'ingrédient chocolat.
        @Override
	public String getDesc()
	{
		return glace.getDesc() + ", vanille";
	}
	
	// On additionne le prix du dessert et le prix de l'ingrédient chocolat.
        @Override
	public double getPrix()
	{
		return glace.getPrix() + 1 ;
	}

        @Override
        public int getNbBoules() {
            return glace.getNbBoules() + 1;
        }
// Renvoie les ingrédients spécifiques à Vanille
    public List<String> getIngredients() {
        return INGREDIENTS;
    }

    // Renvoie les allergènes spécifiques à Vanille
    public List<String> getAllergenes() {
        return ALLERGENES;
    }

    // Renvoie les valeurs énergétiques spécifiques à Vanille
    public String getValeursEnergetiques() {
        return valeursEnergetiques;
    }

}
