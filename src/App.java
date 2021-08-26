import java.util.Scanner;

public class App {

    
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite algo no teclado:");

        int numero = scan.nextInt();

        System.out.println("Digite outro numero no teclado no teclado:");
        int numero2 = scan.nextInt();

        int soma = numero + numero2;

        System.out.println("A soma dos numero é: " +  soma);

    }
}
