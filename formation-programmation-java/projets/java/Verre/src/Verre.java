
public class Verre
{
	int contenance;
	int volumeRempli;

	Verre( int contenance )
	{
		// appel du constructeur qui a deux param�tre de type int
		this( contenance, 0 );
	}

	Verre( int contenance, int volumeRempli )
	{
		this.contenance = contenance;

		ajouter( volumeRempli );
	}

	// on verse volumeVerseDansLeVerre cl dans le verre,
	// �ventuellement ca d�borde
	void ajouter( int volumeVerseDansLeVerre )
	{
		volumeRempli += volumeVerseDansLeVerre;
		if( volumeRempli > contenance )
			volumeRempli = contenance;
	}

	// on penche le verre jusqu'� avoir fait couler 'volumeQueOnVeutVider' cl
	// ou bien que le verre soit vide
	// la m�thode retourne le volume d'eau qui s'est r�ellement �chapp� du verre
	int vider( int volumeQueOnVeutVider )
	{
		if( volumeQueOnVeutVider > volumeRempli )
			volumeQueOnVeutVider = volumeRempli;

		volumeRempli -= volumeQueOnVeutVider;

		return volumeQueOnVeutVider;
	}
}
