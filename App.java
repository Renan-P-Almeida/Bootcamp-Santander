import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner (System.in);

        System.out.println("Por favor, digite o número da Agência");

        var agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua Conta Bancária");

        var conta = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome");

        var nome = scanner.next();

        System.out.printf("Senhor(a) "+ nome + " obrigado(a) por criar uma conta em nosso banco, sua Agência é a " + agencia + 
        " conta %d e o seu saldo disponível para saque é de 237.48", conta);
    }
}
