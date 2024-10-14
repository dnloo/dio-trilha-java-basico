import java.util.Scanner;

 public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
            System.out.print("Por favor, Digite o numero da sua conta: ");
            int numero = scanner.nextInt();
        
            System.out.print("Por favor, digite o número da Agencia: ");
            String agencia = scanner.next();
            
            System.out.print("Por favor, digite o nome do Cliente: ");
            scanner.nextLine();
            String nomeCliente = scanner.nextLine();

            System.out.print("Por favor, digite o saldo da conta: ");
            double saldo = scanner.nextDouble();

            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                          "sua agência é " + agencia + ", conta " + numero +
                          " e seu saldo " + saldo + " já está disponível para saque.";
            System.out.println(mensagem);


        scanner.close();
    }
 }