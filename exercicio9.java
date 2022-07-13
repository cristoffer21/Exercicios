import java.util.Scanner;
import javax.swing.JOptionPane;
public class exercicio9 {
        public static void main(String[] args) {
            float n1,n2,media;
            Scanner var = new Scanner(System.in);
            String aluno;
            System.out.println("Digite a primeira nota ");
            n1 = var.nextFloat();
            System.out.println("Digite a segunda nota ");
            n2 = var.nextFloat();
            media = (n1 + n2) / 2;
            JOptionPane.showMessageDialog(null, "resultado:"+media);
        }
}
