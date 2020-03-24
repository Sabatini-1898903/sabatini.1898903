package slidepart3;

public class Array {
	public boolean TrovaBool(String[] array,String stringa)
	{
		for (String element : array) {
			if (element == stringa)
			{
				return true;
			}
			
		}
		return false;
	}
	
	public int  TrovaPosizione(String[] array,String stringa)
	{
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i] == stringa)
			{
				return i;
			}
		}
		return -1;
	}
	
	public double MaxVal(Double[] array)
	{
		double max = array[0];
		for (int i = 0; i < array.length; i++) 
		{
			 max = Math.max(max, array[i]);
		}
		return max;
	}
	
public static void main(String[] args) 
{
	Array prova = new Array();
	String [] array = {"ciao","come","stai","io","bene"};
	Double[] arraydouble = {2.0,2.1,2.2,2.3,2.4};
	prova.TrovaBool(array, "ciao");
	prova.TrovaPosizione(array, "io");
	prova.MaxVal(arraydouble);
	
}
}


