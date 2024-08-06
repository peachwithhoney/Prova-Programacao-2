public class Crianca extends Visitante {
    private Adulto responsavel;

    public Crianca(String nome, int idade, String cartao, String cpf, Adulto responsavel) {
        super(nome, idade, cartao, cpf);
        this.responsavel = responsavel;
    }

    public Adulto getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Adulto responsavel) {
        this.responsavel = responsavel;
    }
}
