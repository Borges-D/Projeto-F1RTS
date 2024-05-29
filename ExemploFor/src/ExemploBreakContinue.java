public class ExemploBreakContinue {

    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {

            if (numero == 3)
                continue; // quando o continue for executado, o loop vai pular o restante do loop e passar para o proximo
            System.out.println(numero);

            // Quando o break for executado, o continue vai pular o restante do loop e passar para o proximo
        }
    }

}
