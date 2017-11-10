package fr.lteconsulting.formations.outils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe d'aide pour faire saisir des String et nombres à un utilisateur
 * 
 * @author Arnaud
 */
public class Saisie
{
	/**
	 * Fait saisir un texte à l'utilisateur
	 * 
	 * @param message Le message d'invite présenté à l'utilisateur
	 * @return La chaîne de caractère qu'à saisi l'utilisateur, ou null s'il n'a rien saisi.
	 */
	public static String saisie( String message )
	{
		System.out.println( message );
		System.out.print( "> " );

		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
		try
		{
			String result = reader.readLine();
			if( result != null && result.isEmpty() )
				return null;

			return result;
		}
		catch( IOException e )
		{
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Demande à l'utilisateur de saisir un nombre entre 0 et max
	 */
	public static int saisieInt( String message, int max )
	{
		while( true )
		{
			int saisie = saisieInt( message );
			if( saisie >= 0 && saisie <= max )
				return saisie;

			System.out.println( "Oula on a dit min 0 et max " + max + " !!!" );
		}
	}

	public static int saisieInt( String message )
	{
		while( true )
		{
			try
			{
				String result = saisie( message );

				return Integer.parseInt( result );
			}
			catch( Exception e )
			{
				System.out.println( "!!! Non, entrez un nombre s'il vous plait !!!" );
			}
		}
	}
}
