package Familia36;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("\nDigite um n�mero: ");
		a = ler.nextInt();
		System.out.println("\nDigite um n�mero: ");
		b = ler.nextInt();
		System.out.println("\nDigite um n�mero: ");
		c = ler.nextInt();
		
		if(a<=b && b<=c) {
			System.out.println("\nA ordem crescente �: "+a+","+b+","+c);
		}
		if(a<=c && c<=b) {
			System.out.println("\nA ordem crescente �: "+a+","+c+","+b);
		}
		if(b<=a && a<=c) {
			System.out.println("\nA ordem crescente �: "+b+","+a+","+c);
		}
		if(b<=c && c<=a) {
			System.out.println("\nA ordem crescente �: "+b+","+c+","+a);
		}
		if(c<=b && b<=a) {
			System.out.println("\nA ordem crescente �: "+c+","+b+","+a);
		}
		if(c<=a && a<=b) {
			System.out.println("\nA ordem crescente �: "+c+","+a+","+b);
		}
}
}
