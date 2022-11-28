public class Jogador {

    private String nome;
    private String[] cartas;

    public Jogador(String nome, String[] cartas) {
        this.nome = nome;
        this.cartas = cartas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getCartas() {
        return cartas;
    }

    public void setCartas(String[] cartas) {
        this.cartas = cartas;
    }
}
