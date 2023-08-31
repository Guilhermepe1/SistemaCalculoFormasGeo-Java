package br.senai.sp.Model;

public class Quadrado {
    /** Declara variaveis */
    public double lado;

    /** Calcula perimetro */
    public double Perimetro(){
        double perimetro = lado*4;
        return perimetro;
    }

    /** Calcula area */
    public double Area(){
        double area = Math.pow(lado,2);
        return area;
    }
}
