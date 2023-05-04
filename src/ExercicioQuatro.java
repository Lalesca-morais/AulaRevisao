import java.util.Scanner;
public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        double polegada = 0.0254;
        double resultado = numero * polegada;

        System.out.println("O resultado é: " +resultado+ " polegadas!");
    }
}
