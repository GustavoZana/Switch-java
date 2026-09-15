package switch_1;

import java.util.Scanner;

public class Switch_exercicios2 {
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite uma letra:");
		
		char letra = entrada.next().toLowerCase().charAt(0);
		
		switch (letra) {
		
		case 'a':
			
		case 'e':
		
		case 'i':
			
		case 'o':	
			
		case 'u':
			
			System.out.println("é uma vogal");
			
			
		    break;
		    
		    default:
		    
		    if(Character.isLetter(letra)) {
		    	
		    	System.out.println("é uma consoante.");
		    	
		    } else {
		    	
		    	System.out.println("caractere invalido. Digite uma letra");
		    }
		
		}
            entrada.close();
	}

}
