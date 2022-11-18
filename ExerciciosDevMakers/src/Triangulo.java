/* 
Enunciado
Desenvolver um programa que deverá desenhar um triângulo conforme a figura abaixo.
O programa deverá receber quantidade de linhas a serem impressas.
*/

import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
		System.out.println("Digite um numero inteiro maior que zero :");
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		for (int i = line ; i > 0; i--) {
			for (int j = i; j > 0; j--) {
			System.out.print("*");   }			
			System.out.println();}
		sc.close();
		}}

