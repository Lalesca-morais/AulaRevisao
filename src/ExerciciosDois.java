import java.util.Scanner;
public class ExerciciosDois {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palavra;
        System.out.println("Digite uma palavra: ");
        palavra= entrada.nextLine();

        palavra =palavra.toLowerCase(); //transforma toda a palavra em minúsculo
        System.out.println(verificar(palavra)); //chamar
        }
        public static boolean verificar (String palavra) {
            for (int i = 0; i < palavra.length(); i++) { //length:percorre por toda a palavra
                if (!((palavra.charAt(i)=='a')|| (palavra.charAt(i)=='e') || (palavra.charAt(i)=='i')
                        || (palavra.charAt(i)=='o') || (palavra.charAt(i)=='u'))) {
                            return false; //charAT: retorna o caractere no índice especificado
            }
        }
            return true;
    }
}

