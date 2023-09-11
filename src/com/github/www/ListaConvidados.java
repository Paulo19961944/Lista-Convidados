package com.github.www;
import java.util.Scanner;

public class ListaConvidados {
    public static void main(String[] args) {
        // Importar a Classe Scanner
        Scanner teclado = new Scanner(System.in);

        // Cria um array para armazenar os nomes dos convidados
        String[] convidados = new String[7];

        // Formatação
        System.out.println();
        System.out.println("********** LISTA DE CONVIDADOS **********");
        System.out.println();

        // Captura 7 convidados
        for (int i = 0; i < convidados.length; i++) {
            System.out.print("Digite o nome do(a) Convidado(a): ");
            convidados[i] = teclado.next().trim();
        }

        // Fecha o Scanner
        teclado.close();

        // Printa na Tela
        System.out.println();
        System.out.println("********** NOMES DOS CONVIDADOS **********");
        System.out.println();
        for (String nome : convidados) {
            System.out.println("O Nome do(a) Convidado(a) é: " + nome);
        }

        // Fim
        System.out.println();
        System.out.println("********** FIM **********");
    }
}
