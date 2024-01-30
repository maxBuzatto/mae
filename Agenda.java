import java.util.ArrayList;
import java.util.*;

public class Agenda {

	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println ("Bem Vindo à Agenda!");
		System.out.println (" ");
		System.out.println ("O que deseja fazer?");
		System.out.println ("1 - Adicionar Contato.");
		System.out.println ("2 - Editar Contato.");
		System.out.println ("3 - Remover Contato.");
		System.out.println ("4 - Buscar Contato.");
		System.out.println ("5 - Exibir Relação Completa.");
		System.out.println ("0 - Sair do Programa.");
		System.out.println (" ");
		System.out.print ("Opção: ");
		int o = sc.nextInt();
	
	while (o!=0) {
	switch(o) {
		case 1: {
			System.out.println (" ");
			System.out.print ("Digite o Nome do Contato: ");
			String nome=sc.nextLine();
			System.out.print ("Digite o Telefone de " + nome + ":");
			String telefone=sc.nextLine();
			System.out.print ("Digite o Email de " + nome + ":");
			String email=sc.nextLine();
			System.out.print ("Digite o Site de " + nome + ":");
			String site=sc.nextLine();
			l.add(new Contato(nome,telefone,email,site));
			break;
		}
		case 5: {
			Iterator i = l.iterator();
			while (i.hasNext()) {
			Contato a = (Contato) i.next();
			System.out.println(a.getNome());
			}
			break;
		}
	}	
	}
	System.out.println ("Programa Encerrado!");
	}
}