public class MesaException extends Exception{

    private String message;

    public MesaException() {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Número de jogadores inválido. Digite um número entre 2 e 8";
    }
}
