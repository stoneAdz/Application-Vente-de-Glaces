package glcc;

// Classe gaufre qui hérite de dessert
public class GlacePot extends Glace
{
	// Constructeur qui intialise le libellé et le prix.
	public GlacePot()
	{
            setNbBoules(0);
            setDesc("Glace en pot");
            setPrix(0.25);
	}
        
        @Override
    public String getDesc() {
        return "Glace en pot";
}

}
