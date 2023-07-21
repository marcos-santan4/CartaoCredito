package br.com.studies.alura.principal;

import br.com.studies.alura.models.Cartao;
import br.com.studies.alura.models.Produto;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do cartão:");
        int limite = sc.nextInt();
        Cartao cartao = new Cartao(limite);
        List<Produto> produtos = new ArrayList<>();

        int valorMenu = 1;
        while(valorMenu != 0) {
            sc.nextLine();
            System.out.println("Digite a descrição da compra:");
            String descricao = sc.nextLine();

            System.out.println("Digite o valor da compra:");
            int preco = sc.nextInt();
            System.out.println();
            cartao.realizaCompra(preco);

            produtos.add(new Produto(descricao, preco));

            System.out.printf("Deseja continuar? (0 - não/1 - sim)");
            int resposta = sc.nextInt();
            if (resposta == 0) {
                valorMenu = resposta;
            }
        }

        System.out.println("--------------------------");
        System.out.println("COMPRAS REALIZADAS:\n");

        for (Produto c : produtos) {
            System.out.println(c);
        }

        System.out.println("\n" + cartao);

    }
}
