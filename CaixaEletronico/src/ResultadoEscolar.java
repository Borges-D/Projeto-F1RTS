public class ResultadoEscolar {
    public static void main(String[] args) {

        // Condicional composta para verificação de aprovação
        int nota = 8;

        if (nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");

            else if (nota < 8 && nota < 9)
            System.out.println("Boa, mas tem que melhorar!");

        else
            System.out.println("Reprovado");

    }
}
