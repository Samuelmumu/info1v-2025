import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int idade;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Oi, me chamo Caio Samuel!");

        System.out.println("Qual é a sua idade? ");
        idade = entrada.nextInt();
        
        if (idade < 18) {
            System.out.println("Você é de menor");
        } else {
            System.out.println("Você é de maior");
        }
    }
}