package application;

import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

/*
 * ================================================================
 * Arquivo: ${NAME}.java
 * Pacote: ${PACKAGE_NAME}
 * Autor: Joneidson
 * Data de Criação: 08/08/2025
 *
 * Descrição:
 *Fazer um programa para ler os valores da largura e altura de um
retângulo. Em seguida, mostrar na tela o valor de sua área,
perímetro e diagonal. Usar uma classe como mostrado no
projeto ao lado.
 *
 * Versão: 1.0
 * ================================================================
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        String opcao = "S";

        while (opcao.equalsIgnoreCase("S")) {
            retangulo = new Retangulo(); // <= criação de um novo objeto
            System.out.print("Qual a altura do retangulo: ");
            retangulo.altura = sc.nextDouble(); // <= chama o novo objeto pra receber o atributo
            System.out.print("Quala largura do retangulo: ");
            retangulo.largura = sc.nextDouble();

            System.out.println(retangulo.area()); // <= toda vez que for chamar o metodo precisa colocar os "()" no final e chamando o novo objeto
            System.out.println(retangulo.perimetro());
            System.out.println(retangulo.diagonal());
            sc.nextLine();
            System.out.println("Gostaria de repetir a operação; (S/N)");
            opcao = sc.nextLine();
        }

        System.out.println("Obrigado por utilizar o nosso sistema");
        sc.close();
    }

}