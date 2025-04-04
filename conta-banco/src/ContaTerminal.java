import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Eu nao inclui o Locale na classe Scaner, porque na minha maquina nao estah formatando corretamento
        //estah dando erro de java.util.InputMismatchException

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da agência com digito(se houver)! Ex.: 9999-9. (depois ENTER para o próximo campo)");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o numero da conta sem dígito! Ex.: 9999. (depois ENTER para o próximo campo)");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite seu nome completo! (depois ENTER para o próximo campo)");
        String nome = scanner.next();
        System.out.println("Por favor, digite o saldo! Ex.: 9999,99 (depois ENTER para o próximo campo)");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numeroConta +" e seu saldo "+ saldo +" já está disponível para saque!");
    }
}
