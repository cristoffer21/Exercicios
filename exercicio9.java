import java.util.Scanner;

public class exer4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3, media;
        String aluno;
        System.out.println("Digite o nome do Aluno: ");
        aluno = ler.nextLine();
        System.out.println("Digite a primeira nota ");
        n1 = ler.nextInt();
        System.out.println("Digite a segunda nota ");
        n2 = ler.nextInt();
        System.out.println("Digite a terceira nota ");
        n3 = ler.nextInt();
        media = (n1 + n2 + n3) / 3;
        System.out.println("O aluno " + aluno + " tem media de: " + media);

    }
}
