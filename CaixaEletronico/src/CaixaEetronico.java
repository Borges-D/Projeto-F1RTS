public class CaixaEetronico {
    public static void main(String[] args) throws Exception {
      
   //Condicional composta para verificação de saldo
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            double novoSaldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + novoSaldo);
        }

    }
}
