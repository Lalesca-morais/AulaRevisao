import java.util.Scanner;
public class ExercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = sc.next();
        System.out.println(verificar(senha));
    }
    public static boolean verificar (String senha){
        int digito = 0;
        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (senha.length() < 10) {
                return false;
            }
            if (Character.isDigit(c)) {
                digito++;
            }
        }
            if (digito < 2){
                return false;
            }
            return true;
        }
    }



