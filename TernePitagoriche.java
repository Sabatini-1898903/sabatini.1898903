package slidepart3;

public class TernePitagoriche {

	public void Stampa(int n)
	{
		
		for (double a = 1; a <= n; a++) 
		{
			
			for (double b = a; b <= n; b++) 
			{
				
				for (double c = b; c <= n; c++) {
					
					if ((Math.pow(a, 2) + Math.pow(b,2)) == Math.pow(c, 2))
					{
						System.out.println("a="+Math.round(a)+" b="+Math.round(b)+" c="+Math.round(c));
					}
					
				}
			}
		}
		
	}
	public static void main(String[] args) {
		TernePitagoriche terne = new TernePitagoriche();
		terne.Stampa(15);
	}
}
