import java.util.Scanner;
public class exercicio1{

public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
double h,b,B,A;

System.out.println("digite a altura");
h = entrada.nextDouble();

System.out.println("digite a base menor");
b = entrada.nextDouble();

System.out.println("digite a base maior");
B = entrada.nextDouble();

A = (h * (b + B)) / 2;

System.out.println("o valor da área é:" + A);





}    
}

// Implemente um programa para calcular a área de um trapézio, onde:
//h = altura
//b = base menor
//B = base maior
//Área = (h . (b + B)) / 2
