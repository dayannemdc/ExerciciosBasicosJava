package Exercicios;

import java.util.Scanner;

public class Questao7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Um sistema de equações lineares do tipo: ax+bc=c ; dx+ey=f, pode ser resolvido segundo mostrado abaixo: x=(ce-bf)/(ae-bd) e y=(af-cd)/(ae-bd)
		 * escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
		 */
		float a,b,c,d,e,f,x,y;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de A: ");
		a=ler.nextFloat();
		System.out.println("\nEntre com o valor de B: ");
		b=ler.nextFloat();
		System.out.println("\nEntre com o valor de C: ");
		c=ler.nextFloat();
		System.out.println("\nEntre com o valor de D: ");
		d=ler.nextFloat();
		System.out.println("\nEntre com o valor de E: ");
		e=ler.nextFloat();
		System.out.println("\nEntre com o valor de F: ");
		f=ler.nextFloat();
		
		x=(c*e - b*f) / (a*e - b*d);
		y=(a*f - c*d) / (a*e - b*d);
		
		System.out.println("\nValor de X: "+x);
		System.out.println("\nValor de Y: "+y);

	}

}
