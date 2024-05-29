public class OperadoraPlano {

    public static void main(String[] args) {

     

        // String plano = "B";

        // if (plano == "B") {
        //     System.out.println("Plano Básico, 100 Minutos de ligação");
        // } else if (plano == "M") {
        //     System.out.println("200 Minutos de ligação");
        //     System.out.println("Whats e Instagram gratis");
        // } else if (plano == "T") {
        //     System.out.println("300 Minutos de ligação");
        //     System.out.println("Whats e Instagram gratis");
        //     System.out.println("5gb Internet + Youtube");
        // }


           // Usando Switch case
           // Usando ordem decrescente de prioridade para os cases 


        String plano = "B"; //M /T


        switch (plano) {
            case "T": {
                System.out.println("5gb Internet + Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram gratis");
            }
            case "B": {
                System.out.println("Plano Básico, 100 Minutos de ligação");
            }
        }

    }
}