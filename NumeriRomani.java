package slidepart3;

public class NumeriRomani {
	
	
	public void Converti(String stringa)
	{
		int risultato = 0;
		byte x = 0;
		
		for (int i = stringa.length() - 1; i >= 0; i--) 
		{
			switch (stringa.charAt(i))
			{
			case 'I':
				if (x <= 0) 
				{risultato += 1;}
				else
				{
					risultato -= 1;
				}
				x = 0;
				break;
				
			case 'V':
				if (x <= 1)
				{
					risultato += 5;
				}
				else
				{
					risultato -= 5; 
				}
				x = 1;
				break;
			
			case 'X':
				if (x <= 2)
				{
					risultato += 10;
				}
				else
				{
					risultato -= 10; 
				}
				x = 2;
				break;
			
			case 'L':
				if (x <= 3)
				{
					risultato += 50;
				}
				else
				{
					risultato -= 50; 
				}
				x = 3;
				break;
			
			case 'C':
				if (x <= 4)
				{
					risultato += 100;
				}
				else
				{
					risultato -= 100; 
				}
				x = 4;
				break;
			
			case 'D':
				if (x <= 4)
				{
					risultato += 500;
				}
				else
				{
					risultato -= 500;
				}
				x = 4;
				break;
			
			case 'M':
				if (x <= 5)
				{
					risultato += 1000;
				}
				else
				{
					risultato -= 1000;
				}
				x = 5;
				break;
			
				
			}
					
				
		}
		System.out.print("Il risultato è: "+ risultato);
	}
public static void main(String[] args) 
{
	NumeriRomani numeriromani = new NumeriRomani();
	numeriromani.Converti("MMXIX");
}
}
