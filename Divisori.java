package slidepart3;

public class Divisori {
	public void StampaDivisori(int numero)
	{
		String divisori = "";
		for (int i = 1; i < numero/2; i++) 
		{
			if (numero % i==0)
			{
				divisori += i + ",";
			}
		}
		divisori += numero/2;
		System.out.print(divisori);
				
	}
	public static void main(String[] args)
	{
		Divisori divisori1 = new Divisori();
		divisori1.StampaDivisori(30);
		
	}

}
