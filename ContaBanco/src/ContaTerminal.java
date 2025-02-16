
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int Numero;
        double Saldo;
        
            String Agencia = "";
            String NomeCliente = "";

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome do cliente:");
            NomeCliente =  scanner.nextLine();
        
            System.out.println("Digite o número da agencia: ");
            Agencia = scanner.nextLine();
        
            System.out.println("digite o número da conta:");
            Numero = scanner.nextInt();
        
            System.out.println("Digitem o valor do saldo:");
            Saldo = scanner.nextDouble();
        
            System.out.println("Olá " + NomeCliente + " obrigado por criar uma conta em nosso banco,"
                + " sua agência é " + Agencia + ", conta " + Numero +" e seu saldo " + Saldo + " já está disponível para saque ");

            scanner.close();        
    }
}
