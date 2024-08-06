public abstract class Pacote {
    private Visitante visitante;

    public Pacote(Visitante visitante) {
        this.visitante = visitante;
    }

    public Pacote(String descricao, double preco) {
       
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public abstract void usarBrinquedo(Brinquedo brinquedo);
}
