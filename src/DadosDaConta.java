/**
 * <h1>DadosDaConta</h1>
 * 
 * A classe DadosDaConta cria uma agencia, conta e nome do usuario, 
 * e no final exibe respectivamente os dados cadastrados;
 * 
 * @author Lucas Frutuoso
 * @version 1.0
 * @since 16/02/2025
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class DadosDaConta {

    String agencia;
    int numeroDaConta;
    String nomeCliente;
    Double saldo = 540.25;

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

  
    //ESTE MÉTODO SOLICITA E ARMAZENA O NÚMERO DA AGÊNCIA DO USUÁRIO
    public void numeroDaAgencia() {
        System.out.println("Digite o número da agência: ");
        agencia = scanner.nextLine();

    }

    //ESTE MÉTODO SOLICITA E ARMAZENA O NÚMERO DA CONTA DO USUÁRIO
    public void Conta() {
        System.out.println("Digite o número da conta: ");
        numeroDaConta = scanner.nextInt();

    }

    //ESTE MÉTODO SOLICITA E ARMAZENA O NOME DO USUÁRIO
    public void Cliente() {
        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.next();

    }
    //ESTE MÉTODO RETORNA O SALDO DA CONTA DO USUÁRIO CADASTRADO
    public double saldo() {
        return saldo;
    }

    //ESTE MÉTODO EXIBE A CONTA PREENCHIDA COM OS DADOS DA AGÊNCIA, CONTA, NOME E SALDO DO USUÁRIO CADASTRADO
    public void ContaPreenchida() {
        System.out.println("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numeroDaConta + ", e o seu saldo R$" + saldo + " já está disponível para saque!.");

    }
}
