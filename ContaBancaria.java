import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "José";
        String titpoConta = "Poupança";
        double saldo = 2000.00;
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Nome Do Cliente: " + nome);
        System.out.println("Tipo Conta: " + titpoConta);
        System.out.println("Saldo atual: " + saldo);

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor\s
                4 - Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja tranferir ");
                double valor = leitura.nextDouble();
                if(valor > saldo){
                    System.out.println("Saldo insuficiente ");
                } else
                {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);
                }
            } else if (opcao == 3){
                System.out.println("Valor recebido ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao != 4){
                System.out.println("Opcao invalida");
            }
        }
    }
}
