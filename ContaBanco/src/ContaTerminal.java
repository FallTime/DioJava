import java.util.Scanner;

public class ContaTerminal
 {
    public static void main(String[] args) throws Exception {

        try (Scanner leitura = new Scanner(System.in);){

        System.out.println("Por Favor, Insira o Número da Conta:");
        Integer numero = leitura.nextInt();
        leitura.nextLine(); // consumindo o caracter de nova linha

        System.out.println("Por Favor, Insira o Número da Agencia:");
        String agencia = leitura.nextLine(); 

        System.out.println("Por Favor, Insira o Nome do titular da conta:");
        String nomeCliente = leitura.nextLine(); 

        System.out.println("Por Favor, Insira o Saldo da conta:");
        Double saldo = leitura.nextDouble(); 

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque");
        }

    }

}
