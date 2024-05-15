import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite o número da sua Conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o seu Nome:");
        String nome = scanner.next();

        System.out.println("Digite o valor do seu Saldo:");
        double saldo = scanner.nextDouble();
        
        System.out.println("----------------------------------------------------");
        System.out.println("Olá " + nome +",");
        System.out.println("Obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " +agencia +", conta " +numero+".");
        System.out.println("Seu saldo " +saldo + " reais já está disponível para saque.");
    }
    
    
}
