import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner (System.in);

        System.out.println("Por favor, digite o número da Agência");

        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua Conta Bancária");

        var conta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome");

        String nome = scanner.nextLine();

        System.out.println("Por favor, quanto deseja sacar?");

        var saque = scanner.nextDouble();

        System.out.printf(" Senhor(a) %s obrigado(a) por criar uma conta em nosso banco, sua Agência é a %s, conta %d e o saldo de %.2f já está disponível para saque", nome, agencia, conta, saque);
    }
}
