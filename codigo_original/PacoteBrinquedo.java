public class PacoteBrinquedo extends Pacote {
    private int brinquedosDisponiveis;

    public PacoteBrinquedo(Visitante visitante, int brinquedosDisponiveis) {
        super(visitante);
        this.brinquedosDisponiveis = brinquedosDisponiveis;
    }

    @Override
    public void usarBrinquedo(Brinquedo brinquedo) {
        if (brinquedosDisponiveis > 0 && brinquedo.isPermitido(getVisitante())) {
            System.out.println(getVisitante().getNome() + " usou o brinquedo " + brinquedo.getNome());
            brinquedosDisponiveis--;
        } else {
            System.out.println("O brinquedo " + brinquedo.getNome() + " não está disponível para "  + getVisitante().getNome());
        }
    }

    public int getBrinquedosDisponiveis() {
        return brinquedosDisponiveis;
    }

    public void setBrinquedosDisponiveis(int brinquedosDisponiveis) {
        this.brinquedosDisponiveis = brinquedosDisponiveis;
    }
}
