import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner 

        Scanner scanner = new Scanner(System.in);

        //Exibir as messagens para o nosso usuário
        System.out.println("Olá, Seja bem vindo! Vamos começar:");
        System.out.println();//Linha em branco
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        String numero = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = Double.parseDouble(scanner.nextLine());

        // Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        System.out.println("Tenha um ótimo dia!!!");
    }
}
