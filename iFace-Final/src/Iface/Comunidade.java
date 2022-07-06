package Iface;

import java.util.ArrayList;
import java.util.Scanner;

public class Comunidade{
	public String creator;
	public String communityname;
	public String descrip;
	public ArrayList<String> communitymembers = new ArrayList<String>();
	
	
	public void NewCommunity(String communitycreator) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			creator = communitycreator;
			
			communitymembers.add(communitycreator);
			
			System.out.println("Qual sera o nome da sua comunidade?");
			
			communityname = scanner.nextLine();
			
			System.out.println("Descreva a sua comunidade!");
			
			descrip = scanner.nextLine();
		}
		System.out.println("Comunidade criada com sucesso!");
		
	}
	
	public void ShowCommunity() {
		
		int i;
		
		System.out.println("\n" + this.communityname.toUpperCase());
		System.out.println("--------------------------\n");
		System.out.println("Comunidade criada por:\n" + this.creator);
		System.out.println("Descricao:\n" + this.descrip);
		System.out.println("Membros\n");
		for(i = 0; i < communitymembers.size(); i++) {
			System.out.println("   " + communitymembers.get(i));
		}
		
	}
	
	
}