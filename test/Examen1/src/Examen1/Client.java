package Examen1;

public class Client {
	
		//attribut
	private String nom;
	private String prenom;
	private String adresse;
	private int nombTotalKWH;
	private int palier;
	
		//constructeur
	Client(String Nom, String Prenom, String adress, int totalKWH, int Palier)
	{
		this.nom=Nom;
		this.prenom=Prenom;
		this.adresse=adress;
		this.nombTotalKWH=totalKWH;
		this.palier=Palier;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public int getNombTotalKWH() {
		return nombTotalKWH;
	}

	public int getPalier() {

		if((nombTotalKWH >= 1) && (nombTotalKWH <= 500))
		{
			return 1;
		}
		else
		{
			if((nombTotalKWH >=501) && (nombTotalKWH <=1000))
			{
				return 2;
			}
			else
			{
					return 3;	
			}			
		}	
	}

		//les methodes
	
	public float calculerTotal()
	{
		float prixTotal=0;
		final float palier1=0.05f;
		final float palier2=0.07f;
		final float palier3=0.10f;
		
		if(getPalier()==1)
		{
			prixTotal= nombTotalKWH * palier1;
			return prixTotal;
		}
		else
		{
			if(getPalier()==2)
			{
				prixTotal= nombTotalKWH * palier2;
				return prixTotal;
			}
			else
			{
				if(getPalier()==3)
				{
					prixTotal= nombTotalKWH * palier3;
					return prixTotal;
				}
			}
		}	
		return prixTotal;
	}
	
	static Client comparer(Client c1, Client c2)
	{
		if(c1.getNombTotalKWH() > c2.getNombTotalKWH())
			return c1;
		else
			return c2;
	}
	
		//affichage
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", nombTotalKWH=" + nombTotalKWH
				+ ", palier=" + palier + "]";
	}
	
}
