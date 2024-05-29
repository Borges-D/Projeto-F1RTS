public class ResultadoEscolar2 {
    public static void main(String[] args) {
        // Condição ternaria para verificação de aprovação
        int nota = 8;

        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }

    }