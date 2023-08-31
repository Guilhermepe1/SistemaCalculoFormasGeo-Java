package br.senai.sp.Model;

import java.util.Scanner;

public class Cadastro {

    /** Instancia teclado */
    Scanner teclado = new Scanner(System.in);

    /** Coleta dados do retangulo */
    public void ColetaRetangulo(Retangulo retangulo){
        System.out.println("Lado 1:");
        retangulo.lado1 = teclado.nextDouble();
        System.out.println("Lado 2:");
        retangulo.lado2 = teclado.nextDouble();
    }

    /** Coleta dados do circulo */
    public void ColetaCirculo(Circulo circulo){
        System.out.println("Raio: ");
        circulo.raio = teclado.nextDouble();
    }

    /** Coleta dados do triangulo */
    public void ColetaTriangulo(Triangulo triangulo){
        System.out.println("Base: ");
        triangulo.base = teclado.nextDouble();
        System.out.println("Altura: ");
        triangulo.altura = teclado.nextDouble();
    }

    /** Coleta dados do quadrado */
    public void ColetaQuadrado(Quadrado quadrado){
        System.out.println("Lado: ");
        quadrado.lado = teclado.nextDouble();
    }
}
