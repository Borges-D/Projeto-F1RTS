 import java.util.Random;
 public class ExemploDoWhile {
 
     public static void main(String[] args) {
        System.out.println("O cliente atendeu?");
        do {
            System.out.println("O cliente atendeu?");
        } while (tocando());    

        
 }
 private static boolean tocando() {
    boolean atendeu = new Random().nextInt(3) == 1;
   System.out.println("O cliente atendeu? " + atendeu);
   return ! atendeu;
 }
 }
