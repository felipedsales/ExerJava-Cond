package Familia36;

import java.util.Scanner;

public class Exerc�cio1 {
	public static void main(String args[]) {
		
		int num1,num2,num3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um n�mero: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite um outro: ");
		num2 = leia.nextInt();
		System.out.println("\nDigite um mais um n�mero: ");
		num3 = leia.nextInt();
		
		if(num1>num2 && num1>num3){
			System.out.printf("\nO maior n�mero �: "+num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.printf("\nO maior n�mero �: "+num2);
		}
		else  {
			System.out.printf("\nO maior n�mero �: "+num3);
		}
		
		}
	
	

}
