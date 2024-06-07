package candidatura;

class ProcessoSeletivo {
    public static void main(String[] args) {
       analisarCandidato(1900.0);
       analisarCandidato(2000.0);
       analisarCandidato(2100.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        } else {
            System.out.println("CANDIDATO REPROVADO");
        }
    }       
}