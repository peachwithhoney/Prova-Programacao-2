public class Brinquedo {
    private String nome;
    private int idadeMinima;
    private int idadeMaxima;

    public Brinquedo(String nome, int idadeMinima, int idadeMaxima) {
        this.nome = nome;
        this.idadeMinima = idadeMinima;
        this.idadeMaxima = idadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public int getIdadeMaxima() {
        return idadeMaxima;
    }

    public void setIdadeMaxima(int idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }

    public boolean isPermitido(Visitante visitante) {
        return visitante.getIdade() >= idadeMinima && visitante.getIdade() <= idadeMaxima;
    }
}
