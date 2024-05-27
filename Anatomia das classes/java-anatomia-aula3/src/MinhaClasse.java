public class MinhaClasse {
   

    public static void main(String[] args) {

        String primeiroNome = "David";
        String segundoNome = "Lucas";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        //String meuNome = 'Lucas'; //Var atribuicao

        //int anoNascimento = 2000; // Var do tipo inteiro

       // boolean verdadeira = true;  // Var representa simNao, true e false 

        // anoNascimento = 2001; //Continua com var do tipo, so mudou o valor



        // Metodos com dois parametros
        //  int somar (int numeroUm, int numero2)


        //  String formatarCep (long cep)
        
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
            return "Resultado do metodo = " + primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
