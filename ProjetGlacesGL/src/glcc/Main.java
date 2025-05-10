package glcc;

// Classe principale de l'application.
public class Main 
{

	public static void main(String[] args) 
	{
		// Création et affichage d'une glace en pot vanille, vanille
		Glace p1 = new GlacePot();
		p1 = new Vanille(p1);
        p1 = new Vanille(p1);
		System.out.println(p1);

        // Création et affichage d'une glace en cornet vanille, fraise, café avec nappage caramel 
		Glace c1 = new GlaceCornet();
		c1 = new Vanille(c1);
		c1 = new Fraise(c1);
		c1 = new Caramel(c1);
		c1 = new NappageCaramel(c1);
		System.out.println(c1);		
                
		// Création et affichage d'une glace en cornet café avec chantilly 
		Glace c2 = new GlaceCornet();
		c2 = new Caramel(c2);
		c2 = new Chantilly(c2);
		System.out.println(c2);
                
        //test glace sans boule : interdit
        Glace c3 = new GlaceCornet();
		c3 = new Chantilly(c3);
		System.out.println(c3);
                
        Glace c4 = new GlaceCornet();
		System.out.println(c4);
                
        //test glace avec 5 boules : interdit
        Glace c5 = new GlaceCornet();
		c5 = new Caramel(c5);
        c5 = new Caramel(c5);
        c5 = new Vanille(c5);
        c5 = new Fraise(c5);
        c5 = new Fraise(c5);
		System.out.println(c5);
	}
}
