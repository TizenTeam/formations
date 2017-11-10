package fr.lteconsulting.commandes;

import fr.lteconsulting.Commande;
import fr.lteconsulting.ContexteCommande;
import fr.lteconsulting.Produit;
import fr.lteconsulting.Saisie;

public class RechercheProduit implements Commande
{
	@Override
	public String getTitre()
	{
		return "Recherche de produit par r�f�rence";
	}

	@Override
	public void executer( ContexteCommande contexte )
	{
		int referenceRecherchee = Saisie.saisieInt( "Quelle r�f�rence cherchez-vous ?" );
		Produit produit = contexte.getEntrepot().rechercheParReference( referenceRecherchee );
		if( produit == null )
		{
			System.out.println( "Produit introuvable" );
		}
		else
		{
			System.out.println( "Produit trouv�, voici sa description" );
			produit.afficher();
		}
	}
}
