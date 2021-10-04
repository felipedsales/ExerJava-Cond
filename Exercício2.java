package Familia36;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("\nDigite um número: ");
		a = ler.nextInt();
		System.out.println("\nDigite um número: ");
		b = ler.nextInt();
		System.out.println("\nDigite um número: ");
		c = ler.nextInt();
		
		if(a<=b && b<=c) {
			System.out.println("\nA ordem crescente é: "+a+","+b+","+c);
		}
		if(a<=c && c<=b) {
			System.out.println("\nA ordem crescente é: "+a+","+c+","+b);
		}
		if(b<=a && a<=c) {
			System.out.println("\nA ordem crescente é: "+b+","+a+","+c);
		}
		if(b<=c && c<=a) {
			System.out.println("\nA ordem crescente é: "+b+","+c+","+a);
		}
		if(c<=b && b<=a) {
			System.out.println("\nA ordem crescente é: "+c+","+b+","+a);
		}
		if(c<=a && a<=b) {
			System.out.println("\nA ordem crescente é: "+c+","+a+","+b);
		}
}
}
