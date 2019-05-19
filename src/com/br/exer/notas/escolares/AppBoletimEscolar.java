package com.br.exer.notas.escolares;

import java.util.Scanner;

public class AppBoletimEscolar {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	
		double notaMatamatica;
		double notaPortugues;
		double notaArtes;
		double notaCiencias;
		
		System.out.println("Digite sua nota de Matamatica:");
		notaMatamatica = entrada.nextDouble();
		

		System.out.println("Digite sua nota de português:");
		notaPortugues = entrada.nextDouble();
		

		System.out.println("Digite sua nota de Artes:");
		notaArtes = entrada.nextDouble();
		

		System.out.println("Digite sua nota de Ciências:");
		notaCiencias = entrada.nextDouble();
		
		
		
		double boletim = notaMatamatica + notaPortugues + notaArtes + notaCiencias;
		double media = boletim/4;
		
		if(media >= 7) {
			System.out.println("Aprovado " + media);
		}else {
			System.out.println("Reprovado");
		}
	}

}
