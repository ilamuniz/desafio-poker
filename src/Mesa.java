import java.util.Scanner;

public class Mesa {

    public static void main(String[] args) {

        try {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Poker Game");
            System.out.println("Quantos jogadores estão na mesa (mínimo de 2 e máximo de jogadores)?");
            int numeroJogadores = leitor.nextInt();
            if (numeroJogadores < 2 || numeroJogadores > 8) {
                throw new MesaException();
            }

            Jogador[] jogadores = new Jogador[numeroJogadores];

        } catch (Exception e) {
            System.out.println(e.toString());;
        }


    }

}
