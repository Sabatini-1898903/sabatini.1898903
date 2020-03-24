package slidepart3;

public class TavolaPitagorica {
	
	private int n;
	
	public TavolaPitagorica(int n)
	{
		this.n = n;
	}
	
	public String creaTavola()
	{
		
		StringBuilder tab = new StringBuilder();
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				
				tab.append(i*j+"\t");
			}
			tab.append("\n");
			
		}
		System.out.print(tab);
		return tab.toString();
		
	
		
	}
	public void stampaValore(int i,int j)
	{	
		if(i <= n && j <= n && i >= 1 && j >= 1) {
		System.out.print(j*i);}
		else
		{
			System.out.print("Valore non presente nella tavola");
		}
	}
	
	public static void main(String[] args) {
		TavolaPitagorica tav = new TavolaPitagorica(10);
		tav.creaTavola();
		tav.stampaValore(9,9);
	}

}
