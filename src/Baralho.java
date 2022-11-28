import java.util.Random;

public class Baralho {

    private Carta[] cartas = new Carta[52];

    public Baralho(Carta[] cartas) {
        String[] numero = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] naipe = {"♣", "♠", "♥", "♦"};
    }

    public void embaralhar( ){
        Random random = new Random();
        random.nextInt(cartas.length - 1);
    }

    public void darCartas() {}

    public boolean temCarta() {
        return false;
    }

    public void imprimeBaralho() {}
}
