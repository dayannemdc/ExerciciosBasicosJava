package Exercicios;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.*/
		
		double custoFabrica,porcentagemDistribuidor,porcentagemImpostos,custoFinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual � o custo de F�brica do carro novo? Entre com o valor: ");
		custoFabrica=leia.nextDouble();
		
		porcentagemDistribuidor=custoFabrica*0.28;
		porcentagemImpostos=custoFabrica*0.45;
		custoFinal=custoFabrica+porcentagemDistribuidor+porcentagemImpostos;
		
		
		System.out.println("O custo final � de: R$"+custoFinal);
		
		//System.out.printf("O custo final do carro novo � de: R$ %.2F",custoFinal);
		

	}

}
