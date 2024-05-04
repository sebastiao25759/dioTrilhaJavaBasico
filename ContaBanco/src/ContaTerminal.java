import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        float saldo;
        String nome;

        System.out.println("Digite o número da conta: ");
        numero = sc.nextInt();
        System.out.println("Digite a agência: ");
        agencia = sc.next();
        System.out.println("Digite o nome do titular: ");
        nome = sc.next();
        sc.nextLine();
        System.out.println("Digite o saldo: ");
        saldo = sc.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, sua conta é %d, e seu saldo %.2f já está disponível para saque.\n", nome, agencia, numero, saldo);
    }

}