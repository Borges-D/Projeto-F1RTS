package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {
            "FELIPE", "JULIA", "JOAO", "MARIA", 
            "PEDRO", "ANA"
        };
        
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO.");
            }
        } while (continuarTentando && tentativasRealizadas < 3); // limite de tentativas ajustado para 3

        if (atendeu) {
            System.out.println("Candidato selecionado: " + candidato + " NA " + tentativasRealizadas + "° TENTATIVA.");
        } else {
            System.out.println("Candidato rejeitado: " + candidato + " NA " + tentativasRealizadas + "° TENTATIVA."); ;
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {
            "FELIPE", "JULIA", "JOAO", "MARIA", 
            "PEDRO", "ANA"
        };

        System.out.println("Forma abreviada da interação acima:");
        for (String candidato : candidatos) {
            System.out.println("Candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {
            "FELIPE", "JULIA", "JOAO", "MARIA", 
            "PEDRO", "ANA", "CARLOS", "DAVID", 
            "LUCAS", "BORGES"
        };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
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
