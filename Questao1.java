package Exercicios;

import java.util.Scanner;

public class Questao1 {
	
	public static void main(String[] args) {
		/* 
		 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
		 */
		double anos,meses,dias,idadeDias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual é a sua idade em anos? ");
		anos = ler.nextFloat();
		System.out.println("Qual é a sua idade em meses? ");
		meses = ler.nextFloat();
		System.out.println("Qual é a sua idade em dias? ");
		dias = ler.nextFloat();
		
		idadeDias=((anos*360)+(meses*30)+dias);
		
		System.out.println("\nSua idade é de: "+idadeDias+" dias!");
	}

}
