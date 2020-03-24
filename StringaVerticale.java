package slidepart3;

public class StringaVerticale {
	
	
	
	/*public StringaVerticale(String stringa) {
		this.stringa = stringa;
	}*/
	
	public void StampainVerticale(String stringa)
	{
		for (int i = 0; i < stringa.length(); i++) 
		{
			System.out.println(stringa.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		StringaVerticale stringa1 = new StringaVerticale();
		stringa1.StampainVerticale(args[0]);
	}
	
	

}
