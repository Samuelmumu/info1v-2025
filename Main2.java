import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int n1 = entrada.nextInt();

        System.out.println("Digite a segunda nota: ");
        int n2 = entrada.nextInt();

        System.out.println("Digite a terceira nota: ");
        int n3 = entrada.nextInt();

        System.out.println("Digite a quarta nota: ");
        int n4 = entrada.nextInt();
        
        int med = (n1 + n2 + n3 + n4) / 4;

        if (med < 60) {
            System.out.println("Você foi reprovado, sua média foi: " + med);
        } else {
            System.out.println("Você foi aprovado, sua média foi: " + med);
        }
        System.out.println("Samuel é lindo");
    }
}