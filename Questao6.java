package Exercicios;

import java.util.Scanner;

public class Questao6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula 
que efetua tal cálculo é: d=raiz quadrada ((x2-x1)^2+(y2-y1)^2)*/
		double x1,x2,y1,y2,d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de X1 :");
		x1=leia.nextDouble();
		System.out.println("\nEntre com o valor de X2 :");
		x2=leia.nextDouble();
		System.out.println("\nEntre com o valor de Y1 :");
		y1=leia.nextDouble();
		System.out.println("\nEntre com o valor de Y2 :");
		y2=leia.nextDouble();
		
		d=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		
		System.out.printf("\nDistância entre os pontos: %.2f",d);
	}

}
