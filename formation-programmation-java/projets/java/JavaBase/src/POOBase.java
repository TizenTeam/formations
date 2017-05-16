
public class POOBase
{
	/**
	 * Notre programme principal
	 */
	public static void main( String[] args )
	{
		// CREER UNN OBJET Personne
		// c-a-d : avoir une zone m�moire
		// avec la valeur de chaque attribut
		// de l'objet que l'on veut cr�er...

		// avec l'op�rateur 'new'

		// d�claration d'une variable de type Personne
		Personne p; // p vaut null

		p = new Personne();
		p.afficheNomComplet();

		// affectation de la variable 'p' � une r�f�rence
		// vers un nouvel objet de la classe Personne
		p = new Personne( "Toto", "Titi", 33000 );

		// appeler la m�thode 'affichePersonne' sur l'objet r�f�renc�
		// par la variable 'p'
		p.afficheNomComplet();
		
		p.affichePersonne();
		
		System.out.println( "Le code postal de l'objet r�f�renc� par p est " + p.getCodePostal() );

		// p ne r�f�rence plus aucun objet
//		p = null;
//		p.afficheNomComplet();
	}
}
