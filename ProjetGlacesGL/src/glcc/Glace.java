package glcc;
// Pour arrondir l'affichage du prix.
import java.text.NumberFormat;

// Classe abstraite dessert.
public abstract class Glace 
{
	protected String desc; // description de la glace 
	protected double prix;    // prix de la glace
    protected int nbBoules;
	
	// Accesseurs en lecture pour le libellé et le prix.
	public String getDesc() 
	{
		return desc;
	}
	public double getPrix() 
	{
		return prix;
	}
	public int getNbBoules() {
		return nbBoules;
	}
	
	// Accesseurs en écriture pour le libellé et le prix.
	protected void setDesc(String libelle) 
	{
		this.desc = libelle;
	}
        protected void setPrix(double prix) 
	{
		this.prix = prix;
	}
	public void setNbBoules(int countBoules) {
		this.nbBoules = countBoules;
	}
	
	// Méthode utilisée pour l'affichage d'un dessert.
    @Override
    public String toString() {
        NumberFormat format = NumberFormat.getInstance();
        format.setMinimumFractionDigits(2); // 2 chiffres après la virgule

        if (getNbBoules() > 0 && getNbBoules() <= 4) {
            return getDesc() + " : " + format.format(getPrix()) + "€";
        } else if (getNbBoules() == 0) {
            return "Glace non terminée (aucune boule ajoutée).";
        } else {
            return "Glace invalide (plus de 4 boules).";
        }
    }
    }
