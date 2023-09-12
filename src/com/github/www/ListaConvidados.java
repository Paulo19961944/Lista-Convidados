package com.github.www;
import java.util.Scanner;

public class ListaConvidados {
    public static void main(String[] args) {
        // Importar a Classe Scanner
        Scanner teclado = new Scanner(System.in);

        // Cria a Lista de Convidados
        String[] convidados = new String[7];

        // Formatação
        System.out.println();
        System.out.println("********** LISTA DE CONVIDADOS **********");
        System.out.println();

        // Adiciona na Lista
        for (int i = 0; i < convidados.length; i++){
            System.out.print("Digite o nome do(a) Convidado(a): ");
            convidados[i] = teclado.next().trim();
        }

        // Fecha o Scanner
        teclado.close();

        // Printa o Resultado na Tela
        System.out.println();
        System.out.println("********** NOME DOS CONVIDADOS **********");
        System.out.println();

        for (String nome : convidados){
            System.out.println("O nome do(a) Convidado(a) é: " + nome);
        }

        // Fim
        System.out.println();
        System.out.println("********** FIM **********");
    }
}
