package switch_1;

import java.util.Scanner;

// objetivo: criar um sistema que pergunte ao usuario 
// sua cor favorita, apresentando tres opcao numeradas:
//ignore meu portugues to usando teclado gringo :(

public class switch_exemplo_1 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha sua cor favorita!");
		
		System.out.println("1 - azul");
		
		System.out.println("2 - verde");
		
		System.out.println("3 - vermelho");
		
		System.out.println("digite  o numero da opcao:");
		
		int opcao = entrada .nextInt();
		
		switch (opcao) {
		
		case 1 :
			
			System.out.println("voce escolheu a cor azul");
			break ;
			
			
		case 2 :
			
			System.out.println("voce escolheu a cor verde");
			break ;
			
		case 3 : 
			
			System.out.println("voce escolheu a vermelho");
			break ;
				
		default:
				
		   System.out.println("opcao invalida!");
			
			
			
		}
		
		entrada.close();
		
		}

	}


