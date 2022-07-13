
 /* Questão 6 - Existem 454 gramas em uma libra, e 1000 gramas em um quilo. Faça um programa que converta
quilos para libras e vice-versa. (Dica: use um caractere indicando a ordem da conversão,
exemplo "java q 1000" seria o comando para converter 1000 quilos para libra, e "java l 1000"
seria o comando para converter 1000 libras para quilo) */
import java.util.Scanner;
public class Converter { 
    public static void main(String[] args) {

    System.out.println("1 - Converter Kg em libras");
    System.out.println("2 - Converter Libras em Kg");  
    Scanner Resposta=new Scanner (System.in);
    System.out.printf("Digite:  ");
    int opcao = Resposta.nextInt(); 
   
    String valorSimb=""; 
    double resulL=0; 
    double resulKg=0;
    if(opcao==1) { 
    System.out.printf("Digite o valor em KG : ");
    double d=Resposta.nextDouble();
    resulL=d*2.2046; valorSimb="lbs";
    System.out.println("O valor aproximado é de: "+resulL+" "+ valorSimb);
    } 
    else {
    System.out.printf("Digite o valor em Libras: ");
    double d=Resposta.nextDouble();
    resulKg=d*0.4536; valorSimb="kg";
    System.out.println("O valor aproximado é de : "+resulKg+" "+ valorSimb);
    } 
    Resposta.close();
    } 
}