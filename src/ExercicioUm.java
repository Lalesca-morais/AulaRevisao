import java.util.Scanner;
public class ExercicioUm {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = ler.nextInt();
        System.out.println(comparar(numero));
    }
        public static boolean comparar ( int digito){
            final int divisao = 10;
            if (digito == 0)
            {
                return true;
            }
            while (digito != 0) {
                if (( digito % divisao) % 2!= 0){
                    return false;
                }
                digito /= 10;
            }
            return true;
        }
}