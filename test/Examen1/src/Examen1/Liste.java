package Examen1;

public class Liste {
	
		//attribut
	private final int maxClient=500;
	private Client[] liste;
	private int nombreClient;

	
		//constructeur
	Liste()
	{
		liste= new Client[maxClient];
		nombreClient=0;
	}
	
	public int getNombreClient() {
		return nombreClient;
	}
	
	public Client[] getListe() {
	return liste;
	}

	
		//methode
	boolean rajouterClient(Client c)
	{
		if(nombreClient<maxClient)
		{
			liste[nombreClient]=c;
			nombreClient++;
			return true;
		}
		else
			return false;
	}
	
	int rechercherPalier(int p)
	{
		int cpt=0;
		
		for(int i=0; i<nombreClient; i++)
		{
			if(liste[i].getPalier()==p)
			{
				cpt++;
			}
		}
		return cpt; 
	}
	
	
	//il me restait que lui a faire!
	int consommationMax()
	{
		int c1;
		int c2;
		int cpt=0;
		
		for(int i=0; i<nombreClient; i++)
		{
			if(liste[i].comparer(c1,c2))
			{
				cpt++;
			}	
		}
		
		return cpt;
	}
}