package Familia36;

import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		num = leia.nextInt();
		
		if(num%2==0) {
			num=(int) (Math.sqrt(num));
			System.out.println(num);
		}
		else {
			num=num*num;
					System.out.println(num);
		}

	}

}
