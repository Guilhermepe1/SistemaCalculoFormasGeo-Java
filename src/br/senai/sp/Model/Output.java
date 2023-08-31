package br.senai.sp.Model;

public class Output {
    /** Printa dados do circulo */
    public void PrintaCirculo(Circulo circulo){
        System.out.println("-------------------------------------------");
        System.out.println("                Circulo");
        System.out.println("Raio: " + circulo.raio);
        System.out.println("Diametro: "+circulo.Diametro());
        System.out.println("Área: "+circulo.Area());
        System.out.println("Perimetro: "+circulo.Perimetro());
    }

    /** Printa dados do retangulo */
    public void PrintaRetangulo(Retangulo retangulo){
        System.out.println("-------------------------------------------");
        System.out.println("                Retângulo");
        System.out.println("Lado 1: "+retangulo.lado1);
        System.out.println("Lado 2: "+retangulo.lado2);
        System.out.println("Área: "+retangulo.Area());
        System.out.println("Perimetro: "+retangulo.Perimetro());
    }

    /** Printa dados do triangulo */
    public void PrintaTriangulo(Triangulo triangulo){
        System.out.println("-------------------------------------------");
        System.out.println("                Triângulo");
        System.out.println("Base: "+triangulo.base);
        System.out.println("Altura: "+triangulo.altura);
        System.out.println("Área: "+triangulo.Area());
        System.out.println("Perimetro: "+triangulo.Perimetro());
    }

    /** Printa dados do quadrado */
    public void PrintaQuadrado(Quadrado quadrado){
        System.out.println("-------------------------------------------");
        System.out.println("                Quadrado");
        System.out.println("Lado :"+quadrado.lado);
        System.out.println("Área: "+quadrado.Area());
        System.out.println("Perimetro: "+quadrado.Perimetro());
    }
}
