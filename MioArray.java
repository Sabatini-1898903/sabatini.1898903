package slidepart3;

public class MioArray
{
	private int[] array;
	public MioArray(int[] array)
	{
		this.array = array;
	}
	
	
	public void contiene(byte posizione,int intero) 
	{
		if (array[posizione] == intero)
		{
			System.out.print(true);
		}
		else System.out.print(false);
	}
	
	public void somma2()
	{
		if (array.length >= 2)
		{
			System.out.print(array[0] + array[1]);
		}
		else if (array.length == 0)
		{
			System.out.print(0);
		}
		else System.out.print(array[0]);
	}
	
	public void scambia(byte posizione1,byte posizione2)
	{
		int var = 0;
		var = array[posizione1];
		array[posizione1] = array[posizione2];
		array[posizione2] = var;
		System.out.print(array);
	}
	
	public void maxTripla()
	{
		
		System.out.print(Math.max(Math.max(array[0], array[array.length - 1]), array.length/2));
	}
	
	public void falloInDue()
	{
		int[] ndarray = {array[0],array[array.length - 1]};
		System.out.print(ndarray);
	}
}
