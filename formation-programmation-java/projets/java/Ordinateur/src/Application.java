
public class Application
{
	public static void main( String[] args )
	{
		Ordinateur o = new Ordinateur(
				"Toto-43",
				128,
				new int[] { 40, 123, 2525, 334, 4444, 250, 250 } );
		o.allumer();

		/*
		 * ca doit afficher
		 * 
		 * Ordinateur d�marre
		 * Initialisation m�moire
		 * D�marrage DisqueDur de capacit� 40
		 * D�marrage DisqueDur de capacit� 250
		 * D�marrage DisqueDur de capacit� 250
		 * Lecture DisqueDur
		 * 
		 */

		o.eteindre();

		/*
		 * ca doit afficher
		 * 
		 * Extinction DisqueDur de capacit� 250
		 * Extinction DisqueDur de capacit� 250
		 * Extinction DisqueDur de capacit� 40
		 * Extinction MemoireVive
		 * L'ordinateur est �teint
		 * 
		 */
	}
}
