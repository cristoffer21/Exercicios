import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double h, b, B, area;

        System.out.println("digite a altura");
        h = entrada.nextDouble();

        System.out.println("digite a base menor");
        b = entrada.nextDouble();

        System.out.println("digite a base maior");
        B = entrada.nextDouble();

        area = (h * (b + B)) / 2;

        System.out.println("o valor da área é: " + area);
        System.out.println("o valor inteiro é: " + (Math.round(area)));

        // System.out.println("O valor da área é:" + area);
        // Faça o programa acima calcular utilizando valores de ponto flutuante e depois
        // imprima na tela
        // duas informações:
        // Valor exato da área:
        // Valor arredondado para inteiro:
    }
}
