package Exercicios;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
		double idadeAnos,idadeDias,idadeMeses,restoDeDias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nQual � a sua idade em dias? ");
		idadeDias=ler.nextFloat();
		
		idadeAnos=idadeDias/365;
		idadeMeses=(idadeDias%365)/30;
		restoDeDias=idadeMeses%30;
		
		System.out.println("\nSua idade � de: "+idadeAnos+" anos, "+idadeMeses+" meses e "+restoDeDias+" dias. ");
		//System.out.printf("\nSua idade � de: %2.2f", idadeAnos," anos, %2.2f",idadeMeses," meses e %2.2f",restoDeDias," dias. ");
		//System.out.printf("\nSua idade � de: %2.2f", idadeAnos);
		//System.out.printf("\n%2.2f", idadeMeses," meses");
		//System.out.printf("\n%2.2f", restoDeDias," dias.");
	}

}


