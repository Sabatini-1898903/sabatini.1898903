package slidepart3;

public class StringheVerticali {
	public void StampaStringheVerticali(String stringa1 ,String stringa2 ,String stringa3) 
	{
		int maxlng = Math.max(Math.max(stringa1.length(), stringa2.length()),stringa3.length());
		
		
		for (int i = 0; i < maxlng; i++) 
		{
			if (i < stringa1.length())
			{
				System.out.print(stringa1.charAt(i));
			}
			else
			{
				System.out.print(" ");
			}
			
			
			if  (i < stringa2.length())
			{
				System.out.print(stringa2.charAt(i));
			}
			else
			{
				System.out.print(" ");
			}
			if (i < stringa3.length())
			{
				System.out.print(stringa3.charAt(i));
			}
			else
			{
				System.out.print(" ");
			}
			System.out.println();
		}
			
		
	}
	
	public static void main(String[] args)
	{
		StringheVerticali stringa = new StringheVerticali();
		stringa.StampaStringheVerticali(args[0], args[1], args[2]);
	}
}

