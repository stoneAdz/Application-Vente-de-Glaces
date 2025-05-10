package glcc;

// Classe crêpe qui hérite de dessert.
public class GlaceCornet extends Glace
{
	// Constructeur qui initialise le libellé et le prix.
	public GlaceCornet()
	{
            setNbBoules(0);
            setDesc("Glace en cornet");
            setPrix(0.75);
	}
        
        @Override
    public String getDesc() {
        return "Glace en cornet";
}

}
