public class PacoteTempo extends Pacote {
    private int horasDisponiveis;

    public PacoteTempo(Visitante visitante, int horasDisponiveis) {
        super(visitante);
        this.horasDisponiveis = horasDisponiveis;
    }

    
    @Override
    public void usarBrinquedo(Brinquedo brinquedo) {
        if (horasDisponiveis > 0 && brinquedo.isPermitido(getVisitante())) {
            System.out.println(getVisitante().getNome() + " usou o brinquedo " + brinquedo.getNome());
            horasDisponiveis--;
        } else {
            System.out.println("Tempo insuficiente ou brinquedo " + brinquedo.getNome() + " não é permitido para " + getVisitante().getNome());
        }
    }

    public int getHorasDisponiveis() {
        return horasDisponiveis;
    }

    public void setHorasDisponiveis(int horasDisponiveis) {
        this.horasDisponiveis = horasDisponiveis;
    }
}
