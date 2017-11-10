package fr.lteconsulting.training;

public class DisqueDur
{
	private int capacite;

	public DisqueDur( int capacite )
	{
		this.capacite = capacite;
	}

	public void demarrer()
	{
		System.out.println( "D�marrage disque dur " + capacite + " Go" );
	}

	public void lecture()
	{
		System.out.println( "Lecture sur disque " + capacite + " Go" );
	}

	public void eteindre()
	{
		System.out.println( "Extinction disque dur " + capacite + " Go" );
	}
}
