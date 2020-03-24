package slidepart3;

public class Cornice {
	public void Stampa(int n,String stringa)
	{	int g = 0;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				
				if (i == 0 || i == n-1) 
				{
					System.out.print("*");
					
				}
				else if (j == 0 || j == n-1)
				{	
					 System.out.print("*");
					 
				}
				else if (g < stringa.length())
				{
					System.out.print(stringa.charAt(g));
					g++;
				}
				else {System.out.print(" ");}
				
				
				
				
				
				
			}
		System.out.println();
		}
	
		
	}
	
				
				
					
	
				
				
				
				
				
				
		
	
	public static void main(String[] args)
	{
		Cornice cornice = new Cornice();
		cornice.Stampa(10,"Cornice in Java");
		
		
		
	}

}
