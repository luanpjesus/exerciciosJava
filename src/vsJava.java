import java.util.Scanner;

public class vsJava {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        do {
            System.out.println("Entre com o nome:");

            nome = scan.next();

            if (nome.length() >= 3) {
                infoValida = true;

            } else {
                infoValida = false;
                System.out.println("Nome precisa de no minimo 3 caracteres. ");
            }

        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com a idade:");

            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                infoValida = true;

            } else {
                infoValida = false;
                System.out.println("Idade entre 0 e 150. ");
            }

        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o salario:");

            salario = scan.nextDouble();

            if (salario > 0) {
                infoValida = true;

            } else {
                infoValida = false;
                System.out.println("Salário precisa maior que 0");
            }

        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o genero:");

            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") ||
                    sexo.equalsIgnoreCase("m") ) {
                infoValida = true;

            } else {
                infoValida = false;
                System.out.println("O genero precisa ser 'F' ou 'M'");
            }

        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite o estado civil:");

            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")) {
                infoValida = true;

            } else {
                infoValida = false;
                System.out.println("O estado civil  precisa ser 'S','C','V'ou 'M'.");
            }

        } while (!infoValida);
        
        System.out.println("As seguintes informações foram coletadas: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

    }

}
