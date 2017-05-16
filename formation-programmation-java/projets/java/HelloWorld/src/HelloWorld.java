public class HelloWorld
{
	public static void main( String[] args )
	{
		// Les variables
		
		// nom donn� � un espace m�moire, contenant une valeur
		
		// d�claration de la variable 'a' 
		// qui est de type "int" (nombre entier)
		int a;
		
		// affectation de la variable 'a' � la valeur 4
		a = 4;
		
		// d�claration + affectation
		int b = a * a;
		
		System.out.println( "La variable a vaut " + a );
		System.out.println( "La variable b vaut " + b );
		
		// les types primitifs
		
		boolean g = false; // bool�en (consomme 8 bits g�n�ralement)
		boolean h = true;
		
		byte f; // entiers sign� sur8 bits
		short d; // entiers sign� sur 16 bits
		int c; // entiers sign� sur 32 bits
		long e; // entier sign� sur 64 bits
		
		float i = 10.424f; // nombre flottant sur 32 bits (norme IEEE754)
		double j = 5.33d; // nombre flottant sur 64 bits (norme IEEE754)
		
		char k = 'a'; // repr�sente un caract�re sur 16 bits (unicode UTF-16)
		k = 'b' + 1;
		
		// Conversions entre types primitifs
		byte l = (byte) 2366;
		int m = l;
		
		System.out.println( "l vaut " + l );
		
		// Chaines de caract�res
		String n = "Bonjour";
		
		// On a le droit de concat�ner les String avec n'importe quoi d'autre
		String o = "La valeur de m est " + m + " et celle de n: " + n;
		
		System.out.println( o );
	}
}









