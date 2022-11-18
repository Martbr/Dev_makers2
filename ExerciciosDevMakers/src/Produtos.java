/*Enunciado
Exercício: Crie um programa que receba nomes
e preços de produtos e depois no final mostre qual o produto mais caro e o mais barato.
Entradas:
Nome e preço do produto
Finalizar operação
Saida:
Nome e preço do produto mais caro
Nome e preço do produto mais barato
*/

import java.util.Vector;
import java.util.Scanner;
import java.util.Objects;
public class Produtos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> produto  = new Vector<String>();
        Vector<Integer> preco  = new Vector<Integer>();
        int maior = 0, menor = 10000000, aux = 0, iMax = 0, iMin =0;
        String opcao;
        do {System.out.println("Digite C para cadastro e S para sair ");
            opcao = sc.nextLine().toLowerCase();
            switch (opcao) {
                case "c":
                    System.out.println("Digite o nome do produto ");
                    produto.add(sc.next());
                    System.out.println("Digite o preço do produto ");
                    preco.add(sc.nextInt());
                    if( preco.get(aux) > maior) {
                        maior = preco.get(aux);
                        iMax = aux;             }
                    if( preco.get(aux) < menor) {
                        menor = preco.get(aux);
                        iMin = aux;             }
                    aux++;sc.nextLine();
                    break;
                case "s": System.out.println("O produto de MAIOR valor foi: "+ produto.get(iMax) +", no valor de : "+preco.get(iMax));
                          System.out.println("\n O produto de MENOR valor foi: "+ produto.get(iMin) +", no valor de : "+preco.get(iMin));
                    break;

                default: System.out.println("Opçao invalida");}
        } while(!Objects.equals(opcao, "s"));   }}