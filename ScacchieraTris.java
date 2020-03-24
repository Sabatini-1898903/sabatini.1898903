package slidepart3;
import java.util.Scanner;
public class ScacchieraTris {
	private String[][] scacchiera;
	private Scanner i;
	private Scanner j;
	
	
	public ScacchieraTris()
	{
		scacchiera = new String[3][3];
	}
	
	
	public String[][] creaScacchiera()
	{
		for (int i = 0; i < scacchiera.length; i++) 
		{
			for (int j = 0; j < scacchiera.length; j++) 
			{
				scacchiera[i][j] = "";
				
			}
			
		}
		stampaScacchiera();
		return scacchiera;
	}
	
	
	
	public void stampaScacchiera()
	{
		for (int i = 0; i < scacchiera.length; i++) 
		{
			for (int j = 0; j < scacchiera.length; j++) 
			{
				System.out.print(scacchiera[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public String[][] X()
	{
		i = new Scanner(System.in);
		j = new Scanner(System.in);
		
		
		System.out.print("Scrivi le due coordinate(riga,colonna) in cui mettere la X");
		int riga = i.nextInt();
		int colonna = j.nextInt();
		scacchiera[riga][colonna] = " X ";
		System.out.print(scacchiera);
		return scacchiera;
	}
	
	public String[][] O()
	{
		i = new Scanner(System.in);
		j = new Scanner(System.in);
		
		
		System.out.print("Scrivi le due coordinate(riga,colonna) in cui mettere la X");
		int riga = i.nextInt();
		int colonna = j.nextInt();
		scacchiera[riga][colonna] = " O ";
		System.out.print(scacchiera);
		return scacchiera;
	}
}
