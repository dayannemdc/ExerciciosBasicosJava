package Exercicios;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o: D=(R+S)/2, onde: R=(A+D)^2 e S=(B+C)^2*/
		
		double A,B,C,D,R,S;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a vari�vel A: ");
		A=leia.nextDouble();
		System.out.println("\nEntre com a vari�vel B: ");
		B=leia.nextDouble();
		System.out.println("\nEntre com a vari�vel C: ");
		C=leia.nextDouble();
		
		R=Math.pow((A+B), 2);
		S=Math.pow((B+C), 2);
		D=(R+S)/2;
		
		System.out.println("O valor de A � igual a: "+A);
		System.out.println("O valor de A � igual a: "+B);
		System.out.println("O valor de A � igual a: "+C);
		System.out.println("O valor de A � igual a: "+D);
		System.out.println("O valor de A � igual a: "+R);
		System.out.println("O valor de A � igual a: "+S);

	}

}
