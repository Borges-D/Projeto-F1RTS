import java.util.Scanner;

public class SimulacaoBancaria2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println(saldo);
                    break;
                case 2:
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saldo atual:" + saldo);
                    }
                    break;
                case 3:
                    System.out.println(saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
