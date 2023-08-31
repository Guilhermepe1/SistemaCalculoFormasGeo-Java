package br.senai.sp.Model;

public class Triangulo {
    /** Declara variaveis */
    public double base, altura;

    /** Calcula Area */
    public double Area(){
        double area = (base*altura)/2;
        return area;
    }

    /** Calcula Perimetro */
    public double Perimetro(){
        double perimetro = base+altura*2;
        return perimetro;
    }
}
