public class ExemploForArray {
     public static void main(String[] args) {
        String alunos [] = {"João", "Maria", "Pedro", "Ana"};


        //em arrays o indice(posição) sempre começa em 0 e vai ate o tamanho do array 
        for (int x=0; x<alunos.length; x++) {  //length = tamanho o array
            System.out.println("O aluno no indice " + x + " é " + alunos[x]);
        }

     }
}
