package Familia36;

import java.util.Scanner;

public class Exercício1 {
	public static void main(String args[]) {
		
		int num1,num2,num3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite um outro: ");
		num2 = leia.nextInt();
		System.out.println("\nDigite um mais um número: ");
		num3 = leia.nextInt();
		
		if(num1>num2 && num1>num3){
			System.out.printf("\nO maior número é: "+num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.printf("\nO maior número é: "+num2);
		}
		else  {
			System.out.printf("\nO maior número é: "+num3);
		}
		
		}
	
	

}
