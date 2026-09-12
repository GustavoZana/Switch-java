package switch_1;

 import java.util.Scanner;

public class exercicios_1 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero:");
		
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo numero");
		
		double num2 = entrada.nextDouble();
		
		System.out.print("Digite a operacao(+, - , * , /):");
		
		char operador = entrada.next().charAt(0);
		 
		switch (operador) {
		
		case '+':
			
			System.out.println("resultado: "+ (num1 + num2));
			
			break;
			

	    case '-':
			
			System.out.println("resultado: "+ (num1 - num2));
			
			break;
			

	    case '*':
	
	System.out.println("resultado: "+ (num1 * num2));
	
	break;
	

	    case '/':
	    	
	    	if (num2 != 0)
	
	System.out.println("resultado: "+ (num1 / num2));
	
	    	else
	    		
	    		System.out.println("Erro:Divisao por zero");
	    	
	    	break;
	    	
	    	default:
	    		
	    		System.out.println("operador invalido");
	    		
		}
		entrada.close();
		}
		
	}


