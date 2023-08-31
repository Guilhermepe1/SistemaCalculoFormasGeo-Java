package br.senai.sp.Model;

public class Circulo {
    /** Declara variaveis */
    public double raio;

    /** Calcula Diametro */
    public double Diametro(){
       double diametro = raio*2;
        return diametro;
    }

    /** Calcula Perimetro */
    public double Perimetro(){
        double perimetro = 2*Math.PI*raio;
        return perimetro;
    }

    /** Calcula Raio */
    public double Area(){
        double area = Math.PI*Math.pow(raio,2);
        return area;
    }
}
