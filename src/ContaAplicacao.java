public class ContaAplicacao {
    
    public static void main(String[] args) throws Exception {

        DadosDaConta dadosDaConta = new DadosDaConta();

        dadosDaConta.numeroDaAgencia(); //Solicita o numero da agencia do cliente
        dadosDaConta.Conta(); // Solicita o numero da conta do cliente
        dadosDaConta.Cliente(); // Solicita o nome do cliente
        dadosDaConta.ContaPreenchida(); // Exibie os dados da conta preenchidos

    }
}
