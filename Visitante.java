public class Visitante {
    private String nome;
    private int idade;
    private String cartao;
    private String cpf;

    public Visitante(String nome, int idade, String cartao, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cartao = cartao;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
       this.cpf = cpf;
    }
}
