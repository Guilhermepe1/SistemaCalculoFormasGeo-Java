package br.senai.sp.Model;

public class Retangulo {
    /** Declara variaveis */
    public double lado1, lado2;

    /** Calcula perimetro */
    public double Perimetro(){
        double perimetro = (2*lado1)+(2*lado2);
        return perimetro;
    }

    /** Calcula area */
    public double Area(){
        double area = lado1*lado2;
        return area;
    }
}
