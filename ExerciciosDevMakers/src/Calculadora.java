/*   Enunciado
Crie um programa calculadora que recebe a operação matemática (somar, subtrair, multiplicar ou dividir) e os dois números.
Mostre o resultado da operação.   */

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String operadores = "somar subtrair dividir multiplicar ";
	    System.out.println("Informe a operação:[somar, subtrair, multiplicar ou dividir ]");
	    String opcao = sc.next();
	    if (operadores.contains(opcao)) {
	        double n1, n2, result;
	        System.out.print("Informe o primeiro número: ");
	        n1 = sc.nextDouble();
	        System.out.print("Informe o segundo número: ");
	        n2 = sc.nextDouble();
	        if (opcao.equals("subtrair")) {
	            result = n1 - n2;
	        } else if (opcao.equals("somar")) {
	            result = n1 + n2;
	        } else if (opcao.equals("multiplicar")) {
	            result = n1*n2;
	        } else {
	            while(n2==0){
	                System.out.print("Informe o segundo número: ");
	                n2 = sc.nextDouble();}
	                result = n1 / n2;}
	        System.out.print("Sua operação resultou em " + result);}
	   else{System.out.println("Procure outra calculadora");}
	   sc.close();
	}}
	