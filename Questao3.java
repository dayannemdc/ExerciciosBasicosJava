package Exercicios;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
		double duracao,horas,minutos,segundos;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual � o tempo de dura��o do evento em segundos? ");
		duracao=ler.nextDouble();
		
		horas=duracao/3600;
		minutos=horas/60;
		segundos=horas%60;
		
		System.out.println("A dura��o do evento � de: "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos.");
		

	}

}
