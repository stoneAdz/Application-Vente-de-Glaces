package glcc;

import java.util.List;

// Classe chocolat qui hérite de Ingredient
public class Caramel extends Ingredient
{

	// Liste fixe des allergènes
    private static final List<String> ALLERGENES = List.of("Lait", "Oeufs", "Peut contenir des traces de fruits à coques");

    // Liste fixe des ingrédients
    private static final List<String> INGREDIENTS = List.of(
        "Lait", 
        "Crème", 
        "Sucre", 
        "Jaunes d'œufs", 
        "Beurre", 
        "Fleur de sel de Guérande"
    );

	private String valeursEnergetiques = "Énergie : 250 kcal, Matières grasses : 15 g (dont 10 g saturées), "
	+ "Glucides : 30 g (dont 28 g sucres), Protéines : 3 g, Sel : 0.3 g";

	// Constructeur qui prend en paramètre le dessert.
	public Caramel(Glace d)
	{
		glace = d;
	}
	
	// On affiche le libellé du dessert et on rajoute le libellé de l'ingrédient chocolat.
        @Override
	public String getDesc()
	{
		return glace.getDesc() + ", caramel";
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

		// Renvoie les ingrédients spécifiques à Caramel
		public List<String> getIngredients() {
			return INGREDIENTS;
		}
	
		// Renvoie les allergènes spécifiques à Caramel
		public List<String> getAllergenes() {
			return ALLERGENES;
		}
	
		// Renvoie les valeurs énergétiques spécifiques à Caramel
		public String getValeursEnergetiques() {
			return valeursEnergetiques;
		}
}
