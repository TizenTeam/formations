
public class DisqueDur
{
	int capacite;

	DisqueDur( int capacite )
	{
		this.capacite = capacite;
	}

	void demarrer()
	{
		System.out.println( "D�marrage DisqueDur de capacit� " + capacite );
	}

	void lire()
	{
		System.out.println( "Lecture DisqueDur de capacit� " + capacite );
	}

	void eteindre()
	{
		System.out.println( "Extinction DisqueDur de capacit� " + capacite );
	}
}
