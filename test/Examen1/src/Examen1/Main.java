package Examen1;

public class Main {

	public static void main(String[] args) {
		
		 	//debut du programme
		Client client;
		
		Liste listClient= new Liste();
		
			//creation des client
		System.out.println("Créaion des 6 client");
		System.out.println("--------------------------");
		
		client= new Client("Lambert","Kristina","155 boul.st-Marguerite",800,2);
		if(listClient.rajouterClient(client))
			System.out.println("Le premier client a été ajouter avec succès!");
			
		client= new Client("Allard","Étienne","777 rue des seven",350,1);
		if(listClient.rajouterClient(client))
			System.out.println("Le deuxième client a été ajouter avec succès!");
		
		client= new Client("Lebeau","Alexis","260 rue bellini",1020,3);
		if(listClient.rajouterClient(client))
			System.out.println("Le troisième client a été ajouter avec succès!");
		
		client= new Client("Gingra","Félix","450 rue des troue",950,2);
		if(listClient.rajouterClient(client))
			System.out.println("Le quatrième client a été ajouter avec succès!");
		
		client= new Client("Fortnite","Louca","78 rue des pommes",1200,3);
		if(listClient.rajouterClient(client))
			System.out.println("Le cinquième client a été ajouter avec succès!");
		
		client= new Client("Robert","Ioann","69 rue des brocoli",400,1);
		if(listClient.rajouterClient(client))
			System.out.println("Le sixième client a été ajouter avec succès!");
		
		
			//Parcourir la liste client
		System.out.println();
		System.out.println("Voici la liste des 6 clients");
		System.out.println("----------------------------");
		
		for(int i=0; i<listClient.getNombreClient(); i++)
		{
			
			System.out.println(listClient.getListe()[i].toString());	
		}
					
			//nombre de client dans chaque palier
		System.out.println();
		System.out.println("Voici la liste de chaque palier");
		System.out.println("-------------------------------");
		System.out.println("Le nombre de client qui sont dans le palier 1 est de: "+listClient.rechercherPalier(1)+ " personnes.");
		System.out.println("Le nombre de client qui sont dans le palier 2 est de: "+listClient.rechercherPalier(2)+ " personnes.");
		System.out.println("Le nombre de client qui sont dans le palier 3 est de: "+listClient.rechercherPalier(3)+ " personnes.");
			
		
		
		//et faire celui la vue que l'autre est pas fait!	
			//le client qui consomme le plus
		System.out.println();
		System.out.println("Voici le client qui consomme le plus");
		System.out.println("------------------------------------");
		System.out.println("Le client qui consomme le plus est: "+listClient.consommationMax());
	}
}
