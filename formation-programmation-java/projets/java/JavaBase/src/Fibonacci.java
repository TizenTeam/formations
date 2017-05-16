
/**
 * Remarques :
 * 
 * on utilise les long et pas les int car on d�passe rapidement la capacit� des int !
 * 
 * on ne calcule que les 30 premiers termes car c'est tr�s long !
 *
 */
public class Fibonacci
{
	public static void main( String[] args )
	{
		for( int i = 1; i <= 100; i++ )
		{
			System.out.println( "Le " + i + "�me terme de la s�rie de Fibonacci vaut " + fibonacci( i ) );
		}
		
		int a = 0;

		int[] t;

		t = new int[] { 3, 4, a };
	}

	// calcul du n-i�me terme de la suite de fibonacci
	static long fibonacci( long n )
	{
		/*
		 * D�finition de la suite de Fibonacci:
		 * 
		 * - F(0) : 0
		 * - F(1) : 1
		 * - F(n) : F(n-1) + F(n-2)
		 */

		// cas terminaux
		if( n == 0 )
			return 0;
		else if( n == 1 )
			return 1;

		// cas g�n�ral
		return fibonacci( n - 1 ) + fibonacci( n - 2 );
	}
}
