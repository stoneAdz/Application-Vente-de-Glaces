package glcc;

import java.util.List;

// Classe chocolat qui hérite d'Ingredient
public class Fraise extends Ingredient
{

	private static final List<String> ALLERGENES = List.of("Lait", "Oeufs"); // Pas d'allergènes spécifiques aux fraises

    // Liste fixe des ingrédients
    private static final List<String> INGREDIENTS = List.of(
        "Lait", 
        "Crème", 
        "Sucre", 
        "Jaunes d'œufs", 
        "Purée de fraises"
    );

    private String valeursEnergetiques = "Énergie : 200 kcal, Matières grasses : 12 g (dont 8 g saturées), "
	+ "Glucides : 25 g (dont 22 g sucres), Protéines : 3 g, Sel : 0.2 g";

	// Constructeur qui prend en paramètre le dessert.
	public Fraise(Glace d)
	{
		glace = d;
	}
	
	// On affiche le libellé du dessert et on rajoute le libellé de l'ingrédient chocolat.
        @Override
	public String getDesc()
	{
		return glace.getDesc() + ", fraise";
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

		// Renvoie les ingrédients spécifiques à Fraise
		public List<String> getIngredients() {
			return INGREDIENTS;
		}
	
		// Renvoie les allergènes spécifiques à Fraise
		public List<String> getAllergenes() {
			return ALLERGENES;
		}
	
		// Renvoie les valeurs énergétiques spécifiques à Fraise
		public String getValeursEnergetiques() {
			return valeursEnergetiques;
		}
}
