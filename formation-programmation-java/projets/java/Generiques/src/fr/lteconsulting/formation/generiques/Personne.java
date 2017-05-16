package fr.lteconsulting.formation.generiques;

/**
 * Repr�sente non pas UNE personne mais TOUTES les personnes.
 */
public class Personne
{
	// Les attributs
	String nom;
	String prenom;
	int codePostal;

	// le constructeur par d�faut
	// g�n�r� automatiquement par Java
	// si vous n'�crivez pas de constructeur explicitement
	Personne()
	{
	}

	// Un constructeur.
	// si j'�cit new Personne( "toto", "titi" )
	// -> une zone m�moire est allou�e pour contenir les donn�es du nouvel objet
	// -> le constructeur est appel� pour initialiser l'objet
	Personne( String nom, String prenom, int codePostal )
	{
		this.nom = nom;
		this.prenom = prenom;
		this.codePostal = codePostal;
	}

	// en Java on appelle �a un 'getter' ('accesseur')
	int getCodePostal()
	{
		return codePostal;
	}

	// retourne el nom complet : NOM ' ' PRENOM
	String getNomComplet()
	{
		return nom + " " + prenom;
	}

	// Les m�thodes, c-a-d le code qui manipule les attributs
	void demenage( int nouveauCodePostal )
	{
		// on modifie l'attribut 'codePostal'
		codePostal = nouveauCodePostal;
	}

	void affichePersonne()
	{
		System.out.println( getNomComplet() + "\n" + codePostal );
	}

	void afficheNomComplet()
	{
		System.out.println( getNomComplet() );
	}
}
