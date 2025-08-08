package entities;

/*
 * ================================================================
 * Arquivo: Retangulo.java
 * Pacote: entities
 * Autor: Joneidson
 * Data de Criação: 08/08/2025
 *
 * Descrição:
 * TODO: Descreva o propósito deste arquivo.
 *
 * Versão: 1.0
 * ================================================================
 */
public class Retangulo {

    public double altura; //<= atributo
    public double largura;//<= atributo

    // calcula area
    public double area() { // <= se eu quisesse que o valor voltasse pro meu atributo colocaria ele dentro do ();
        return altura * largura;
    }
    // calcula perimetro
    public double perimetro() {
        return 2 * (altura+largura);
    }
    // calcula diagonal
    public double diagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

}
