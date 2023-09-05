package br.senai.sp.Model;

import java.util.Scanner;

public class Menu {
    /** Declara variaveis */
    public int seleciona;
    public String nome;

    /** Instancia teclado */
    Scanner teclado = new Scanner(System.in);
    /** Instancia Circulo */
    Circulo circulo = new Circulo();
    /** Instancia Retangulo */
    Retangulo retangulo = new Retangulo();
    /** Instancia Triangulo */
    Triangulo triangulo = new Triangulo();
    /** Instancia Quadrado */
    Quadrado quadrado = new Quadrado();
    /** Instancia Output */
    Output output = new Output();
    /** Instancia Cadastro */
    Cadastro cadastro = new Cadastro();


    /** Funcao Menu */
    public void ChamaMenu(){
        /** Declara variavel de laco de repeticao */
        Boolean continua = true;
        /** Coleta nome do usuario */
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.printf("-------------> Bem vindo %s! <---------------\n", nome.toUpperCase());

        /** Inicia Menu */
        while (continua) {
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
            System.out.println("-----------> Selecione uma opção abaixo:");
            System.out.println("1 - Círculo\n2 - Retângulo\n3 - Triângulo\n4 - Quadrado\n5 - Sair");
            System.out.println("-------------------------------------------");
            System.out.println("Digite a opção: ");
            seleciona = teclado.nextInt();
            System.out.println("-------------------------------------------");


            /** Seleciona de acordo com a escolha do usuario */
            switch (seleciona) {
                case 1: //Circulo
                    cadastro.ColetaCirculo(circulo);
                    output.PrintaCirculo(circulo);
                    break;
                case 2: //Retangulo
                    cadastro.ColetaRetangulo(retangulo);
                    output.PrintaRetangulo(retangulo);
                    break;
                case 3: //Triangulo
                    cadastro.ColetaTriangulo(triangulo);
                    output.PrintaTriangulo(triangulo);
                    break;
                case 4: //Quadrado
                    cadastro.ColetaQuadrado(quadrado);
                    output.PrintaQuadrado(quadrado);
                    break;
                case 5: //Sair
                    continua = false;
                    break;
            }
        }
    }
}
