package contabanco;

import contabanco.br.com.dio.model.ContaTerminal;
import java.util.Scanner;

/**
 *
 * @author Danilo Saraiva
 */
public class ContaBanco {

    public static void main(String[] args) {
        char option;
        Scanner input = new Scanner(System.in);

        System.out.println("***** Bem vindo! Desafio DIO *****");

        do {
            ContaTerminal conta = new ContaTerminal();

            System.out.println("\nCriando uma nova conta!");
            System.out.print("Informe seu nome completo\n:> ");
            conta.setNomeCliente(input.nextLine());

            System.out.print("Informe o número da agência (Exemplo: 067-8)\n:> ");
            conta.setAgencia(input.nextLine());

            System.out.print("Informe o número da conta\n:> ");
            conta.setNumeroConta(input.nextInt());

            System.out.print("Informe o Saldo em conta (Exemplo: 25,00)\n:> ");
            conta.setSaldo(input.nextDouble());

            System.out.println("\n********************************");
            System.out.println("***** Mensagem do Sistema *****\n");
            System.out.println("Olá, " + conta.getNomeCliente() + ",\nObrigado por criar uma conta em nosso banco\n"
                    + "***** Dados da Conta *****"
                    + "\nAgência : " + conta.getAgencia() + ""
                    + "\nConta : " + conta.getNumeroConta() + ""
                    + "\nSaldo Atual : " + conta.getSaldo() + ""
                    + "\n********************************");

            System.out.print("Deseja criar uma nova conta? S/N\n:> ");

            input.nextLine();

            option = input.nextLine().charAt(0);

        } while (option == 'S');

        System.out.println("Programa encerrado!");
    }

}
