import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean infoValidas = false;
        String nomeUser;
        String senha;
        do {
             

            System.out.println("Entre com o nome do usuário:");

            nomeUser = scan.next();
            System.out.println("Digite a senha :");
            senha = scan.next();
            
            //faça o codigo a seguir se a infoValildas for "verdadeiro", igual esta declarado ali encima.
            if (nomeUser.equalsIgnoreCase(senha)) {
                infoValidas = false;
                System.out.print("Senha igual ao usuário, digite novamente.");
            } else {
                infoValidas = true;
                System.out.println("Senha e usuários válidos.");
            }

            System.out.println(" Os usuário e a senha são os seguintes: " + nomeUser + " , " + senha);

        } while (!infoValidas);
    }

}