import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal  extends ContaBancaria{
    public ContaTerminal(int number, String agency, String name, float balance) {
        super(number, agency, name, balance);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ContaBancaria contaTerminal = new ContaBancaria(0, null, null, 0);

        System.out.println("Digite o número da conta: ");
        contaTerminal.number = sc.nextInt();
        System.out.println("Digite a agência: ");
        contaTerminal.agency = sc.next();
        System.out.println("Digite o nome do titular: ");
        contaTerminal.name = sc.next();
        sc.nextLine();
        try{
            System.out.println("Digite o saldo: ");
            contaTerminal.balance = sc.nextFloat();
        }catch(InputMismatchException e){
            System.out.println("Digite um valor válido para o saldo e separado por virgula.");
            sc.close();
            return;
            }

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, sua conta é %d, e seu saldo %.2f já está disponível para saque.\n", contaTerminal.name, contaTerminal.agency, contaTerminal.number, contaTerminal.balance);
        
        sc.close();
        
    }
}