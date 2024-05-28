public class contaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 1021;
        String agencia = "067-8";
        String nomecliente = "Mario Andrade";
        double saldo = 237.48;

        System.out.println("Olá, " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agencia é: " + agencia + " e conta: " + numero + " e seu saldo é: " + saldo);
 // Ou mesmo de outra forma: 

       System.out.println("Olá, " + nomecliente + "! obrigado por criar uma conta em nosso banco, sua agencia é: " + agencia + " e conta: " + numero + " e seu saldo é: " + String.format("%.2f", saldo));
        
    }
}
