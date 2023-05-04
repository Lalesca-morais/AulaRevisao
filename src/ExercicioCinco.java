import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 : ");
        int numero = sc.nextInt();
        System.out.println(diadasemana(numero));
    }
    public static String diadasemana(int numero) {
        String segunda = "segunda-feira";
        String terca = "terca-feira";
        String quarta = "quarta-feira";
        String quinta = "quinta-feira";
        String sexta = "sexta-feira";
        String sabado = "sabado-feira";
        String domingo = "domingo-feira";

        switch (numero) {
            case 1:
                return segunda;
            case 2:
                return terca;
            case 3:
                return quarta;
            case 4:
                return quinta;
            case 5:
                return sexta;
            case 6:
                return sabado;
            case 7:
                return domingo;
        }
        return null;
    }
}

