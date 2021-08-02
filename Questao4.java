package Exercicios;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: D=(R+S)/2, onde: R=(A+D)^2 e S=(B+C)^2*/
		
		double A,B,C,D,R,S;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a variável A: ");
		A=leia.nextDouble();
		System.out.println("\nEntre com a variável B: ");
		B=leia.nextDouble();
		System.out.println("\nEntre com a variável C: ");
		C=leia.nextDouble();
		
		R=Math.pow((A+B), 2);
		S=Math.pow((B+C), 2);
		D=(R+S)/2;
		
		System.out.println("O valor de A é igual a: "+A);
		System.out.println("O valor de A é igual a: "+B);
		System.out.println("O valor de A é igual a: "+C);
		System.out.println("O valor de A é igual a: "+D);
		System.out.println("O valor de A é igual a: "+R);
		System.out.println("O valor de A é igual a: "+S);

	}

}
